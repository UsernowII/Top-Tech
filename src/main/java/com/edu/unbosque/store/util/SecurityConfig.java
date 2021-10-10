package com.edu.unbosque.store.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Necesario para evitar que la seguridad se aplique a los resources
    //Como los css, imagenes y javascripts
    String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
    };



    // metodo recibe parametro Https y restringe las urls dependiendo el rol
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers(resources).permitAll()
                .antMatchers("/", "/index").permitAll()
                .antMatchers("/usuario/editar/**",
                                        "/usuario/eliminar/**",
                                        "/usuario/nuevo/**").access("hasRole('ADMIN')")
                    .anyRequest().authenticated()
                .and()
                    .formLogin()
                        .loginPage("/login")
                        .permitAll()
                        .defaultSuccessUrl("/usuario/listar")
                        .failureUrl("/login?error=true")
                        .usernameParameter("username")
                        .passwordParameter("password")
                .and()
                    .logout()
                        .permitAll()
                        .logoutSuccessUrl("/login?logout")
                .and()
                    .exceptionHandling().accessDeniedPage("/errores")
        ;

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123456")
                .roles("ADMIN", "USER")
                .and()
                .withUser("usuario")
                .password("{noop}123456")
                .roles("USER")
        ;
    }
}





