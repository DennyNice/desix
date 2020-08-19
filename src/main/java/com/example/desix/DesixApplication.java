package com.example.desix;

import com.example.desix.domain.LanguageMongo;
import com.example.desix.domain.LanguageMySQL;
import com.example.desix.repo.LanguageMongoRepo;
import com.example.desix.repo.LanguageMySQLRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class DesixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesixApplication.class, args);
    }

    @Bean
    public CommandLineRunner preload(LanguageMySQLRepo mySQLRepo, LanguageMongoRepo mongoRepo){
        return args ->{
/*
            mySQLRepo.save(new LanguageMySQL("java","gosling", "imperative"));
            mySQLRepo.save(new LanguageMySQL("elixir","valim", "actor model"));
            mySQLRepo.save(new LanguageMySQL("scala","oderski", "functional"));
            mySQLRepo.save(new LanguageMySQL("clojure","hitch", "lisp"));

            mongoRepo.save(new LanguageMongo("java","gosling", "imperative"));
            mongoRepo.save(new LanguageMongo("elixir","valim", "actor model"));
            mongoRepo.save(new LanguageMongo("scala","oderski", "functional"));
            mongoRepo.save(new LanguageMongo("clojure","hitch", "lisp"));
*/
        };
    }
}
