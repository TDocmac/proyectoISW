package com.quimio.proyecto.sillones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class sillonNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(sillonNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String sillonNotFoundHandler(sillonNotFoundException ex) {
    return ex.getMessage();
  }
}