package org.example.beans.dependency.constructor;

public class Bean8 {
    public String name;
    public int age;

    public Bean7 bean7;

    public Bean8(String name, int age, Bean7 bean7) {
        this.name = name;
        this.age = age;
        this.bean7 = bean7;
    }

    @Override
    public String toString() {
        return "Bean8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bean7=" + bean7 +
                '}';
    }
}
