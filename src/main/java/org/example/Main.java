package org.example;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int [] numbers = {1,2,45,-6,7};
        Arrays.sort(numbers);

        Arrays.sort(numbers,3,4);

        char[] characters ={'a','z','b', 'w', 'c', 'A', 'D', 'Z','C'};

        Arrays.sort(characters);

        String[] strings = {"hgh", "abc", "efg","acd"};

        Arrays.sort(strings); // character by hcharacter


        }
}