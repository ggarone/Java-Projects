package view;

import java.util.Scanner;

import controller.TodoCtrl;

public class TodoDemo {

	private Scanner scanner;
	private TodoCtrl controller;

	public TodoDemo() {
		super();
		this.scanner = new Scanner(System.in);
		this.controller = new TodoCtrl();
	}

	public static void main(String[] args) {
		TodoDemo tl = new TodoDemo();
		boolean loop = true;

		while (loop) {
			tl.printMenu();

			int choose = tl.readUserChoice();
			switch (choose) {
			case 0: {
				loop = false;
				break;
			}
			case 1: {
				System.out.print("Input item name: \n>> ");
				String description = tl.scanner.next();
				System.out.print("Input item position:\n>> ");
				int position = tl.scanner.nextInt();
				tl.controller.addTodo(description, position);
				break;

			}
			case 2: {
				System.out.print("Input item position:\n>> ");
				int position = tl.scanner.nextInt();
				tl.controller.completeTodo(position);
				break;

			}
			case 3: {
				tl.controller.printList();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}

//		// add todo items
//		tl.controller.addTodo("latte", 0);
//		tl.controller.addTodo("pepe", 1);
//		tl.controller.addTodo("sale", 2);
//		tl.controller.addTodo("cereali", 3);
//		tl.controller.addTodo("fiesta", 0);
//		
//		// check completed todo
//		tl.controller.completeTodo(2);
//		tl.controller.completeTodo(1);
//		
//		// print todo
//		tl.controller.printList();

		System.out.println("Bye");

	}

	private int readUserChoice() {
		System.out.print(">> ");
		return this.scanner.nextInt();
	}

	private void printMenu() {
		System.out.println("1) Add todo");
		System.out.println("2) Complete todo");
		System.out.println("3) Print todo");
		System.out.println("0) exit");
	}
}
