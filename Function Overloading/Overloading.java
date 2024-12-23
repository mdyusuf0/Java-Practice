public class Overloading {

  
    void greet(String name) {
        System.out.println("Hello, " + name );
    }

 
    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

   
    void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("LOOP!");
        }
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.greet("Yusuf");
        obj.greet("Yusuf", 20);
        obj.greet(5);
    }
}
