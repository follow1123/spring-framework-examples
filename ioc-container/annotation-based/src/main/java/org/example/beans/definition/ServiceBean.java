package org.example.beans.definition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceBean {
    public String name;

    public ServiceBean() {
        this.name = "service-bean";
    }

    @Override
    public String toString() {
        return "ServiceBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
