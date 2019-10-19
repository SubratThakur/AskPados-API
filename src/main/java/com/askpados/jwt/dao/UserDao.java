package com.askpados.jwt.dao;

import com.askpados.jwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
	User findByUsername(String username);
	
}
