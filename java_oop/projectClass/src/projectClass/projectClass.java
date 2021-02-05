package projectClass;

public class projectClass {
	private String name;
	private String description;
	
	public projectClass() {
		this("default name", "default desc");
	}
	
	public projectClass(String name) {
		this.name = name;
	}
	
	public projectClass(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String elevatorPitch() {
		return this.name+" : "+this.description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
