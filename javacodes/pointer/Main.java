package javacodes.pointer;

import java.util.HashMap;

class Main{
    public static void main(String args[]){
        System.out.println("hi");

        // not using pointer
        int num1 = 11;
        int num2 = num1;
        System.out.println(num1+" "+num2);
        num1=22;
        System.out.println(num1+" "+num2);

        // using pointer
        HashMap<String, Integer> map1=new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 1); // String , Integer
        map2 = map1;
        System.out.println(map1+ " < == > "+map2);
        map1.put("value", 5);
        System.out.println(map1+ " < == > "+map2);

        map3.put("value", 9);
        map2 = map3;
        System.out.println(map1+ " < == > "+map2+" < == >"+map3);
        map1 = map2;
        System.out.println(map1+ " < == > "+map2+" < == >"+map3);
        map1 = map3;
        System.out.println(map1+ " < == > "+map2+" < == >"+map3);
    }
}