//Writ a method hasEqualSum with 3 parameters of type int.
//The method should return boolean and it needs t return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sum = num1 + num2;
        if(sum == num3){
            return true;
        } else {
            return false;
        }
        
    }
}
