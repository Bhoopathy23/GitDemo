package day6;

public class EvenorOddinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]+"Even");
			}
			else
			{
				System.out.println(a[i]+"odd");
			}
		}

	}

}
