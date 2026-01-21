package day7;

public class FindHowmanyDuplicates {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,10,30,10,10,10};
		int num=10;
		int count=0;
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
