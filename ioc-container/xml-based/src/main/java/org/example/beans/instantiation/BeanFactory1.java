package org.example.beans.instantiation;

public class BeanFactory1 {
    private static final Bean4 bean4 = new Bean4();

    public static Bean4 getBean4() {
        System.out.println("Bean4 factory constructor invoked");
        bean4.name = "bean-4";
        return bean4;
    }

}
