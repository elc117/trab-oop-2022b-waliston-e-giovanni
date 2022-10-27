package project;

public class Image {
	private String name;
	
	//1, 2  ou 3
	private int difficulty;
	
	private boolean used;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public Image(String name, int difficulty, boolean used) {
		super();
		this.name = name;
		this.difficulty = difficulty;
		this.used = used;
	}

	public Image() {
		
	}
	
	
}
