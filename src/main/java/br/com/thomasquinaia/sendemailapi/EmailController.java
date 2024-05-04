package br.com.thomasquinaia.sendemailapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("email")
public class EmailController {
    private final EmailService emailService;

    @PostMapping
    public void sendEMail(Email email) {
        System.out.println(email);
    }
    
}
