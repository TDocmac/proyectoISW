package com.quimio.proyecto.salas;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class salaNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(salaNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String salaNotFoundHandler(salaNotFoundException ex) {
    return ex.getMessage();
  }
}