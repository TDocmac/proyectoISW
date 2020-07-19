package com.quimio.proyecto.sillones;

class sillonNotFoundException extends RuntimeException  {
    /**
     *
     */
    private static final long serialVersionUID = -5812294544970946929L;

    sillonNotFoundException(Long id) {
        super("No se pudo encontrar el sillon de ID " + id);
      }
}