package com.donatoordep.poshibernate.model;

import java.io.Serializable;

import com.donatoordep.poshibernate.dto.UserDTO;
import com.donatoordep.poshibernate.utils.ConversibleContract;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "users")
public class User implements Serializable, ConversibleContract<UserDTO> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String login;
	private String password;

	public User() {
	}

	public User(UserDTO dto) {
		this.name = dto.getName();
		this.login = dto.getLogin();
		this.password = dto.getPassword();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public UserDTO toConvert() {
		return new UserDTO(this);
	}

}
