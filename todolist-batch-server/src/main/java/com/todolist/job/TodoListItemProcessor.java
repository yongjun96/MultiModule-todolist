package com.todolist.job;

import com.todolist.domain.todolist.TodoList;
import org.springframework.batch.item.ItemProcessor;

public class TodoListItemProcessor implements ItemProcessor<TodoList, TodoList> {

    @Override
    public TodoList process(TodoList todoList) throws Exception {
        // Admin.setAdminName("Admin.getAge() + 10");
        return todoList;
    }
}
