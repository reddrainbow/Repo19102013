package domain;

public class Organisation {
	public Organisation(String name, String rechtsform) {
		super();
		this.name = name;
		this.rechtsform = rechtsform;
	}
	private String name;
	private String rechtsform;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRechtsform() {
		return rechtsform;
	}
	public void setRechtsform(String rechtsform) {
		this.rechtsform = rechtsform;
	}
}
