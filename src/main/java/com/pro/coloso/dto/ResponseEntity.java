package com.pro.coloso.dto;

import org.springframework.http.HttpStatus;

public class ResponseEntity<T> {
	
	HttpStatus httpStatus;
	T value;
	
	public ResponseEntity(){
		
	}
	
	public ResponseEntity(HttpStatus httpStatus, T value) {
		super();
		this.httpStatus = httpStatus;
		this.value = value;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
		

}
