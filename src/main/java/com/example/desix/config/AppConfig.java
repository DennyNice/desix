package com.example.desix.config;

import com.example.desix.filter.LogginFiilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("denisbarzinskiy@gmail.com");
        mailSender.setPassword("Turbo0639935241");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

    @Bean
    public FilterRegistrationBean<LogginFiilter> filterFilterRegistration() {
        FilterRegistrationBean<LogginFiilter> filterFilterRegistrationBean = new FilterRegistrationBean();

        filterFilterRegistrationBean.setFilter(new LogginFiilter());
        filterFilterRegistrationBean.addUrlPatterns("/index");

        return filterFilterRegistrationBean;
    }
}
