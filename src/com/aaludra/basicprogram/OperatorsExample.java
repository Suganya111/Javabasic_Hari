package com.aaludra.basicprogram;
/*System.out.println(" ") or also used \n in the statement at the end 
 * valid to specify a proper class name
 */
public  class OperatorsExample {
	static void unaryOperators() {
		int x=10;  
		int y =20; 
		boolean c=true;  
		boolean d=false;  
		System.out.println("One's complement operato "+ ~x); 
		System.out.println("One's complement operato "+ ~y); 
		System.out.println("\n");
		System.out.println("Logical negation operator " + !c); 
		System.out.println("Logical negation operator" + !d);
		System.out.println("\n");
		System.out.println("Increment operator = " + x++); 
		System.out.println("Prefix increment operator " + ++x); 
		System.out.println("\n");
		System.out.println("Decrement operator = "+ x--);  
		System.out.println("Prefix decrement operator" + --x);  
		System.out.println("\n");
	}
	static void arithmeticOperators() {
		int a = 5;
		int b= 25;
		int c = a+b;
		int s= b-a;
		int m= a*b;
		int d= b/ a;
		double mod =b%a;
		System.out.println("a= 5 and b= 25");
		System.out.println("  a - b= " + s);
		System.out.println("  a * b = " + m);
		System.out.println("  a + b = " + c);
		System.out.println("  b / a = " + d);
		System.out.println(" b % a" + mod);
		System.out.println("");
		
	}
	static void shiftOperator() {
		System.out.println("Right shift operator =" + (10>>2));
		System.out.println("Left shift operator =" + (10<<2));
		System.out.println("\n");
	}
	static void relationalOperator() {
		int a= 10;
		int b=10;
		int c= 30;
		System.out.println("Relational operator ");
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(b<=c);
		System.out.println(a>=c);
		System.out.println(a==b);
		System.out.println(a!=c);
		System.out.println("\n");
		
	}
	static void logicalOperator() {
		int a =10;
		int b= 20;
		int c =  3;
		System.out.println(a>b&& b>c);
		System.out.println(a<c||b>c);
		System.out.println("\n");
		
	}
	static void ternaryOperator() {
		int a=12;
		int b= 50;
		int c= 15;
		int min = (a<b)?c-a:a+b;
		System.out.println(min);
		System.out.println("\n");
		
		
	}
	static void AssignmentOperator() {
		int a=10;
		a+=5;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		a*=5;
		System.out.println(a);
		a/=5;
		System.out.println(a);
		a&=5;
		System.out.println(a);
		a%=2;
		System.out.println(a);
	}

	public static void main(String[] args) {
		unaryOperators();
		arithmeticOperators();
		shiftOperator();
		relationalOperator();
		logicalOperator();
		ternaryOperator();
		AssignmentOperator();

	}

}
