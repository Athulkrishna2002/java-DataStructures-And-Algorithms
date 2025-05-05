package javacodes.problems.toFindWhetherAnyCommonNoIn2Arrays;

import java.util.HashMap;

public class ItemInCommon{

    // Not Efficient way
    public boolean itemincommonWithoutEfficientWay(int[] array1, int[] array2){
        for(int i :array1){
            for (int j:array2){
                if (i==j){
                    return true;
                }
            }
        }
        return false;
    }

    // Efficient way
    public boolean itemincommonWithEfficientWay(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap=new HashMap<>();
        for(int i : array1){
            myHashMap.put(i,true);
        }
        for (int j:array2){
            if(myHashMap.get(j) != null){
                return true;
            }
        }
        return false;
    }
}
