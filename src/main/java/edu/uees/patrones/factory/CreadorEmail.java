package edu.uees.patrones.factory;

public class CreadorEmail extends CreadorNotificador {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorEmail();
    }
}