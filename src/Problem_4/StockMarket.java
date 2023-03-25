package Problem_4;

public class StockMarket {

    public int maxProfit(int[] prices) {
        int[] maxSp=new int[prices.length];
        int max=Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            max=Math.max(max,prices[i]);
            maxSp[i]=max;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int profit=maxSp[i]-prices[i];
            ans=Math.max(ans,profit);
        }
        return ans;
    }
}
