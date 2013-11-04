package main;

import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Person;

public class MainClass {

	public static void main(String[] args) {
		List<Person> personen = new ArrayList<Person>();
		Address curAddress = null;
		Address nextAddress = null;
		Person curPerson = null;
		Person nextPerson = null;
		
		for(int i=0; i<5;i++){
			curAddress = createAddress("Strasse"+i, ""+(i+1), "4444"+i, "Ort"+i);
			curPerson = createPerson("Name"+i, "Vorname"+i,30+i, curAddress);
			personen.add(curPerson);

		}
		
		printPersonen(personen);
	}
	
	public static Person createPerson(String pName, String pVorname, int pAlter, Address pAdresse){
		return new Person(pName,pVorname, pAlter, pAdresse);
	}
	
	public static Address createAddress(String pStrasse, String pHausnummer, String pPLZ, String pOrt){
		return new Address(pStrasse, pHausnummer, pPLZ, pOrt);
	}
	
	
	public static void printPersonen(List<Person> personen){
		for(Person p : personen){
			System.out.println(p);
		}
	}
}
