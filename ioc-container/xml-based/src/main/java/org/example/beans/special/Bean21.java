package org.example.beans.special;

import org.springframework.context.SmartLifecycle;

public class Bean21 implements SmartLifecycle {
    private final String name = "bean-21";
    private int i;
    private final Thread thread;
    private boolean running;

    public Bean21() {
        thread = new Thread(() -> {
            while (running) {
                System.out.println(name + " running: " + i++);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.setDaemon(false);
    }

    @Override
    public void start() {
        System.out.println("beans-21 started");
        running = true;
        this.thread.start();
    }

    @Override
    public void stop() {
        System.out.println("beans-21 stopped");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
