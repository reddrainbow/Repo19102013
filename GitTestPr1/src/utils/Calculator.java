package utils;

public class Calculator {
	public static int addieren(int... args2Add ){
		int result = 0;
		for(Integer i : args2Add){
			result += i;
		}
		return result;
	}
	
}
