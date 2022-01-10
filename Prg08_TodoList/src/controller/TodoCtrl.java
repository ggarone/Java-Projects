package controller;

import model.Todo;

public class TodoCtrl {
	private Todo[] list;

	public TodoCtrl() {
		super();
		this.list = new Todo[10];
	}
	
	public void addTodo(String description, int position) {
		Todo temp = new Todo(description);
		this.list[position] = temp;
	}
	
	public void printList() {
		for (int i = 0; i < list.length; i++) {
			if(list[i] == null)
				break;
			if(list[i].isCompleted()) {
				System.out.print("[x]");
			}
			else {
				System.out.print("[ ]");
			}
			System.out.println(list[i].getDescription());
		}
	}
	
	public void completeTodo(int position) {
		if(list[position] != null) {
			list[position].setCompleted(true);
		}
	}
	
	
}
