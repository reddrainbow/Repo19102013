package main;

import utils.Calculator;
import utils.MyPrinter;

public class MainClass {

	public static void main(String[] args) {
		int resultAdd = Calculator.addieren(2,3,4,5);
		MyPrinter.myPrint("Result of Addition [2,3,4,5] = "+resultAdd);
		System.out.println("Hello from HP");
	}

}
