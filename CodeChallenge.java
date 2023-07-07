public class CodeChallenge
{
	public static void main(String[] args) {
	    String str = "Hello, World! OpenAI is amazing.";
	    
	   inversion(str);
	   
	}
	
	public static void inversion(String str) {
	    String[] words = str.trim().split("\\s+");
	    String strInversion = "";
	    for(int counter = words.length-1; counter >= 0; counter--){
	        strInversion += words[counter] + " ";
	    }
	    System.out.println(strInversion.trim());
	}
}
