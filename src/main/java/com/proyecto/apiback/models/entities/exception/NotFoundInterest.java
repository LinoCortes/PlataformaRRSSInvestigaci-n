package com.proyecto.apiback.models.entities.exception;

public class NotFoundInterest extends RuntimeException {
    public NotFoundInterest(String mensaje) {
        super(mensaje);
    }
}
