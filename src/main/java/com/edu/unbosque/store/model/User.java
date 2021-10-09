package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Getter @Setter @Column(name = "id_user")
    private Long id;

    @Getter @Setter @Column(name = "name_user")
    private String nameUser;

    @Getter @Setter @Column(name = "email_user")
    private String emailUser;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "user")
    private String nick;

	public User() {
		super();
	}

	public User(Long id, String nameUser, String emailUser, String password, String nick) {
		super();
		this.id = id;
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.password = password;
		this.nick = nick;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}


}