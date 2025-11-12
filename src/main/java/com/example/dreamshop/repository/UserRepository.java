package com.example.dreamshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dreamshop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	    boolean existsByEmail(String email);

}
