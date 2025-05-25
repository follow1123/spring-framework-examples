package org.example.beans.dependency.dependson;

public class Bean10 {

    public String name = "bean-10";

    public Bean10() {
        System.out.println("bean10 initializing");
    }

    @Override
    public String toString() {
        return "Bean10{" +
                "name='" + name + '\'' +
                '}';
    }
}
