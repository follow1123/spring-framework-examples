package org.example.beans.instantiation;

public class Bean3 {
    private static final Bean3 instance = new Bean3();

    public String name;

    public Bean3() {
    }

    public static Bean3 getInstance(String name) {
        System.out.println("Bean3 custom constructor invoked");
        instance.name = name;
        return instance;
    }

    @Override
    public String toString() {
        return "Bean3{" +
                "name='" + name + '\'' +
                '}';
    }
}
