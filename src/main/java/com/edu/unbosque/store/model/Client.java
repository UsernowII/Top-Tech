package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor

public class Client {
	
	@Id
	@Getter @Setter @Column (name = "id_client")
	private Long id;
	
	@Getter @Setter @Column (name = "name_client")
	private String nameClient;

	
	@Getter @Setter @Column (name = "phone_client")
	private String phoneClient;
	
	@Getter @Setter @Column (name = "email_client")
	private String emailClient;
	
	@Getter @Setter @Column (name = "addres_client")
	private String addresClient;


}
