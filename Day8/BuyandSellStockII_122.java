package Day8;

public class BuyandSellStockII_122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyandsell2(prices));

    }
    public static int buyandsell2(int[] prices){
        int n = prices.length;
        int maxProfit =0;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                maxProfit += prices[i+1]-prices[i];
            }
        }
        return maxProfit;
    }
}
