package org.example.dao;

import org.example.entities.Item;

public class JpaItemDao {

    public Item[] getItemsByAccount() {
        return new Item[] {
                new Item("item-1"),
                new Item("item-2"),
                new Item("item-3"),
        };
    }
}
