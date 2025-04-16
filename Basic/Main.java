
// first program
//class MyClass1{
//    public static void main(String []args){
//        System.out.println("Hello world!");
//    }
//}


// second program

//class MyClass2{
//    public static void main(String []args){
//        System.out.println("Number series: ");
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }
//    }
//}


// Third Program

//class MyClass3{
//    public  static  void main(String []args){
//        int a=10;
//        int b=20;
//        int c=a+b;
//        System.out.println("sum is : "  + c);
//    }
//}

// fourth program

//class PrimitiveTypes {
//    public static void main(String[] args) {
//        // Integer types
//        byte age = 25;
//        short year = 2024;
//        int salary = 50000;
//        long population = 7900000000L;
//
//        // Floating-point types
//        float pi = 3.14f;
//        double g = 9.80665;
//
//        // Character type
//        char grade = 'A';
//
//        // Boolean type
//        boolean isJavaFun = true;
//
//        System.out.println("Age: " + age);
//        System.out.println("Year: " + year);
//        System.out.println("Salary: " + salary);
//        System.out.println("Population: " + population);
//        System.out.println("Pi: " + pi);
//        System.out.println("Gravity: " + g);
//        System.out.println("Grade: " + grade);
//        System.out.println("Is Java Fun? " + isJavaFun);
//    }
//}


//fifth program

//class StringAndNonPrimitives {
//    public static void main(String[] args) {
//        // String (non-primitive)
//        String name = "Shaukat Ali";
//        String greeting = "Hello, " + name + "!";
//
//        System.out.println(greeting);
//
//        // Arrays
//        int[] marks = {85, 90, 78};
//        System.out.println("First subject marks: " + marks[0]);
//    }
//}

// java-basics/variables-and-datatypes/03_VariableScopes.java


// sixth program

//class VariableScopes {
//    int instanceVar = 10; // Instance variable
//    static int staticVar = 20; // Static variable
//
//    public void printVariables() {
//        int localVar = 30; // Local variable
//        System.out.println("Instance Var: " + instanceVar);
//        System.out.println("Static Var: " + staticVar);
//        System.out.println("Local Var: " + localVar);
//    }
//
//    public static void main(String[] args) {
//        VariableScopes obj = new VariableScopes();
//        obj.printVariables();
//    }
//}


// seventh program

//class TypeCasting {
//    public static void main(String[] args) {
//        // Implicit casting (small to big)
//        int x = 100;
//        long y = x;
//
//        // Explicit casting (big to small)
//        double pi = 3.14159;
//        int approxPi = (int) pi;
//
//        System.out.println("Long y: " + y);
//        System.out.println("Approximate Pi: " + approxPi);
//    }
//}