/**
 * 
 */
package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.boot.demo.model.Publisher;
import com.prodemy.boot.demo.model.Role;

import jakarta.persistence.Entity;

@Entity
@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
	 Publisher findByName(String name);

}
