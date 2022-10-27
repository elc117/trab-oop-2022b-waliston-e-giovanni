package project;

public class Popup {
	private String tips;
	private boolean isClose;
	public Popup(String tips, boolean isClose) {
		super();
		this.tips = tips;
		this.isClose = isClose;
	}
	public Popup() {
		super();
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public boolean isClose() {
		return isClose;
	}
	public void setClose(boolean isClose) {
		this.isClose = isClose;
	}
	
	
}
