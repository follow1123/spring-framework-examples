package org.example.beans.definition;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
    public String name = "controller-bean";

    @Override
    public String toString() {
        return "ControllerBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
