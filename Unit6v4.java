package hellojava;

public class Unit6v4 {
	public static void main(String[] args) {
		int[] array= {11,22,33,44,55,66};
		Unit6v4 sorter=new Unit6v4();
		sorter.sort(array);
	}
	public void sort(int[] array) {
		System.out.println("����ԭ������");
		showArray(array);
		int temp;
		int len=array.length;
		for(int i=0;i<len/2;i++)
		{
			temp=array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.println("���鷴ת������");
		showArray(array);
	}
	
	public void showArray(int[] array)
	{
		for(int i:array)
		{
			System.out.println("\t"+i);
		}
		System.out.println("");
	}

}
