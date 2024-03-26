import java.util.Scanner;

public class calculate_persentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SUB1");
        int sub1 = sc.nextInt();

        System.out.println("Enter SUB2");
        int sub2 = sc.nextInt();
        System.out.println("Enter SUB3");
        int sub3 = sc.nextInt();
        System.out.println("Enter SUB4");
        int sub4 = sc.nextInt();
        System.out.println("Enter SUB5");
        int sub5 = sc.nextInt();
        float sum = sub3+sub2+sub1+sub5+sub5;
        System.out.println(sum);
        int total = 500;
        float per = (100*sum/total);
        // when ever we want to print vale of for,ula that time we use ++ in between
        System.out.print("Persantage of 5 Subject:" +per+ "%");
        //System.out.println(per);
    }
}

