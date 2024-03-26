class MyMainEmployee{    //alt+insert for insert getter and setter
        private int id;
        private String name;
       // here method overloading also include /--> because there is 3 MyMainEmployee which is method and as per input it will work
        public MyMainEmployee(){        //Constructors
            id = 0;
            name = "Your-Name-Here";
        }
        public MyMainEmployee(String myName, int myId){  //Constructors
            id = myId;
            name = myName;
        }
        public MyMainEmployee(String myName){  //we can write any think which we want to print in object --->//Constructors
            id = 1;
            name = myName;
        }
        public String getName(){    // In getter we cant use void we use only data type
            return name;            // return is important because it is public not a void
        }
        public void setName(String n){  // In setter we  cant use data type we use only Void
            this.name = n;               // "This." is important because it is public void not only void or public
        }
        public void setId(int i){
            this.id = i;
        }
        public int getId(){
            return id;
        }
    }

    public class modifiers_constructors {
        public static void main(String[] args) {
            //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);// --> object of the method /--> it is used for do code in short
            MyMainEmployee harry = new MyMainEmployee();
            //harry.setName("CodeWithHarry");
            //harry.setId(34);
            System.out.println(harry.getId());
            System.out.println(harry.getName());



        }
    }


