package Practice;

import java.util.Locale;

public class pagal {
	public static void main(String[] args) {
		
		String S = "Sahastrabuddhe";
		
		countvowels(S); 
		
	}

       public static void countvowels(String S){
    	   
    	   int vowelCount=0;
    	   int counsonentCount =0;
    	   
    	   for(int i=0; i<=S.length(); i++){
    		   if(isVowel(S.charAt(i))){
    			   vowelCount++;
    			   
    		   }
    		   else {
    			   counsonentCount++;}
    	   }
    	   
       }
}
	private static boolean isVowel(char str){
	
		
		return false;
	}
}