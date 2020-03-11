package com.javaLearning;

public class EvenDigitSum {
    public static void main(String[] args){
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        else {
            int sum = 0;
            while (number > 0){
                int rem = number % 10;
                if (rem%2==0)
                    sum += rem;
                number /= 10;
            }
            return sum;
        }
    }
}