package domain;

import org.apache.commons.lang3.StringUtils;

public class Address {
	private String strasse;
	private String hausnummer;
	private String plz;
	private String ort;
	private boolean valid;
	public Address(String strasse, String hausnummer, String plz, String ort) {
		super();
		System.out.println(".... Creating Address Strasse:[ "+strasse+" ]; Hausnummer[ "+hausnummer+" ]; PLZ[ "+plz+" ]; Ort[ "+ort+" ]....");
		if(validate(strasse, hausnummer, plz, ort)){
			this.strasse = strasse;
			this.hausnummer = hausnummer;
			this.plz = plz;
			this.ort = ort;
			this.valid = true;
		}else{
			this.valid = false;
		}
		
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public boolean validate(String strasse, String hausnummer, String plz, String ort){
		boolean valid = StringUtils.isNotEmpty(strasse);
		valid &= StringUtils.isNotEmpty(hausnummer);
		valid &= StringUtils.isNotEmpty(plz);
		valid &= StringUtils.isNotEmpty(ort);
		
		return valid ;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append("\t=================================\n");
		buf.append("\tStrasse: "+strasse+"\n");
		buf.append("\tHausnummer: "+hausnummer+"\n");
		buf.append("\tPLZ: "+plz+"\n");
		buf.append("\tOrt: "+ort);
		return buf.toString();
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
