import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class CoinProblem {
    public static long minCoin(Integer [] arr, long noOfCoin, long totalCost, int index){
        if(totalCost==0){
            return noOfCoin;
        }
        noOfCoin = noOfCoin + totalCost/arr[index];            // selecting highest coins as much a possible
        totalCost = totalCost % arr[index];                    // remaining cost when highest coin has been selected
        return minCoin(arr,noOfCoin,totalCost,index+1);   // then for second highest coin and it goes on
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(arr,Collections.reverseOrder());     // reversing the array in decreasing order
        System.out.print("Enter the cost :- ");
        long cost = sc.nextLong();
        long minCoins = minCoin(arr,0,cost,0);
        System.out.println("Minimum number of coins required to make a payment of " + cost + " Rupees is :- " + minCoins);
    }
}
