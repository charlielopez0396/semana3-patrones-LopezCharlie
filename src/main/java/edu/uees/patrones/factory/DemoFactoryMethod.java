package edu.uees.patrones.factory;

public class DemoFactoryMethod {

    public static void main(String[] args) {

        CreadorNotificador creadorEmail = new CreadorEmail();
        creadorEmail.notificar(
            "estudiante@correo.com",
            "Su tutoría ha sido reservada correctamente."
        );

        CreadorNotificador creadorSMS = new CreadorSMS();
        creadorSMS.notificar(
            "0999999999",
            "Recordatorio: tiene una tutoría programada."
        );

        CreadorNotificador creadorWhatsApp = new CreadorWhatsApp();
        creadorWhatsApp.notificar(
            "0999999999",
            "Su tutoría fue confirmada."
        );

        CreadorNotificador creadorPush = new CreadorPush();
        creadorPush.notificar(
        "estudiante@correo.com",
        "Tiene una nueva actualización sobre su tutoría."
        );
    }
}