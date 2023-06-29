package com.pns.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GobalExceptionHandler {
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> nullpointerExpHandle(NullPointerException ne) {
		return new ResponseEntity<String>("Given String is null", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<String> HttpMessageNotReadableException(HttpMessageNotReadableException ne) {
		return new ResponseEntity<String>("please enter Intger Value", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}