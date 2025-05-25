package org.example.beans.dependency.setter;

import org.example.beans.dependency.Bean5;

public class Bean9 {
    private String name;

    private Bean5 bean5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bean5 getBean5() {
        return bean5;
    }

    public void setBean5(Bean5 bean5) {
        this.bean5 = bean5;
    }

    @Override
    public String toString() {
        return "Bean9{" +
                "name='" + name + '\'' +
                ", bean5=" + bean5 +
                '}';
    }
}
