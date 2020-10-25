package Com.Syntax.Class11;

public class TwoDiemensionalArraryDemo {

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
		
		
		System.out.println($array[1][3]);
		
		
		System.out.println("--------another way to create a 2D array------");
		
		int [][] array= {
				
				{10,20,30},
				{1,2,3},
				{100,200,300}
		};
				System.out.println(array [2][1]);//200
				System.out.println(array [0][0]);//10
				System.out.println("The size of arry of intergers="+array.length);
		}
	}

