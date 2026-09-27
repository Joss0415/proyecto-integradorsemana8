package com.uped.notificaciones.modelo;

public class NotificacionPush extends Notificacion {
    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando PUSH al dispositivo " + destinatario + ": " + mensaje);
    }
}