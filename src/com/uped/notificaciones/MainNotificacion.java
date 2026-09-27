package com.uped.notificaciones;

import com.uped.notificaciones.modelo.*;


public class MainNotificacion {
public static void main(String[] args) {
    Notificacion n1 = new NotificacionCorreo("josseline@cortez.gmail.com", "Bienvenido al sistema.");
    Notificacion n2 = new NotificacionSMS("7725-5477", "Tu código es 1234.");
    Notificacion n3 = new NotificacionPush("POCO X6 Pro", "Tienes una nueva alerta.");

    n1.enviarMensaje();
    n1.registrarHistorial();

    n2.enviarMensaje();
    n2.registrarHistorial();

    n3.enviarMensaje();
    n3.registrarHistorial();
}
}