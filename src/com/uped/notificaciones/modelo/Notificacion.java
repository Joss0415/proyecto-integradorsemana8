package com.uped.notificaciones.modelo;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    // Metodo abstracto: el envío cambia según el medio
    public abstract void enviarMensaje();

    // Metodo concreto y final: el historial se registra igual para todos
    public final void registrarHistorial() {
        System.out.println("Historial guardado: Mensaje enviado a " + destinatario);
    }
}
