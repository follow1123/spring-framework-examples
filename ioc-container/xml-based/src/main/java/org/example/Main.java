package org.example;

import org.example.entities.Account;
import org.example.service.PetStoreServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        PetStoreServiceImpl service = context.getBean("petStore", PetStoreServiceImpl.class);
        Account account = service.getAccountById("1234");
        System.out.println(account);
    }
}
