package Array;

public class BuyAndSellStock {
     public static int buyAndSellStock(int prices[]){
          int buyPrice = Integer.MAX_VALUE;
          int maxProfit = 0;

          for(int i=0; i<prices.length; i++){
               if (buyPrice > prices[i]) {
                    buyPrice = prices[i];
               //     int Profit = prices[i]-buyPrice;
               //     maxProfit = Math.max(maxProfit, Profit);
               }
               else{
                    int Profit = prices[i]-buyPrice;
                    maxProfit = Math.max(maxProfit, Profit);
                    // buyPrice = prices[i]
               }
          }
          return maxProfit;
     }
     public static void main(String[] args) {
          int prices[] = {7, 1, 5, 3, 6, 4};
          // int prices[] = {7, 6, 5, 4, 3, 2, 1};
          int profit = buyAndSellStock(prices);
          if (profit==0) {
               System.out.println("you cannot achieve any profit");
          }
          else{
               System.out.println("you achieve profit is = "+profit);
          }
         
     }
}
