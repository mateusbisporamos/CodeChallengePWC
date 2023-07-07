public class CodeChallenge {
    public static void main(String[] args) {
        String str = "banana";

        // stringInversion(str);
        // removeDuplicates(str);
        palindromeSubstring(str);
        // upperCase(str);
        // isPalindrome(str);
    }

    public static String stringInversion(String str) {
        String[] words = str.trim().split("\\s+");

        String strInversion = "";

        for (int counter = words.length - 1; counter >= 0; counter--)
            strInversion += words[counter] + " ";

        System.out.println(strInversion.trim());
        return strInversion.trim();
    }

    public static String removeDuplicates(String str) {
        char[] letters = str.toCharArray();

        String strDuplicates = "";

        for (char c : letters) {
            if (!(strDuplicates.contains(Character.toString(c))))
                strDuplicates += c;
        }

        System.out.println(strDuplicates.trim());
        return strDuplicates.trim();
    }

    public static String palindromeSubstring(String str) {
        char[] letters = str.toCharArray();

        String strPS = "";
        
        for (int mainCounter = 0; mainCounter <= str.length(); mainCounter++) {
            for (int secundaryCounter = mainCounter+1; secundaryCounter <= str.length(); secundaryCounter++) {
                String substringTest = str.substring(mainCounter, secundaryCounter);
                if (isPalindrome(substringTest) == true && substringTest.length() >= strPS.length()) {
                    strPS = substringTest.trim();
                }
            }
        }

        System.out.println(strPS.trim());
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

        System.out.println(strUpperCase);
        return strUpperCase;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String strInversion = sb.reverse().toString();

        System.out.println(strInversion);

        if (str.equals(strInversion)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }
}
