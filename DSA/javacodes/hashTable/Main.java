package javacodes.hashTable;

public class Main {
    public static void main(String[] args){
        HashTable ht = new HashTable();
        ht.set("nails",100);
        ht.set("bolts",200);
        ht.set("chair",900);
        ht.set("glue",87);
        ht.set("jacket",56);
        ht.printTable();

       System.out.println(ht.get("bolts"));
       System.out.println(ht.keys());
    }
}
