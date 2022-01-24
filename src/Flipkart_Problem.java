import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Flipkart_Problem {
    public static void main(String[] args) {
        int l = 0;
        // let there be 4 points 1,2,3,4,5,6,7
        // distance is given as below
        int[][] distance = {{0,1,2,3},{1,0,4,5},{2,4,0,6},{3,5,6,0}};
        int [][] visited = new int[distance.length][distance.length];
        List<Integer> start_point = new ArrayList<>();
        List<Integer>  end_point = new ArrayList<>();
            for (int i = 0; i < distance.length; i++) {
                int k = 0;
                for (int j = 0; j < distance.length; j++) {
                    if (distance[i][j] != 0 && visited[i][j] != 1) {
                        visited[i][j] = visited[j][i] = 1;
                        if (j != distance.length - 1) {
                            visited[0][j] = visited[j][0] = 1;
                        }
                        start_point.add(i + 1);
                        end_point.add(j + 1);
                        k = 1;
                        break;
                    }
                }
                if (k == 0) {
                    l = 1;
                    System.out.println("No Path Exist");
                    break;
                }
            }
       if(l!=1) {
           System.out.println("Starting Points :- ");
            System.out.println(start_point.toString());
           System.out.println("Ending Points :- ");
            System.out.println(end_point.toString());
        }
    }
}
