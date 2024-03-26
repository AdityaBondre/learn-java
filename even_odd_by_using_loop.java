import java.util.Scanner;

public class even_odd_by_using_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int num = sc.nextInt();
        System.out.printf("Even Number of :%d\n", num);
        for (int i = 0; i < num; i++) { // 2i for even 0 2 4 6 8
            System.out.println(2 * i);
        }
        System.out.printf("Odd Number of :%d\n", num);
        for (int i = 0; i < num; i++){   // 2i+1 for odd 1 3 5 7 9
            System.out.println(2 * i + 1);
        }
    }
}
