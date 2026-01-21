package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Approach 1
		//int a[][]=new int[3][3];
		
		/*a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		System.out.println(a[2][2]);*/
		//Approach 2
		int a[][]= {  {100,200,300},{400,500,600},{700,800,900}                         };
//System.out.println(a[0][0]);
		//Find the length of an array                                     100.200.300
	/*	System.out.println("Length of rows :"+a.length);                  400.500.600
		System.out.println("length of columns:"+a[2].length);*/ //        700.800.900
		/*for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=2;c++)
			{
				System.out.println(a[r][c]);
			}
		
		}*/
		
	/*	for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a.length-1;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}*/
		//Enhanced forloop
		for(int arr[]:a)
		{
			for(int b:arr)
			{
				System.out.print(b+"  ");
			}
			System.out.println();
		}
	}

}
