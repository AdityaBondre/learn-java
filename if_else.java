import java.util.Scanner;
// if else votting eligibility
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        if (18 <= age) {
            System.out.println("Your are Adult");
        } else {
            System.out.println("Your are not Adult");
        }

    }
}
