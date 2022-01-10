package model;

public class Todo {
	private String description;
	private boolean completed;
	
	public Todo(String description) {
		super();
		this.description = description;
		this.completed = false;
	}
	
	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [description=" + description + ", completed=" + completed + "]";
	}
	
}
