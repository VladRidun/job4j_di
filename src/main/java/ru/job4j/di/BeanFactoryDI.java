package ru.job4j.di;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class BeanFactoryDI {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition storeDefinition = BeanDefinitionBuilder.rootBeanDefinition(Store.class).getBeanDefinition();
        BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(StartUI.class).getBeanDefinition();
        defaultListableBeanFactory.registerBeanDefinition("store", storeDefinition);
        defaultListableBeanFactory.registerBeanDefinition("ui", beanDefinition);
        StartUI ui = defaultListableBeanFactory.createBean(StartUI.class);
        ui.add("Vlad Ridun");
        ui.add("Ivan ivanov");
        ui.print();
    }
}