package view;

import java.util.Scanner;

import controller.TodoCtrl;
import model.Todo;

public class TodoDemo {

	public static void main(String[] args) {
		TodoCtrl controller = new TodoCtrl();
		String action = "";
		
		switch(action) {
			case "add":
				String s = getUserChoice();
				controller.addTodo(s);
				break;
			case "complete":
				int c = getUserChoiceCompleted();
				controller.completeTodo(c);
				break;
			case "show":
				for (Todo todo : controller.getTodos()) {
					System.out.println(todo);
				}
				break;
			case "show_comp":
				for (Todo todo : controller.getTodos()) {
					if(todo.isDone() == true)
						System.out.println(todo);
				}
				break;
			case "show_uncomp":
				for (Todo todo : controller.getTodos()) {
					if(todo.isDone() != true)
						System.out.println(todo);
				}
				break;
		}
	}
	
	public static String getUserChoice() {
		String userChoice;
		System.out.println("Add Item: /n>>");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextLine();
		sc.close();
		return userChoice;
	}
	
	public static int getUserChoiceCompleted() {
		int userChoice;
		System.out.println("Add Item: /n>>");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		sc.close();
		return userChoice;
	}

}
