package day12;

public class Question1 {

	public static void main (String[]args) {
		
		   boolean  result1 = posNeg(1,-1,false );
		   boolean  result2 = posNeg(-1,-1,false );
		   boolean  result3 = posNeg(-4,-5,true );
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}


	public static boolean posNeg( int a, int b, boolean neg) {
		boolean result=false;
		if ((neg==false) && ((a<0 && b>0 )||(a>0 && b<0 ))){
			result=true;
			
		}else if (a<0 && b<0 && neg == false) {	
			result=true;
		}else {
			result=false;
					
		
			
		}
		return result;
	}
	}

