import java.util.*;
public class Assignment_Problem {
    public static void main(String[] args) {
        int[] due = {1,2,5,7,9};
        int[] fine = {3,5,6,2,7};
        System.out.println("Most Optimal order will be : ");
        System.out.println(minPenalty(due,fine));
    }
    public static List minPenalty(int[] due, int[] penalty){
        int n = due.length;
        List<Integer> res = new ArrayList<>();
        Map<Integer,Double> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,due[i]/(double)penalty[i]);
        }
        LinkedHashMap<Integer,Double> greedy = sortMap(map);
        for(int e:greedy.keySet()){
            res.add(e);
        }
        return res;
    }
    public static LinkedHashMap sortMap(Map map) {
        List<Map.Entry<Integer, Double>> list = new
                ArrayList<>(map.entrySet());
        LinkedHashMap<Integer,Double> res = new LinkedHashMap<>();
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Double> o1,
                               Map.Entry<Integer, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry e:
                list) {
            res.put((int)e.getKey(),(double)e.getValue());
        }
        return res;
    }
}
