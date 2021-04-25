package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import repositories.ContactRepository;

@Controller
public class ContactController {

    @Autowired
    ContactRepository contactRepo;

}
