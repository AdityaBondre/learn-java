import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class program1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your first Number:");
            int a = sc.nextInt();

            System.out.println("Enter your Second Number:");
            int b = sc.nextInt();

            int sum = a + b;
            int sum1 = a - b;
            int sum2 = a * b;
            float sum3 = a / b;

            System.out.print("Sum of A+B:");
            System.out.println(sum);

            System.out.print("Sum of A-B:");
            System.out.println(sum1);

            System.out.print("Sum of A*B:");
            System.out.println(sum2);

            System.out.print("Sum of A/B:");
            System.out.println(sum3);

        }
    }
}
