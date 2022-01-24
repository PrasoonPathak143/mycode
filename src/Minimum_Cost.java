class Minimum_Cost{
    static int inf = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //since we cannot go back again therefore the bottom left is infinity
        int[][] cost = {{0,100,200,300},
                {inf,0,0,100},
                {inf,inf,0,250},
                {inf,inf,inf,0}};
        System.out.println("Minimum cost required is "+ minCost(cost));
    }
    public static int minCost(int[][] cost){
        int[] dp = new int[cost.length];
        for(int i=1;i<cost.length;i++){
            dp[i] = inf;
        }
        for(int i=0;i<dp.length;i++){
            for(int j=i+1;j<dp.length;j++){
                if(dp[j]>dp[i]+cost[i][j]) dp[j] = dp[i]+ cost[i][j];
            }
        }
        return dp[dp.length-1];
    }
}
