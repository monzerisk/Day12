package day12;

public class Question2 {
	
	public static void main (String[] args) {
		boolean result1= multipleOf(3);
		boolean result2= multipleOf(10);
		boolean result3= multipleOf(8);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}

public static boolean multipleOf(int n) {
	 boolean result = false;
	 if (n%3==0 || n%5==0) {
		 result = true;
	 }else {
		 result = false;
		 
	
	 }	 
	 return result;
	
}
}


