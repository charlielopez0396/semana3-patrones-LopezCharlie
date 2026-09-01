package edu.uees.patrones.factory;

public class CreadorSMS extends CreadorNotificador {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorSMS();
    }
}