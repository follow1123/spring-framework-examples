package org.example.beans.definition;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryBean {

    public String name = "repository-bean";

    @Override
    public String toString() {
        return "RepositoryBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
