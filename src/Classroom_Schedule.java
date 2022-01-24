import java.util.*;
public class Classroom_Schedule {
    public static void main(String[] args)
    {
        int start[] = {1,3,6,8,14,21};
        int end[] = {2,4,10,9,18,23};
        int n = start.length;
        System.out.println("Minimum Number of halls Required = "
                + findhall(start, end, n));
    }

    static int findhall(int start[], int end[], int n)
    {
        // Sort start times and end times arrays
        Arrays.sort(start);
        Arrays.sort(end);
        // plat_needed indicates number of platforms
        // needed at a time
        int hall_needed = 1, result = 1;
        int i = 1, j = 0;
        // Similar to merge in merge sort to process all events in sorted order
        while (i < n && j < n) {
            if (start[i] <= end[j]) {
                hall_needed++;
                i++;
            }
            else if (start[i] > end[j]) {
                hall_needed--;
                j++;
            }
            // Update result if needed
            if (hall_needed > result)
                result = hall_needed;
        }
        return result;
    }
}
