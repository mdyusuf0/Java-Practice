class STRING{

public static void main(String...args){

StringBuilder str = new StringBuilder("Tusuf");
//get char at index
System.out.println(str.charAt(3));


//replace char or set
str.setCharAt(0,'Y');
System.out.println(str);

//insert char at any index
str.insert(0,"Md Y");
System.out.println(str);

//delete char
str.delete(3,4);
System.out.println(str);


// add or append new char at the end of string
str.append(" Alam");
System.out.println(str);


//length
System.out.println(str.length());

//comp two string using .equals method
StringBuilder str2 = new StringBuilder("Md Tabrez Alam");
 if(str.equals(str2)){
	 System.out.println("Same String");	 
 }
 else{
	 System.out.println("Not Same");
 }
 
 
 //comp two string using .compareTo method
 
 String str1 =" IronMan";
 String str3 = "ManIron"; 
 System.out.println(str1.compareTo(str3));


//getting sub string

str.substring(5,str.length());
  System.out.println(str);

}
}
