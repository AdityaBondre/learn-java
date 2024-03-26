public class varargs {
    static float sum(int ...arr){ //VarArgs means insert a array in method by using loop
        int result = 0;
        float average=0;
            for (int i=0; i <= arr.length-1;i++ ){     // arr.length-1 is compulsory because length is not defined
                result += arr[i];
                 average=result/arr.length;
            }
            //return result; if we want sum of the array then uncomment it and comment out the next line
            return average;
    }

    public static void main(String[] args) {
           System.out.println("Addition of 4 and 9:" + sum(4,9,5,6,3,8));
        System.out.println("Addition of 4,5 and 9:" + sum(4,5,9));

    }
}
