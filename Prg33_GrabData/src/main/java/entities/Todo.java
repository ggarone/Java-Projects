package entities;

import java.time.LocalDateTime;

public class Todo {
	private int id;
	private int userId;
	private String title;
	private LocalDateTime dueOn;
	private String status;
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public Todo(int id, int userId, String title, LocalDateTime dueOn, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.dueOn = dueOn;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getDueOn() {
		return dueOn;
	}

	public void setDueOn(LocalDateTime dueOn) {
		this.dueOn = dueOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", userId=" + userId + ", title=" + title + ", dueOn=" + dueOn + ", status=" + status
				+ "]";
	}
}
