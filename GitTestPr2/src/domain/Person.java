package domain;

public class Person {
	private String name;
	private String vorname;
	private int    alter;
	private Address adresse;
	public Person(String name, String vorname, int alter, Address adresse) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
		this.adresse = adresse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public Address getAdresse() {
		return adresse;
	}
	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}
	
	
}
