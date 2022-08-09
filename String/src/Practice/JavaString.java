package Practice;

public class JavaString {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Pavan";
		
		String output[] = s1.split(" ");
		for(int i=output.length-1; i>=0; i--){
			System.out.print(output[i]+" ");
		}
	}

}
