package org.example;

import org.example.beans.definition.Bean1;
import org.example.beans.definition.Bean2;
import org.example.beans.dependency.autowire.Bean13;
import org.example.beans.dependency.autowire.Bean14;
import org.example.beans.dependency.autowire.Bean15;
import org.example.beans.dependency.constructor.Bean7;
import org.example.beans.dependency.constructor.Bean8;
import org.example.beans.dependency.dependson.Bean11;
import org.example.beans.dependency.lazy.Bean12;
import org.example.beans.dependency.setter.Bean9;
import org.example.beans.instantiation.Bean3;
import org.example.beans.instantiation.Bean4;
import org.example.beans.lifecycle.Bean18;
import org.example.beans.lifecycle.Bean19;
import org.example.beans.scope.Bean16;
import org.example.beans.scope.Bean17;
import org.example.events.custom.CustomEvent;
import org.example.events.custom.CustomEventTrigger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // testBeanDefinition();
        // testBeanInstantiation();
        // testBeanDependencyConstructor();
        // testBeanDependencySetter();
        // testBeanDependencyDependsOn();
        // testBeanDependencyLazyInitialized();
        // testBeanDependencyAutowire();
        // testBeanScope();
        // testBeanLifecycle();
        // testSpecialBeanLifecycle();
        // testSpecialBeanSmartLifecycle();
        // testSpecialBeanContextAware();
        // testSpecialBeanNameAware();
        // testProfile();
        // testContextListener();
        testCustomEvent();

    }

    private static void testCustomEvent() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("events/custom.xml");
        CustomEventTrigger eventTrigger = ctx.getBean("eventTrigger", CustomEventTrigger.class);
        eventTrigger.fireEvent();
    }

    private static void testContextListener() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("events/builtin.xml");
        ctx.start(); // 必须手动调用 start 方法才能触发 ContextStartedEvent

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ctx.close(); // 必须手动调用 close 方法才能触发 ContextClosedEvent
    }

    private static void testProfile() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("profile.xml");
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.refresh();
        System.out.println(ctx.getBean("bean"));

        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.refresh();
        System.out.println(ctx.getBean("bean"));
    }

    private static void testSpecialBeanNameAware() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans/special/bean-name-aware.xml");
    }

    private static void testSpecialBeanContextAware() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans/special/context-aware.xml");
    }

    private static void testSpecialBeanSmartLifecycle() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans/special/smart-lifecycle.xml");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ctx.close();
    }

    private static void testSpecialBeanLifecycle() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans/special/lifecycle.xml");
        // 使用实现 Lifecycle 接口的方式必须显示调用 start 和 close 方法
        ctx.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ctx.close();
    }

    private static void testBeanLifecycle() {
        // 不要将 bean 的 scope 设置为其他类型，默认单列就可以，不然不方便测试
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans/lifecycle.xml");
        Bean18 bean18 = ctx.getBean("bean18", Bean18.class);
        System.out.println(bean18);

        Bean19 bean19 = ctx.getBean("bean19", Bean19.class);
        System.out.println(bean19);
        ctx.registerShutdownHook();
        // ctx.close(); // 手动关闭才能触发销毁方法
    }

    private static void testBeanScope() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/scope.xml");
        Bean16 bean16a = ctx.getBean("bean16", Bean16.class);
        Bean16 bean16b = ctx.getBean("bean16", Bean16.class);
        System.out.println(bean16a == bean16b); // true

        Bean17 bean17a = ctx.getBean("bean17", Bean17.class);
        Bean17 bean17b = ctx.getBean("bean17", Bean17.class);
        System.out.println(bean17a == bean17b); // false
    }

    private static void testBeanDependencyAutowire() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/dependency/autowire.xml");
        Bean13 bean13 = ctx.getBean("bean13", Bean13.class);
        System.out.println(bean13);
        Bean14 bean14 = ctx.getBean("bean14", Bean14.class);
        System.out.println(bean14);
        Bean15 bean15 = ctx.getBean("bean15", Bean15.class);
        System.out.println(bean15);
    }

    private static void testBeanDependencyLazyInitialized() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/dependency/lazy.xml");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Bean12 bean12 = ctx.getBean("bean12", Bean12.class);
        System.out.println(bean12);
    }

    private static void testBeanDependencyDependsOn() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/dependency/dependson.xml");

        Bean11 bean11 = ctx.getBean("bean11", Bean11.class);
        System.out.println(bean11);
    }

    private static void testBeanDependencySetter() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/dependency/setter.xml");
        Bean9 bean9 = ctx.getBean("bean9", Bean9.class);
        System.out.println(bean9);
    }

    private static void testBeanDependencyConstructor() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/dependency/constructor.xml");
        Bean7 bean7 = ctx.getBean("bean7", Bean7.class);
        System.out.println(bean7);
        Bean8 bean8 = ctx.getBean("bean8", Bean8.class);
        System.out.println(bean8);
    }

    public static void testBeanDefinition() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/definition.xml");
        Bean1 bean1 = ctx.getBean("bean1", Bean1.class);
        System.out.println(bean1);

        Bean2 bean2 = ctx.getBean("bean2", Bean2.class);
        System.out.println(bean2);

        Bean2 bean22 = ctx.getBean("bean22", Bean2.class);
        System.out.println(bean22);
        System.out.println(bean2 == bean22); // true
    }

    public static void testBeanInstantiation() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/instantiation.xml");
        Bean3 bean3 = ctx.getBean("bean3", Bean3.class);
        System.out.println(bean3);

        Bean4 bean4 = ctx.getBean("bean4", Bean4.class);
        System.out.println(bean4);
    }
}
