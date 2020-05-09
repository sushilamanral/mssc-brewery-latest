package sushilamanral.msscbrewerylatest.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class MVCExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
	
			List<String> errors = new ArrayList<>(e.getConstraintViolations().size());
			e.getConstraintViolations().forEach(conVoilation -> {
				errors.add(conVoilation.getPropertyPath()+" : "+conVoilation.getMessage());
			});
			
			return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(BindException.class)
	public ResponseEntity<List> handleBindingException(BindException ex) {
		return new ResponseEntity<List>(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
	}
}
