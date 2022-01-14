package com.example.demo.Contact;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServices {
    public List<ContactUs> getContactUs() {
        return List.of(
                new ContactUs(
                        "Hope",
                        "bed-com-40-19@unima.ac.mw",
                        "Hello......",
                        7
                )
        );
    }
}
