package com.mateusbisporamos.codechallengepwc;

public class CodeChallengePWC {

    public static void main(String[] args) {}
    

    public static String stringInversion(String str) {
        String[] words = str.trim().split("\\s+");

        String strInversion = "";

        for (int counter = words.length - 1; counter >= 0; counter--)
            strInversion += words[counter] + " ";

        return strInversion.trim();
    }

    public static String removeDuplicates(String str) {
        char[] letters = str.toCharArray();

        String strDuplicates = "";

        for (char c : letters) {
            if (!(strDuplicates.contains(Character.toString(c))))
                strDuplicates += c;
        }

        return strDuplicates.trim();
    }

    public static String palindromeSubstring(String str) {
        String strPS = "";
        
        for (int mainCounter = 0; mainCounter <= str.length(); mainCounter++) {
            for (int secundaryCounter = mainCounter+1; secundaryCounter <= str.length(); secundaryCounter++) {
                String substringTest = str.substring(mainCounter, secundaryCounter);
                if (isPalindrome(substringTest) == true && substringTest.length() >= strPS.length()) {
                    if (substringTest.trim().length() >= 2){
                        strPS = substringTest;
                    } else {
                        strPS = "-";
                    }
                    
                }
            }
        }

        return strPS.trim();
    }

    public static String upperCase(String str) {
        String strArray[] = str.trim().toLowerCase().split("(?<=[!?.:])");

        String strUpperCase = "";

        for (String sentence : strArray) {
            char[] sentenceLetters = sentence.toCharArray();
            boolean fisrtLetter = false;
            for (char letter : sentenceLetters) {
                if (Character.isLetter(letter) && fisrtLetter == false) {    
                    strUpperCase += Character.toString(letter).toUpperCase();
                    fisrtLetter = true;
                } else{
                    strUpperCase += Character.toString(letter);
                }
            }
        }

        return strUpperCase;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String strInversion = sb.reverse().toString();

        if (str.equals(strInversion)) {
            return true;
        } else {
            return false;
        }

    }
}
