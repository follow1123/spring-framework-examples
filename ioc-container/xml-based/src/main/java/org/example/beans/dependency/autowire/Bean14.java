package org.example.beans.dependency.autowire;

public class Bean14 {
    public String name = "bean-14";
    public Bean13 bean13;

    public Bean13 getBean13() {
        return bean13;
    }

    public void setBean13(Bean13 bean13) {
        this.bean13 = bean13;
    }

    @Override
    public String toString() {
        return "Bean14{" +
                "name='" + name + '\'' +
                ", bean13=" + bean13 +
                '}';
    }
}
