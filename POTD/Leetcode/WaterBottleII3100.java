package POTD.Leetcode;

public class WaterBottleII3100 {
    public static void main(String[] args) {
        int numBottles = 13;
        int numExchange = 6;
        System.out.println(waterbottle(numBottles,numExchange));
    }

    public static int waterbottle(int numBottles, int numExchange){
        int ans = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            ans += 1;
            empty = empty-numExchange;
            empty++;
            numExchange++;
        }
        return ans;
    }
}

/*
 step 1: given the number of numBottles and numExchange
         n = 13
         e = 6
         [(0,0,0,0,0,0),(0,0,0,0,0,0,0)=====>(0,0,_,_,_,_,_,_)] -> 13 + 1 + 1 => 15
               ||              ||                   ||
     iter:     6   --------->  7  --------------> 8 but 2 X

 1. drinks all 13 bottles = 13

 2. first 6 exchange with 6 to get bottle => 1 and add in last

 3. for next iteration increment
        * now exchange is 7 to get 1 full bottle and drink place last

 4. exchange is 8 , but only 2 X not possible

 total = 15
*/
