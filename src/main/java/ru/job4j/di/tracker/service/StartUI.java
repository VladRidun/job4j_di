package ru.job4j.di.tracker.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.job4j.di.tracker.controller.ConsoleInput;
import ru.job4j.di.tracker.repository.Store;

@Component
@Scope("prototype")
public class StartUI {

    private Store store;

    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        String str = consoleInput.askStr(value);
        store.add(str);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
