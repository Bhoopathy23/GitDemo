package day7;

public class ArraySearch {

	public static void main(String[] args) {
		//Normal forloop
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int search_Element=16;
		
		boolean status=false;
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_Element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if( status==false)
		{
			System.out.println("Element not found");
		}*/
	//Enhanced forloop
		for(int x:a)
		{
			if(x==search_Element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
