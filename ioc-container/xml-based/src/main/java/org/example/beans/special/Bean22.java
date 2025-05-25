package org.example.beans.special;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.time.Instant;
import java.time.LocalDateTime;

public class Bean22 implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        // System.out.println(ctx);
        System.out.println(Instant.ofEpochMilli(ctx.getStartupDate()));

    }
}
