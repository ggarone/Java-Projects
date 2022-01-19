package model;

public class Todo {
	private static int counter = 0;
	
	private int id;
	private boolean done;
	private String description;
	
	public Todo(String description) {
		super();
		this.done = false;
		this.description = description;
		this.id = counter++;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Todo [done=" + done + ", description=" + description + "]";
	}
	
	
	
	
}
