package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "id")
	private String id;

	@Column(name = "password")
	private String password;

}