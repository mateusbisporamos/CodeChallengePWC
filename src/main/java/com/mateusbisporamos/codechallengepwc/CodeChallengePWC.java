package com.mateusbisporamos.codechallengepwc;

public class CodeChallengePWC {
    
    // método responsável por fazer a inversão das palavaras da string
    public static String stringInversion(String str) {
        // array que armazena as palavras da string usando o método "split" e as coloca dentro do array
        String[] words = str.trim().split("\\s+");
        
         // decalarção da strign onde será armazenado a string invertida
        String strInversion = "";

        // loop pelo array de palavras de forma decrescente, da última palavra para primeira
        for (int counter = words.length - 1; counter >= 0; counter--)
            // insere a palavra com um espaço na string a ser retornada
            strInversion += words[counter] + " ";
        
        // retorna a string com as palavras na ordem inversa
        return strInversion.trim();
    }

    // método responsável por remover letras repetidas da string
    public static String removeDuplicates(String str) {
        // array que armazena as letras da string, cada letra em um índice
        char[] letters = str.toCharArray();
        
        // string a ser retornada
        String strDuplicates = "";

        // loop pelo array que contém as letras da string
        for (char c : letters) {
            // verifica a existência da letra na string a ser retornada
            if (!(strDuplicates.contains(Character.toString(c))))
                // insere a letra, caso a mesma não esteja na string a ser retorna
                strDuplicates += c;
        }
        
        // retorna a string sem as letras repetidas
        return strDuplicates.trim();
    }

    // método responsável por encontrar a maior substring palindorma dentro de uma string
    public static String palindromeSubstring(String str) {
        // string a ser retornada
        String strPS = "";
        
        // loop executado a quantidade de vezes equivalente a quantidade de letras da string
        for (int mainCounter = 0; mainCounter <= str.length(); mainCounter++) {
            // loop executado a quantidade de vezes equivalente a quantidade de letras da string, porém iniciando a frente do contador do primeiro loop
            for (int secundaryCounter = mainCounter+1; secundaryCounter <= str.length(); secundaryCounter++) {
                // gera uma substrig que se incia no contador do primeiro loop e acaba no contador do segundo loop dessa forma todas as substrings possíveis são geradas
                String substringTest = str.substring(mainCounter, secundaryCounter);
                
                // testa se a substring gerada é um palindromo, se o seu tamanho é maior ou igual ao tamanho da string a ser retornada e se o seu tamanho é maior ou igual a dois
                if (isPalindrome(substringTest) == true && substringTest.length() >= strPS.length() && substringTest.trim().length() >= 2) {
                    // insere a substring na string a ser retornada
                    strPS = substringTest;
                } else {
                    // insere um "-" indicando que nenhum palindromo foi encontrado
                    strPS = "-";
                }
            }
        }
        
        // retorna a maior substring palindroma encontrada dentro de uma string
        return strPS.trim();
    }

    // método responsável por colocar em maiúscula a primeira letra das frases de uma string
    public static String upperCase(String str) {
        // array que armazena as frases da string usando o método split
        String strArray[] = str.trim().toLowerCase().split("(?<=[!?.:])");

        // string a ser retornada
        String strUpperCase = "";

        // loop pelas frases armazenadas no array
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
