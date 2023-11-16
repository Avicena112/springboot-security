
package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.boot.demo.model.Publisher;


@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
	public Publisher findByName(String name);
}
