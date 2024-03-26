public class method_in {
        static int logic(int x, int y){   // when ever we use static method that time we need to give return value
                                           // method are alway in the class
            // 2 types of class which is made by own and second pre defined such like method_in it is a class
            int z;                        // 3 type of method which are public,static,and public static
            if(x>y){
                z = x+y;
            }
            else {
                z = (x +y) * 5;
            }
            x = 566;
            return z;
        }

        public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c;
            c = logic(a, b);  // we want to call method then we need to write method name (logic()) with bracket and if we want give input then write input in bracket
            System.out.println(a + " "+ b);
            int a1 = 2;
            int b1 = 1;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);
        }


}
