package org.example.beans.dependency.dependson;

public class Bean11 {

    public String name = "bean-11";

    public Bean11() {
        System.out.println("bean11 initializing");
    }

    @Override
    public String toString() {
        return "Bean11{" +
                "name='" + name + '\'' +
                '}';
    }
}
