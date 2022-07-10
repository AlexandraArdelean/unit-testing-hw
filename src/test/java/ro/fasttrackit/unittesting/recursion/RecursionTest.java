package ro.fasttrackit.unittesting.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void testSumOfDigitsForNumberEqualsZero() {
        int input =0;
        int output = SumOfDigits.sumOfDigitsRecursive(input);
        Assertions.assertEquals(0,output);
    }

    @Test
    public void testSumOfDigitsForSingleNumber(){
        int input = 3;
        int output= SumOfDigits.sumOfDigitsRecursive(input);
        Assertions.assertEquals(3,output);
    }
   @Test
   public void testSumOfDigitsForTwoNumbers(){
        int input = 12;
        int output = SumOfDigits.sumOfDigitsRecursive(12);
        Assertions.assertEquals(3,output);
   }
    @Test
    public void testSumOfDigitsForNegativeMultipleNumbers() {
        //setup
        int input = -124;
        //run
        int output = SumOfDigits.sumOfDigitsRecursive(input);
        Assertions.assertEquals(-7, output);
    }

    @Test
    public void testIfStringIsPalindrome() {
        String input = "madam";
        Boolean output = Palindrome.isPalindrome(input);
        Assertions.assertEquals(true, output);

    }
    @Test
    public void testSumOfFirstEvenNumbers(){
        int input = 4;
        int output = CalculateSumOfEvenNumbers.sumFirstNEven(input);
        Assertions.assertEquals(20,output);
    }
    @Test
    public void testSumOfFirstOneEvenNumber() {
        int input = 1;
        int output = CalculateSumOfEvenNumbers.sumFirstNEven(input);
        Assertions.assertEquals(2,output);
    }
}
