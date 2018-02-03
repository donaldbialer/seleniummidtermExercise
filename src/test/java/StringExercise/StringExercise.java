package StringExercise;

//Question 1:
//
//        Given a string, reverse each word in it and reverse the entire string. For example,
//        if the given string is “hope you are doing well”, then the output should be “llew gniod era uoy epoh”.
//        Assume that all characters in the string are lower case. Create a method called reverseEverything(String s)
//        where ‘s’ is the input from the user in order to solve this question.

import java.lang.*;
import java.io.*;
import java.util.*;

public class StringExercise {

    public static void main(String[] args){

        String input = ("hope you are doing well");
        StringBuilder input1 = new StringBuilder();

    // append a string into StringBuilder input1.  Works well with larger number of strings.
    input1.append(input);

    // reverse StringBuilder input
    input1=input1.reverse();

    //print reverse string
    for(int i = 0; i<input1.length(); i++)
        System.out.print(input1.charAt(i));
    }
}
