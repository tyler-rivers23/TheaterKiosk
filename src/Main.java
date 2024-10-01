import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);
        String trash = "";

        System.out.println("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            if(age >=21)
            {
                System.out.println("You get a wristband");
            }
        }


    }
}