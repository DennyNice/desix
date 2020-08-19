package com.example.desix.controller;

import com.example.desix.domain.LanguageMongo;
import com.example.desix.domain.LanguageMySQL;
import com.example.desix.repo.LanguageMongoRepo;
import com.example.desix.repo.LanguageMySQLRepo;
import com.example.desix.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class HomeController {

    private LanguageMongoRepo mongoRepo;
    private LanguageMySQLRepo mySQLRepo;
    private EmailService emailService;

    @Autowired
    public HomeController(LanguageMongoRepo mongoRepo, LanguageMySQLRepo mySQLRepo, EmailService emailService) {
        this.mongoRepo = mongoRepo;
        this.mySQLRepo = mySQLRepo;
        this.emailService = emailService;
    }

    @GetMapping("/nosql")
    public Iterable<LanguageMongo> getAllLanguagesByMongo() {
        return mongoRepo.findAll();
    }

    @GetMapping({"/", "/sql"})
    public Iterable<LanguageMySQL> getAllLanguagesByMySQL() {
        return mySQLRepo.findAll();
    }

    @GetMapping("/email/{subject}")
    public String sendEmail(@PathVariable("subject") String subject) {
        emailService.sendSimpleMessage(subject, "test from boot");
        return "send";
    }
}
