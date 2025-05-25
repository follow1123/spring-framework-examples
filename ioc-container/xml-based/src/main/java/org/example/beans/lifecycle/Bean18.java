package org.example.beans.lifecycle;

public class Bean18 {
    public String name = "bean-18";

    public void init() {
        System.out.println("bean-18 init");
    }

    public void destroy() {
        System.out.println("bean-18 destroy");
    }

    @Override
    public String toString() {
        return "Bean18{" +
                "name='" + name + '\'' +
                '}';
    }
}