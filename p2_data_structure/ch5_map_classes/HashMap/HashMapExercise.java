package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {

    private static Map<Integer, String> map = new HashMap<>();

    public static Map<Integer, String> exerciseOne(int[] id, String[] item){
        for(int i = 0; i < id.length; i++){
            map.put(id[i], item[i]);
        }
        return map;
    }

    public static String exerciseTwo(int id){
        return map.getOrDefault(id, "Nothing");
    }

    public static  void main(String[] args){
       System.out.println(exerciseOne(new int[]{1, 2, 3, 4, 5}, new String[]{"Milk", "Butter", "Banana", "Pudding", "Ice cream"}));
       System.out.println(exerciseTwo(2));
    }
}
