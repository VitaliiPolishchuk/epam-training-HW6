import java.sql.Array;
import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println(count(Arrays.asList(1,2,3,4,5,5,5)));
        System.out.println(count(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7)));
    }

    public static Set<Map.Entry<Integer,Integer>> count(List<Integer> list){
        if(list == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer val : list){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return map.entrySet();
    }
}
