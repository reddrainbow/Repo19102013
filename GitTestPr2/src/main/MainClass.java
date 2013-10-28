package main;

import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.DomainHelper;
import domain.Person;

public class MainClass {

	public static void main(String[] args) {
		List<Person> personen = new ArrayList<Person>();
		Address curAddress = null;
		Person curPerson = null;
		
		for(int i=0; i<5;i++){
			curAddress = DomainHelper.createAddress("Strasse"+i, ""+(i+1), "4444"+i, "Ort"+i);
			curPerson = DomainHelper.createPerson("Name"+i, "Vorname"+i,30+i, curAddress);
			personen.add(curPerson);
			System.out.println(curPerson);
			System.out.println(curPerson);
		}

	}
	
	

}
