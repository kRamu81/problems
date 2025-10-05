package Day8;

public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }
    public static int maxprofit(int[] prices){
        int max_profit = 0;
        int bestBuy = prices[0];
        for(int i=0;i<prices.length;i++){
            int curr_profit =  prices[i] - bestBuy;
            if(curr_profit > max_profit){
                max_profit = curr_profit;
            }
            if(prices[i]<bestBuy){
                bestBuy = prices[i];
            }
        }
        return max_profit;
    }
}
