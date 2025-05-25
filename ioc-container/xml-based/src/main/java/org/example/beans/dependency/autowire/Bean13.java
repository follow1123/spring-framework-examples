package org.example.beans.dependency.autowire;

import org.example.beans.dependency.Bean5;
import org.example.beans.dependency.Bean6;

public class Bean13 {
    public String name = "bean-13";

    private Bean5 bean5;
    private Bean6 bean6;

    public Bean5 getBean5() {
        return bean5;
    }

    public void setBean5(Bean5 bean5) {
        this.bean5 = bean5;
    }

    public Bean6 getBean6() {
        return bean6;
    }

    public void setBean6(Bean6 bean6) {
        this.bean6 = bean6;
    }

    @Override
    public String toString() {
        return "Bean13{" +
                "name='" + name + '\'' +
                ", bean5=" + bean5 +
                ", bean6=" + bean6 +
                '}';
    }
}
