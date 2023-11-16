/**
 * 
 */
package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.boot.demo.model.User;

import jakarta.persistence.Entity;

@Entity
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByEmail(String email);
}
