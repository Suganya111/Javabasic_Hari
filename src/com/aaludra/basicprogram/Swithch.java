package com.aaludra.basicprogram;

public class Swithch {

	public static void main(String[] args) {
		int day =6;
		String daysString="";
		
		switch(day) 	{
		
		case 1:
			daysString= "Sunday";
		break;
		case 2: 
			daysString="Monday";
		break;
		case 3: 
			daysString="Tuesday";
		break;
		case 4: 
			daysString="Wendnessday";
		break;
		case 5:
			daysString = "Thursday";
		break;
		case 6:
			daysString= "Friday";
		break;
		case 7: 
			daysString= "Sturday";
		break;
		default:
			daysString = "Invalid statement";
			
		}
		System.out.println(daysString);

	}

}
