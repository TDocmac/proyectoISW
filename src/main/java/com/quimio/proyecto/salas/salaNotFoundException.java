package com.quimio.proyecto.salas;

class salaNotFoundException extends RuntimeException {


  /**
   *
   */
  private static final long serialVersionUID = 2089113506864132050L;

  salaNotFoundException(Long id) {
      super("No se pudo encontrar sala de ID " + id);
    }
  }