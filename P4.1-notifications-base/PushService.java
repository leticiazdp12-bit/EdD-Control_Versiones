import java.util.logging.Logger;

public class PushService implements NotificationService {
    private static final Logger logger = Logger.getLogger(PushService.class.getName());

    @Override
    public void send(String message, String recipient) {
        validate(message, recipient);
        logger.info("Enviando push a " + recipient);
        // Lógica compleja de push aquí...
        System.out.println("Enviando push a " + recipient + ": " + message);
    }

    public void sendToMultiple(String message, String[] recipients) {
        for (String recipient : recipients) {
            send(message, recipient);
        }
    }

    private void validate(String message, String recipient) {
       //lógica de validación
}
}
