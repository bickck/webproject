package com.pro.coloso.handlerException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.pro.coloso.dto.ResponseDTO;

@ControllerAdvice
@RestController
public class HandlerController {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseDTO<String> handlerException(IllegalArgumentException argumentException){
		return new ResponseDTO<String>(HttpStatus.INTERNAL_SERVER_ERROR,argumentException.getMessage());
	}
	
	
}
