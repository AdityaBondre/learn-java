public class array {
    public static void main(String[] args) {
        int [] marks = {12,23,34,45,56};
        /*int  num = 23;
       for(int i=0;i <= marks.length-1;i++){
           if (num == marks[i]){
               System.out.println(num == marks[i]);
               break;
           }
           }*/
         int sum = 0;
              for(int i=0;i <= marks.length-1;i++) {
                sum = sum + marks[i];

              }
              System.out.println("Addition of Sum:"+sum/ marks.length);
    }
}
