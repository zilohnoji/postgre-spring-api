package com.donatoordep.poshibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.donatoordep.poshibernate.dto.UserDTO;
import com.donatoordep.poshibernate.model.User;
import com.donatoordep.poshibernate.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements GenericService<User, Long, UserDTO> {

	@Autowired
	private UserRepository repository;

	@Override
	public JpaRepository<User, Long> repository() {
		return repository;
	}

}
