package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapTest {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();

        map.put(3,"Sachithra");
        map.put(1,"Yehan");
        map.put(2,"Shazan");
        map.put(2,"Pabasith");

        map.put(4,"Sachithra");

        System.out.println(map); // no ordering guarantee

//        Map <Integer,String> map1 = new TreeMap<>();
//
//        System.out.println("Tree map");// guarantee the ordering
//        map1.put(2,"Shazan");
//        map1.put(3,"Sachithra");
//        map1.put(1,"Yehan");
//        map1.put(3,"Pabasith");
//        map1.put(4,"Sachithra");

        //System.out.println(map1);
//
//        Map <Integer,String> map2 = new LinkedHashMap<>();
//
//        System.out.println("LinkedHashMap");// guarantee the ordering
//        map2.put(2,"Shazan");
//        map2.put(3,"Sachithra");
//        map2.put(1,"Yehan");
//        map2.put(3,"Pabasith");
//        map2.put(4,"Sachithra");
//        map2.put(5,null);
//       map2.put(6,null);
//        map2.put(7,null);
////
//        System.out.println(map2);



    }
}
