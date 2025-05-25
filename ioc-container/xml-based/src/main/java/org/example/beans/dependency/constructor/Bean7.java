package org.example.beans.dependency.constructor;

import org.example.beans.dependency.Bean5;
import org.example.beans.dependency.Bean6;

public class Bean7 {

    public String name;
    public Bean5 bean5;
    public Bean6 bean6;

    public Bean7(Bean5 bean5, Bean6 bean6) {
        this.name = "bean-7";
        this.bean5 = bean5;
        this.bean6 = bean6;
    }

    @Override
    public String toString() {
        return "Bean7{" +
                "name='" + name + '\'' +
                ", bean5=" + bean5 +
                ", bean6=" + bean6 +
                '}';
    }
}
