package com.maniscalco.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "mmorgan", "Feed the cat.", new Date(), false));
		todos.add(new Todo(2, "mmorgan", "Take out the trash.", new Date(), false));
		todos.add(new Todo(3, "mmorgan", "Go shopping.", new Date(), false));
	}
	
	public void addTodo(String user, String description, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, user, description, targetDate, isDone));
	}
	
	public void delTodo(int id) {
		todos.remove(id - 1);
		--todoCount;
	}
	
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}	
		}
		return filteredTodos;
	}
}
