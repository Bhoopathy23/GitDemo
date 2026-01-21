package day6;

public class SingledimensionalArray {

	public static void main(String[] args) {
		//Approach 1
		
	/*	int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[4]);*/
		
	//	Approach 2
		//Find the length of an array 
	/*	int b[]= {100,200,300,400,500,};
		System.out.println(b.length);*/
		//Reading all the values from array using normal For loop
		int a[]= {10,20,30,40,50};
		/*	for(int i=1;i<=4;i++) //i<=4 i<5 i<a.length i<=a.length-1
		{
			System.out.println(a[i]);
		}*/
		//Enhanced forloop
		
		for(int i:a)
		{
			System.out.println(i);
		}
			

		
	}

}
