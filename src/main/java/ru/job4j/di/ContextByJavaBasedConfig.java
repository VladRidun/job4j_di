package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.StartUI;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di.model");
        var ui = context.getBean(StartUI.class);
        ui.add("Vlad Ridun");
        ui.add("Ivan ivanov");
        ui.print();
    }
}