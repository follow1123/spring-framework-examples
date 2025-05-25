package org.example.beans.definition;

public class Bean1 {
    public String name;

    public Bean1() {
        this.name = "bean-1";
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "name='" + name + '\'' +
                '}';
    }
}
