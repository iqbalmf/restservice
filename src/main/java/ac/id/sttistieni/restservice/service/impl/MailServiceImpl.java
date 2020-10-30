package ac.id.sttistieni.restservice.service.impl;

import ac.id.sttistieni.restservice.model.Mail;
import ac.id.sttistieni.restservice.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MailServiceImpl.class);

    private final JavaMailSender javaMailSender;

    @Autowired
    public MailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(Mail mail) {
        try {
            sendmail(mail);
        } catch (MailException messagingException) {
            LOGGER.error(LOGGER.getClass().getSimpleName()+messagingException.getMessage());
        }
    }

    private void sendmail(Mail email) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(email.getRecipient());
        mail.setSubject("Verifikasi Email Anda");
        mail.setText("Silahkan anda bisa menggunakan password sementara dibawah untuk login, silahkan ubah password yang diberikan untuk keamanan. Terimakasih\n" +
                "Password: "+email.getBody());
        /*
         * This send() contains an Object of SimpleMailMessage as an Parameter
         */
        javaMailSender.send(mail);
    }
}
