package Com.Syntax.Class09;

public class ClockTask {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 23; i++){
		    for (int j = 0; j <= 59; j++){
		        String s1 = String.format("%02d", i);
		        String s2 = String.format("%02d", j);
		        System.out.println(s1+":"+s2);
		        
		       
		        
		    }
		}
	
	}

}
