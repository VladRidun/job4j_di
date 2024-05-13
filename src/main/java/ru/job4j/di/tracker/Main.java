package ru.job4j.di.tracker;

import ru.job4j.di.tracker.config.Context;
import ru.job4j.di.tracker.controller.ConsoleInput;
import ru.job4j.di.tracker.repository.Store;
import ru.job4j.di.tracker.service.StartUI;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        ui.add("Vlad Ridun");
        ui.print();
    }
}
