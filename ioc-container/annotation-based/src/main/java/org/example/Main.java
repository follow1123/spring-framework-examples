package org.example;

import org.example.beans.definition.ComponentBean;
import org.example.beans.definition.ControllerBean;
import org.example.beans.definition.RepositoryBean;
import org.example.beans.definition.ServiceBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        testBeanDefinition();
    }

    private static void testBeanDefinition() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.example.beans.definition");
        ComponentBean componentBean = ctx.getBean(ComponentBean.class);
        System.out.println(componentBean);
        ControllerBean controllerBean = ctx.getBean(ControllerBean.class);
        System.out.println(controllerBean);
        ServiceBean serviceBean = ctx.getBean(ServiceBean.class);
        System.out.println(serviceBean);
        RepositoryBean repositoryBean = ctx.getBean(RepositoryBean.class);
        System.out.println(repositoryBean);
    }

}