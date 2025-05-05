package javacodes.problems.toFindWhetherAnyCommonNoIn2Arrays;

public class Main {
    public static void main(String[] args){
        int[] array1={1,2,3};
        int[] array2={6,4,3};

        ItemInCommon it =new ItemInCommon();

        // Not Efficient way
        System.out.println(" By Using Not efficient way i.e nested forloop "+it.itemincommonWithoutEfficientWay(array1,array2));

        //Efficient way
        System.out.println(" By Using efficient way i.e hashMap "+it.itemincommonWithEfficientWay(array1,array2));

    }
}
