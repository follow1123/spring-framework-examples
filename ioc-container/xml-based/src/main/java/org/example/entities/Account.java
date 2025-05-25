package org.example.entities;

import java.util.Arrays;

public class Account {
    public String name;
    public Item[] items;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
