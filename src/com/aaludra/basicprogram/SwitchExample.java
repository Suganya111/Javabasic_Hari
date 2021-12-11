package com.aaludra.basicprogram;
/* give a proper class name 
 * declare correct spelled variable name
 * 
 */
public class SwitchExample {

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
			daysString= "Saturday";
		break;
		default:
			daysString = "Invalid statement";
			
		}
		System.out.println(daysString);

	}

}
