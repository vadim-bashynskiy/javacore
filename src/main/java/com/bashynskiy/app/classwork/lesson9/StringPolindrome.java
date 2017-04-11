package com.bashynskiy.app.classwork.lesson9;

/**
 * Created by admin on 10.04.2017.
 */
public class StringPolindrome {
    public void polindromeString(){
        String palindrome = "moom";

        boolean isPalindrome = true;

        for (int i=0; i<palindrome.length()/2; i++){

            isPalindrome = isPalindrome &&

                    (palindrome.charAt(i)==palindrome.charAt

                            (palindrome.length()-i-1)); }

        if (isPalindrome)

            System.out.println("Palindrome");

        else

            System.out.println("Not palindrome");
    }
}
