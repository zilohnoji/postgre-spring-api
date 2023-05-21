package com.donatoordep.poshibernate.dto;

import java.io.Serializable;

import com.donatoordep.poshibernate.model.User;
import com.donatoordep.poshibernate.utils.ConversibleContract;

public class UserDTO implements Serializable, ConversibleContract<User> {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String login;
	private String password;

	public UserDTO() {
	}

	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.login = entity.getLogin();
		this.password = entity.getPassword();
	}

	public UserDTO(Long id, String name, String login, String password) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
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
	public User toConvert() {
		return new User(this);
	}

}
