package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("数学",99);
        map.put("英语",98);
        map.put("语文",97);
        map.put("物理",96);
        map.put("化学",95);
        map.put("生物",99);
        System.out.println(map);
    }
}
