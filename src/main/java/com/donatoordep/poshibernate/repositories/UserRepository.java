package com.donatoordep.poshibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donatoordep.poshibernate.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
