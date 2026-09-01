package edu.uees.patrones.factory;

public class CreadorWhatsApp extends CreadorNotificador {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorWhatsApp();
    }
}