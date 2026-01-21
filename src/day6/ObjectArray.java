package day6;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[]= {"String",123,12.6,'s',true};
	/*	for(Object x:a)
		{
			System.out.println(x);
		}*/
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
