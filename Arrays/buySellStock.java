//  Problem : Best Time To Buy And Sell Stock
// Approach : Track minimum so far 
// Time Complexity : O(n)
// Space Complexity : O(1)
 class buySellStock {

    public static void main(String[] args) {

        int [] prices = {7,1,5,3,6,4};

        int min = prices[0];
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            

           int  currentProfit = prices[i] - min;
           maxProfit = Math.max(maxProfit, currentProfit);
           min = Math.min(min, prices[i]);
          
        }

         System.out.println(maxProfit);

        

    }
    
}
