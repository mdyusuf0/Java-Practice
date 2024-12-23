//count character in a string

// input =aaabbbcccccc
//output = 12




//Declare string
//convert into char array
//get the length of array
//print output

public class Count
{  public static void main(String[] args) {
      
String alphabets = "Java is a popular general-purpose programming language which was originally developed by James Gosling at Sun Microsystems (later acquired by Oracle). Java is fast, secure, and reliable. It is widely used for developing desktop and mobile applications, embedded systems, game consoles, supercomputers, big data processing, and so on. According to Oracle, Java runs on 3 billion devices worldwide, which makes it one of the most popular programming languages.";


char[] chars= alphabets.toCharArray();

int alphabets_count = chars.length;

System.out.println(alphabets_count);

}
}