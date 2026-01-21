package day4;

public class IfElseStatement {

	public static void main(String[] args) {
		
		//Find the greatest of 3 Numbers\\
		
		/*int a=10, b=20, c=30;
		
		if (a>b && a>c)
		{	
	System.out.println("a is larger than b and c :"+10);
		}
		else if (b>a && b>c)
		{
			System.out.println("b is larger than a and c :"+20);
		}
		else
		{
			System.out.println("c is Greater than a and b:"+30);
		}*/
		
		int a=10,b=30,c=20;
		
		if (a<b && a<c)
		{
			System.out.println("a is the smallest :"+10);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is the smallest :"+1);
		}
		else 
		{
			System.out.println("c is the smallest :"+20);
		}
			
			

	}

}
