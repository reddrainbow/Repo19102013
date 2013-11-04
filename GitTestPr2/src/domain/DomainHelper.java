package domain;

public class DomainHelper {
	public static Person createPerson(String pName, String pVorname, int pAlter, Address pAdresse){
		return new Person(pName,pVorname, pAlter, pAdresse);
	}
	
	public static Address createAddress(String pStrasse, String pHausnummer, String pPLZ, String pOrt){
		return new Address(pStrasse, pHausnummer, pPLZ, pOrt);
	} 
	
	public static Organisation createOtrganisation(String name, String rechtsform){
		return new Organisation(name, rechtsform);
	}
}
