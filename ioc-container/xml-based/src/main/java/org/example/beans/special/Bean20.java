package org.example.beans.special;

import org.springframework.context.Lifecycle;

public class Bean20 implements Lifecycle {
    private final String name = "bean-20";
    private int i;
    private final Thread thread;
    private boolean running;

    public Bean20() {
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
        System.out.println("beans-20 started");
        running = true;
        this.thread.start();
    }

    @Override
    public void stop() {
        System.out.println("beans-20 stopped");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
