//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it nneds to return true  if two double numbers are the same up to three decimal places. Otherwise, return false.

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double num3 = num1 - num2;
        if (Math.abs(num3) <= 0.0009){
            return true;
        } else {
            return false;
        }
    }
}
