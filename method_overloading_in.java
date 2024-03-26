public class method_overloading_in {
// in 1 class, two or more methods  it is called as method overloading
    // method overriding means same methods in different class
// a method which we use in two or more class exactly same methods that is called as methods overriding
          static void foo(){                // here we use static because it is a class which is public
            System.out.println("Good Morning bro!");         // when ever we use void method that time we cant give return value
        }

        static void foo(int a){
            System.out.println("Good morning " + a + " bro!");
        }

        static void foo(int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void foo(int a, int b, int c){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void change(int a){
            a = 62;
        }// this value will not print because user will assign their vale which they want

        static void change2(int [] arr){
            arr[0] = 64;
        } // here we value assign that's why the value of this will be print
    // there is reason which is array here that's why this value will be print
        static void tellJoke(){
            System.out.println("I invented a new word!\n" +
                    "Plagiarism!");
        }

        public static void main(String[] args) {
            tellJoke();

            // Case 1: Changing the Integer
            int [] valu = {52, 73, 77, 89, 98, 94};
            int x = 45;
            change(x);
            System.out.println("The value of x after running change is: " + x); //value of x will be cant change if we assign the value
                                                                                // if the value not assign then without input method will be run
            // Case 1: Changing the Array
            int [] marks = {52, 73, 77, 89, 98, 94};
             change2(marks);
            System.out.println("The value of x after running change is: " + marks[0]);  // value of marks will be change


            // Method Overloading
           foo(); // by using this without input value method will be print
            foo(3000); // by using this only 1 input value method will be print
            foo(3000, 4000);// by using this only 2 input value method will be print
            // Arguments are actual!


        }


}
