package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import repositories.FaqRepository;

@Controller
public class FaqController {

    @Autowired
    FaqRepository faqRepo;

}
