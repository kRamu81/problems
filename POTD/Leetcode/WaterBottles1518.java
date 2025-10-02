package POTD.Leetcode;

public class WaterBottles1518 {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;

        int ans = numWaterBottles(numBottles, numExchange);
        System.out.println(ans);
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles; // initial bottles drunk
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            count += newBottles;
            numBottles = numBottles % numExchange + newBottles;
        }
        return count;
    }
}
/*

Initial:
count = 9
numBottles = 9

Loop 1:
- Condition: 9 >= 3 ✅
- newBottles = 9 / 3 = 3
- count = 9 + 3 = 12
- numBottles = 9 % 3 + 3 = 0 + 3 = 3

Loop 2:
- Condition: 3 >= 3 ✅
- newBottles = 3 / 3 = 1
- count = 12 + 1 = 13
- numBottles = 3 % 3 + 1 = 0 + 1 = 1

Loop 3:
- Condition: 1 >= 3 ❌ (stop)

Output:
13
*/

