package hellojava;

public class Unit6v3 {
	public static void main(String[] args) {
		//直接选择排序是先找出数组中最大的数，将其与数组最后一位的数调换位置
		//然后找出数组中第二大的数，将其与数组倒数第二位的数调换位置
		int array[]= {23,4,64,1246,4,35,2,21};
		Unit6v3 sorter=new Unit6v3();
		//创建直接选择排序的对象sorter
		sorter.sort(array);
		//引用直接选择排序方法
	}
	//定义直接选择排序方法
	public void sort(int[] array)
	{
		int index;
		for(int i=1;i<array.length;i++)//只需要循环（元素个数-1）次，每循环一次找出一个最大数并放入相应位置，相应位置的元素与最大数调换
		{
			index=0;
			for(int j=1;j<=array.length-i;j++)//随着i的增大，循环次数减少，
			{
				if(array[j]>array[index])//将第二个数和第一个数进行对比
				{
					index=j;
				}
			}
			int temp=array[array.length-i];
			array[array.length-i]=array[index];//此时，array[index]为第一次最外围循环的最大数
			array[index]=temp;
		}
		showArray(array);//引用遍历数组
	}
	//定义遍历数组
	public void showArray(int[] array) {
		for(int i:array)
		{
			System.out.print(">"+i);
		}
		System.out.println("");
	}

}
