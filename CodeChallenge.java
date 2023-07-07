public class CodeChallenge
{
	public static void main(String[] args) {
	    String str = "Hello, World!";
	    
	   inversion(str);
	   duplicates(str);
	}
	
	public static void inversion(String str) {
	    String[] words = str.trim().split("\\s+");
	    String strInversion = "";
	    for(int counter = words.length-1; counter >= 0; counter--){
	        strInversion += words[counter] + " ";
	    }

	    System.out.println(strInversion.trim());
	}

    public static void duplicates(String str) {
        char[] letters = str.toCharArray();
        String strDuplicates = "";
        for (char c : letters) {
            if(!(strDuplicates.contains(Character.toString(c)))){
                strDuplicates += c;
            }
        }

        System.out.println(strDuplicates.trim());
    }
}
