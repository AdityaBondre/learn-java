import java.util.Scanner;

public class calculate_days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Days:");
       int day = sc.nextInt();
       int year = (day/30)/12;
       System.out.println("Year:"+year);
       int month =  day/30;
        System.out.println("Month:"+month);
       int rday = day%30;
        System.out.println("Day:"+rday);
    }
}
