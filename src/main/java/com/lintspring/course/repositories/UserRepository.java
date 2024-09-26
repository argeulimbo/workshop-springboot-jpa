package com.lintspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lintspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
