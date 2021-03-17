package com.felipesilva.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesilva.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
