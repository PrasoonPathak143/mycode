// { Driver Code Starts
import java.io.*;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            //calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long crossSum(int arr[], int low, int mid, int high){
        long lsum = 0;
        long sum = 0;
        long rsum = 0;
        for(int i = 0; i<=mid; i++){
            sum = sum + arr[i];
            if(sum>lsum){
                lsum = sum;
            }
        }
        sum = 0;
        for(int i = mid+1; i<=high; i++){
            sum = sum + arr[i];
            if(sum>rsum){
                rsum = sum;
            }
        }
        return (lsum+rsum);
    }
    long maxSubarraySum(int arr[], int n){
        return maxSubarray(arr,0,n-1);
    }
    long maxSubarray(int arr[], int low, int high){
        long lsum = 0;
        long rsum = 0;
        long csum = 0;
        if(low==high){
            return arr[low];
        }
        else{
            int mid =  (high+low)/2;
            lsum = maxSubarray(arr,low,mid);
            rsum = maxSubarray(arr,mid+1,high);
            csum = crossSum(arr,low,mid,high);
        }
        return Math.max((Math.max(lsum, rsum)), csum);
    }

}