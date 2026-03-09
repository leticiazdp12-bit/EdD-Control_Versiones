import java.util.logging.Logger;

public class SMSService implements NotificationService {
    private static final Logger logger = Logger.getLogger(SMSService.class.getName());

    @Override
    public void send(String message, String recipient) {
        validate(message, recipient);
        logger.info("Enviando SMS a " + recipient);
        // Lógica compleja de SMS aquí...
        System.out.println("Enviando SMS a " + recipient + ": " + message);
    }

    public void sendToMultiple(String message, String[] recipients) {
        for (String recipient : recipients) {
            send(message, recipient);
        }
    }

    private void validate(String message, String recipient) {
       //logica de validación
    }
}