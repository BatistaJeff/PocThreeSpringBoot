package com.poc.ws.services.email;

import com.poc.ws.domain.User;
import com.poc.ws.domain.VerificationToken;

import javax.mail.internet.MimeMessage;

public interface EmailService {

    void sendHtmlEmail(MimeMessage msg);
    void sendConfirmationHtmlEmail(User user, VerificationToken vToken);

}
