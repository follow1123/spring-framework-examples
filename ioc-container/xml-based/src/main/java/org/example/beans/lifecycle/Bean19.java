package org.example.beans.lifecycle;

public class Bean19 {
    public String name = "bean-19";

    public void onCreated() {
        System.out.println("Bean19.onCreated");
    }

    public void onDestroyed() {
        System.out.println("Bean19.onDestroyed");
    }

    @Override
    public String toString() {
        return "Bean19{" +
                "name='" + name + '\'' +
                '}';
    }
}
