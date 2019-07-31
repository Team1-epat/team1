
public class Test {
	private String description = null;
	private boolean isComplete = false;
	
	
	public Test(String description) {
		super();
		this.description = description;
	}
	
	public Test(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

}
