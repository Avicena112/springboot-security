/**
 * 
 */
package com.prodemy.boot.demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.prodemy.boot.demo.exception.BookNotFoundException;
import com.prodemy.boot.demo.exception.PublisherAlreadyExistsException;
import com.prodemy.boot.demo.exception.PublisherNotFoundException;
import com.prodemy.boot.demo.exception.UserAlreadyExistsException;
import com.prodemy.boot.demo.model.response.HttpResponseModel;


@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({ BadCredentialsException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> handleBadCredentialException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(-989); // Sesuaikan kode status disini tergantung error atau exceptionnya apa
		model.setMessage("Password Salah !"); // Sesuaikan messagenya, disini sebagai contoh menggambil message dari exception

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(model);
	}

	@ExceptionHandler({ InsufficientAuthenticationException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> handleInsufficientAuthenticationException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(-999); 
		model.setMessage("insufficient Authentication !"); 

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(model);
	}
	
	@ExceptionHandler({ UserAlreadyExistsException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> userAlreadyExistsException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(4001); 
		model.setMessage("User already exist !"); 

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(model);
	}

	@ExceptionHandler({ BookNotFoundException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> bookNotFoundException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(4002);
		model.setMessage("Book Not Found !"); 

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}

	@ExceptionHandler({ PublisherNotFoundException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> publisherNotFoundException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(4003); 
		model.setMessage("Publisher Not Found !"); 

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}

	@ExceptionHandler({ PublisherAlreadyExistsException.class })
    @ResponseBody
	public ResponseEntity<HttpResponseModel> publisherAlreadyExistsException(Exception ex) {
		
		HttpResponseModel<Object> model = new HttpResponseModel<Object>();
		model.setStatus(4004); 
		model.setMessage("Publisher Already Exist !"); 

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(model);
	}
}
