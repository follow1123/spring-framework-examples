package org.example.beans.special;

import org.springframework.beans.factory.BeanNameAware;

public class Bean23 implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
