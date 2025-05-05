package javacodes.recursion.callStackDemo;

// call stack
public class Main {
    public static void methodThree(){
        System.out.println("Three");
    }
    public static void methodtwo(){
        methodThree();
        System.out.println("Two");
    }
    public static void methodOne(){
        methodtwo();
        System.out.println("One");
    }
    public static void main(String[] args){
        methodOne();
    }
}
