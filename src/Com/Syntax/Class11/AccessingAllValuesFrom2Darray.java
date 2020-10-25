package Com.Syntax.Class11;

public class AccessingAllValuesFrom2Darray {

	public static void main(String[] args) {

	char [][] $array=new char[3][4];
		
		//add values to first row
		
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='c';
		$array[0][3]='D';
		
  //2 row
		
		$array[1][0]='w';
		$array[1][1]='x';
		$array[1][2]='y';
		$array[1][3]='z';
		
		
		//3 row
		
		$array[2][0]='q';
		$array[2][1]='w';
		$array[2][2]='b';
		$array[2][3]='r';
		
		
		System.out.println($array.length);
		
       for (int row=0; row<$array.length; row++) {
    	   for (int col=0; col<$array[row].length;col++) {
    		   
    		   System.out.println($array[row][col]);
    	   }
    	   
       }
		System.out.println("---------------");
		
		int [][] array= {
				{10,20,30},
				{1,2,3},
				{100,200,300}
		};
		
		for (int i=0; i<array.length; i++) {
			
			for (int j=0; j<array [i].length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
		System.out.println();
		
		}
		
	
	
	}

}
