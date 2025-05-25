package org.example.beans.dependency.lazy;

public class Bean12 {
    public String name = "bean-12";

    public Bean12() {
        System.out.println("bean12 initializing");
    }

    @Override
    public String toString() {
        return "Bean12{" +
                "name='" + name + '\'' +
                '}';
    }
}
