package DataAbstraction;

import java.util.*;

public class RibbonMain {
    static class RibbonObject {
        int id;
        int length;
        int freq;
        public RibbonObject(int id, int length, int freq) {
            this.id = id;
            this.length = length;
            this.freq = freq;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, RibbonObject> map = new HashMap<>();
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.next());
            int length = Integer.parseInt(sc.next());
            if (map.containsKey(id)) {
                RibbonObject ribbon = map.get(id);
                ribbon.length += length;
                ribbon.freq += 1;
            }
            else {
                RibbonObject ribbonObject = new RibbonObject(id, length, 1);
                map.put(id, ribbonObject);
                ids.add(id);
            }
        }
        Collections.sort(ids);
        System.out.println(map.size());
        for (Integer key : ids) {
            System.out.println(key + " " + map.get(key).length + " " + map.get(key).freq);
        }
        sc.close();
    }
}