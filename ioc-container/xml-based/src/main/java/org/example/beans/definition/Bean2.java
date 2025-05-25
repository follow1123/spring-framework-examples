package org.example.beans.definition;

public class Bean2 {
    public String name;

    public Bean2() {
        this.name = "bean-2";
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "name='" + name + '\'' +
                '}';
    }
}
