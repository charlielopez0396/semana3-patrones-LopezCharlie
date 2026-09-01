package edu.uees.patrones.factory;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println(
            "SMS enviado a " + destinatario + ": " + mensaje
        );
    }
}