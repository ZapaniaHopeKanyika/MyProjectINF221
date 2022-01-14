package com.example.demo.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ContactUs")
public class ContactController {
     private final ContactServices contactService;

     @Autowired
    public ContactController(ContactServices contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<ContactUs> getContactUs() {
          return contactService.getContactUs();
    }
}