package edu.uees.patrones.factory;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println(
            "Mensaje de WhatsApp enviado a " + destinatario + ": " + mensaje
        );
    }
}