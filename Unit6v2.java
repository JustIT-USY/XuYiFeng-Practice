package hellojava;
import java.util.Arrays;
public class Unit6v2 {
	public static void main(String[] args) {
		//冒泡排序
		int[] arr1= {65,3,55,34,22,5,67};
		Unit6v2 sorter=new Unit6v2();//创建冒泡排序类的对象
		sorter.sort(arr1);//调用sort排序方法
	}
	//声明sort排序方法
	public void sort(int[] arr1) {
		for(int i=1;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length-i;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		showArray(arr1);//调用遍历数组方法
	}
	
	//声明遍历数组方法
	public void showArray(int[] arr1)
	{
		for(int i:arr1) {
			System.out.print(">"+i);
		}
		System.out.println();
	}
}
