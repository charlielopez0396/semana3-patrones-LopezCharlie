package edu.uees.patrones.factory;

public class CreadorPush extends CreadorNotificador {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorPush();
    }
}