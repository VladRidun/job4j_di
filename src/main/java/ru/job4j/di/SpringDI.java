package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.tracker.controller.ConsoleInput;
import ru.job4j.di.tracker.repository.Store;
import ru.job4j.di.tracker.service.StartUI;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Vladislav Ridun");
        ui.add("Artem Ridun");
        ui.print();
    }
}
