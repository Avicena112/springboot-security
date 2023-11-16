/**
 * 
 */
package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.prodemy.boot.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

}
