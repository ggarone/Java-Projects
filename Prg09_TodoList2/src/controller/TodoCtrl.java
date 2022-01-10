package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {
	private ArrayList<Todo> lista = new ArrayList<>();

	public TodoCtrl() {
		super();
		this.lista = new ArrayList<>();
	}
	
	public void addTodo(String description) {
		Todo temp = new Todo(description);
		this.lista.add(temp);
	}
	
	public void printList() {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) == null)
				break;
			if(lista.get(i).isCompleted()) {
				System.out.print("[x]");
			}
			else {
				System.out.print("[ ]");
			}
			System.out.println(lista.get(i).getDescription());
		}
	}
	
	public void completeTodo(int position) {
		if(lista.get(position) != null) {
			lista.get(position).setCompleted(true);
		}
	}
	
	
}
