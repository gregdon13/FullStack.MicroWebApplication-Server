package controllers;


import entities.Faq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import repositories.FaqRepository;

@Controller
public class FaqController {

    @Autowired
    FaqRepository faqRepo;

//    @GetMapping
//    public ResponseEntity<Iterable<Faq>> getAllFaqs(){
//        Iterable<Faq> allFaqs = faqRepo.findAll();
//        return new ResponseEntity<>(allFaqs, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/faqs", method = RequestMethod.POST)
//    public ResponseEntity<?> createFaq(@ResponseBody Faq faq){
//        faq = faqRepo.save(faq);
//    }

}
