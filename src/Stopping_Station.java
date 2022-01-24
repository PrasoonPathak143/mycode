import java.util.ArrayList;
import java.util.List;
public class Stopping_Station {
    public static void main(String[] args) {
        // distance of stations in miles as shown in map
        double[] d = {1,2,2.5,4,5,5.5,6,6.5,8,10.5,12,14};
        // let n = 3 miles i.e. bike can run 3 miles after full charge
        double n = 3;
        List<Double> stoppingDistance = new ArrayList<>();
        // can_travel shows the distance that bike can travel after being fully charged
        double can_travel = 0;
        for(int i=0; i<d.length-1; i++){
            if(d[i]<=n && d[i+1]>n){
                stoppingDistance.add(d[i]);
                can_travel =  d[i];
                n = can_travel + 3;
            }
        }
        System.out.println();
        System.out.println("Stations where he should stop in order to reach destination :-");
        System.out.println(stoppingDistance.toString());
    }
}
