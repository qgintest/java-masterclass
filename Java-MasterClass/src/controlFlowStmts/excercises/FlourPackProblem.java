package controlFlowStmts.excercises;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); //false
        System.out.println(canPack(1, 0, 5));  //true
        System.out.println(canPack(0, 5, 4)); //true
        System.out.println(canPack(2, 2, 11)); //true
        System.out.println(canPack(3, 2, 11)); //true
        System.out.println(canPack(2, 1, 5)); //true
        System.out.println(canPack(6, 2, 17)); //true
        System.out.println(canPack(-3, 2, 12)); //false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }
}

/*

If you are still wondering about the final test condition here is the detailed explanation.

return goal % 5 <= smallCount;
This simply evaluates that remainder of goal divided by 5 must be less than or equal to smallCount, since it doesn't matter how many bigCounts you have to fill the order.

To better understand this, let's look at 2 scenarios.

1.  Pretend that we have the scenario where you have 0 bigCount and you must have enough smallCount to fill the order. So in one end of the range, you have goal <= smallCount.

2.  But on the other end of the range, you have x number of bigCount filling part of the order so smallCount only need to cover the remainder of goal divided by 5. Remember, smallCount in the second scenario is smaller than smallCount if bigCount didn't help fill the order in the first scenario!

So worse case scenario, you only need to be concerned about the end of the range where minimum amount of smallCount (i.e. second scenario where some bigCount is covering part of the order) is needed in any scenario...so goal%5 <= smallCount.


 */
