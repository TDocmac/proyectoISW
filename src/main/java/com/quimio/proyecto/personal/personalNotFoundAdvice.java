package com.quimio.proyecto.personal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class personalNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(personalNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String personalNotFoundHandler(personalNotFoundException ex) {
    return ex.getMessage();
  }
}