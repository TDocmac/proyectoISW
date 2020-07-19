package com.quimio.proyecto.personal;

class personalNotFoundException extends RuntimeException {

    /**
   *
   */
  private static final long serialVersionUID = -6954326376369378549L;

  personalNotFoundException(Long id) {
      super("No se pudo encontrar personal de ID " + id);
    }
  }