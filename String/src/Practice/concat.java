package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class concat {
    public static void main(String[]arges) {
  Map <Integer , String> mapping = new HashMap<Integer , String>();
  
  mapping.put(2, "p");
  mapping.put(5, "a");
  mapping.put(1, "v");
  mapping.put(3, "n");
  
    Set<Integer> keys = mapping.keySet();
    for(int key:keys ) {
    	
    	System.out.print(key+mapping.get(key));
    }
    
    
    
    
    }
}