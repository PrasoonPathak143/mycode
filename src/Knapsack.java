import java.util.*;
class Knapsack{
    public static void main(String[] args) {
        int[] weight = {10,20,30};
        int[] cost = {60,100,120};
        int target = 50;
        System.out.println(knapsack(weight,cost,target));
    }
    //Brute force
    public static int knapsack(int[] weight,int[] cost, int target){
        int maxVal = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<cost.length;i++){
            map.put(weight[i], cost[i]);
        }
        List<List<Integer>> res = possibleSets(weight,target);
        for(int i=0;i<res.size();i++){
            int sum = 0;
            for(int e : res.get(i)){
                sum += map.get(e);
            }
            maxVal = Math.max(maxVal,sum);
        }
        return maxVal;
    }
    public static List<List<Integer>> possibleSets(int[] arr,int target){
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        recursiveSets(arr, 0, current,res);
        for(int i=0;i<res.size();i++){
            int sum =0;
            for(int e : res.get(i)){
                sum += e;
            }
            if(sum>target) res.remove(i);
        }
        return res;
    }
    private static void recursiveSets(int[] arr, int i, List<Integer>
            current, List<List<Integer>> res) {
        if(i== arr.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[i]);
        recursiveSets(arr,i+1,current,res);
        current.remove(current.size()-1);
        recursiveSets(arr,i+1,current,res);
    }
}
