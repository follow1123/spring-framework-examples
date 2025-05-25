package org.example.beans.dependency.autowire;

import org.example.beans.dependency.Bean5;

public class Bean15 {
    public String name = "bean-14";
    public Bean13 bean13;
    public Bean5 bean5;

    public Bean15(Bean13 bean13, Bean5 bean5) {
        this.bean13 = bean13;
        this.bean5 = bean5;
    }

    @Override
    public String toString() {
        return "Bean15{" +
                "name='" + name + '\'' +
                ", bean13=" + bean13 +
                ", bean5=" + bean5 +
                '}';
    }
}
