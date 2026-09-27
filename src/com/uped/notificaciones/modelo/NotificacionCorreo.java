package com.uped.notificaciones.modelo;

public class NotificacionCorreo extends Notificacion {
    public NotificacionCorreo(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando CORREO a " + destinatario + ": " + mensaje);
    }
}
