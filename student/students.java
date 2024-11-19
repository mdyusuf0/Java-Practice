import java.util.Scanner;

class Students {
    public static void main(String[] args) {
        String[] student = {"yusuf", "meraj", "kaif", "tufail", "dhoni", "kohli"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no of student:");

        int rollNumber = sc.nextInt();

        if (rollNumber >= 0 && rollNumber < student.length) {
            System.out.println("Name of the student is: " + student[rollNumber]);
        } else {
            System.out.println("Invalid roll number.");
        }

       
    }
}
