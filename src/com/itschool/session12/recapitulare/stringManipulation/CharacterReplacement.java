package com.itschool.session12.recapitulare.stringManipulation;

import java.util.Scanner;

public class CharacterReplacement {
    public static void main(String[] args) {
        //5. Character Replacement: Write a program that prompts the user to enter a string and replaces all occurrences
        // of a specific character in the string with another character using the replace() method. Print out the modified string.
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print("Enter the new character: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the character to be replaced: ");
        char chToBeReplaced = sc.next().charAt(0);
        replaceCharacter(str, ch, chToBeReplaced);
    }

    public static void replaceCharacter(String str, char ch, char chToBeReplaced) {
        int i = str.indexOf(chToBeReplaced);
        if (i == -1) {
            System.out.println("Character is not in the string");
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == chToBeReplaced) {
                str = str.replace(chToBeReplaced, ch);
            }
        }
        System.out.println("String after replacement: " + str);
    }
}
