import java.util.logging.Logger;

public class EmailService implements NotificationService {
    private static final Logger logger = Logger.getLogger(EmailService.class.getName());

    @Override
    public void send(String message, String recipient) {
        validate(message, recipient);
        logger.info("Enviando email a " + recipient);
        // Lógica compleja de email aquí
        System.out.println("Enviando email a " + recipient + ": " + message);
    }

    public void sendToMultiple(String message, String[] recipients) {
        for (String recipient : recipients) {
            send(message, recipient);
        }
    }

    private void validate(String message, String recipient) {
        //logica de validacion
    }
}