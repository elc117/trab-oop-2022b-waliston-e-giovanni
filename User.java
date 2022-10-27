package project;

public class User {
	private String name;
	private int points;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public User(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	public User() {
		
	}
	
	public void correct() {
		this.points = this.points + 100;
	}
	
}
