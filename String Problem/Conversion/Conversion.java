//Conversion inn java (String)

public class Conversion{
	int convrsn(){
			String str = "124";
			String str2 = "23";
			System.out.println("String: "+ str + str2);
			Integer num = Integer.parseInt(str);
			Integer num1 = Integer.parseInt(str2);
			System.out.println("Addition of both strings: " +(num + num1));	
			System.out.println();
			return 0;
					
		}
	
	public static void main(String...args){
		//implicit conversion
		// Java automatically converts smaller data types to larger data types. This is known as widening.
		
		
		//int to double
		Integer in  = 200;
		double doub = in;
		System.out.println("Integer : "+ in);
		System.out.println("Integer to double: "+ doub);
	    System.out.println();
		
		
		//double to int 
		Double D= new Double(109.345);
		int I= D.intValue();
		  System.out.println("Double to int using .intvalue: " + I);
		  System.out.println();
		Double DO= 109.345;
	    int INTT= (int)Math.floor(DO);
		System.out.println("using math.floor method" + INTT);
		System.out.println();
		
		
		//explicit conversion
		float f = 102.35f;
			System.out.println("Float: "+ f);
		Integer INT = (int)f;
		System.out.println("Float to Double: "+ INT);
	    System.out.println();
		
		 
		//int to string
		Conversion obj = new Conversion();
		int num2 = 123;
		String str = String.valueOf(num2);
		System.out.println("Integer: " + num2);
		System.out.println("String value is: " + str); 
		System.out.println();
		//string to integer
		obj.convrsn();	
		System.out.println();
		
		
		
		//Boolean to integer
		Boolean b = false;
		int value= b?1:0;
		System.out.println("Boolean: " + b);
		System.out.println("Value of boolean in integer: " + value);
		System.out.println();
		
		
		//int to boolean
		int d=0;
		Boolean bool = (d==1)?true:false;
		System.out.println("integer : " + d);
		System.out.println("Boolean : " + bool);
		System.out.println();
	}
}