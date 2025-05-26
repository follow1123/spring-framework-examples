package org.example.beans.definition;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
    public String name;

    public ComponentBean() {
        this.name = "component-bean";
    }

    @Override
    public String toString() {
        return "ComponentBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
