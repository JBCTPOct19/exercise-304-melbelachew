package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TodoRepository repository;
    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo = new Todo("Complete Exercise_304", "10/08/2019", 5);
        repository.save(todo);

        todo = new Todo("Complete Exercise_401", "10/08/2019", 4);
        repository.save(todo);

        todo = new Todo("Complete Exercise_402", "10/08/2019", 3);
        repository.save(todo);

    }
}
