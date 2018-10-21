package hellojava;
import java.util.Arrays;//进行Arrays替换时要导入类
public class Unit6 {
	public static void main(String[] args) {
		//一维数组
		int arr1[]=new int[] {1,2,3,4,5,6};
		char arr2[]=new char[] {'a','b','c','d','e','f'};
		System.out.println("数组arr1的内容为");
		for(int a=0;a<6;a++)
		{
			System.out.print(arr1[a]+" ");
		}
		
		//二维数组
		System.out.println("");
		int arr3[][]=new int[2][3];
		for(int b=0;b<2;b++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.print(arr3[b][c]);
			}
			System.out.println("");
		}
		
		//用for语句遍历二维数组
		System.out.println("");
		int arr4[][]=new int[][] {{1},{2,3},{4,5,6}};
		for(int d=0;d<arr4.length;d++)//要用length不能用常数数字，不然会出错
		{
			for(int e=0;e<arr4[d].length;e++)
			{
				System.out.print(arr4[d][e]);
			}
			System.out.println("");
		}
		
		//用foreach语句遍历二维数组
		System.out.println("");
		int arr5[][]= {{11,22},{33,44}};
		System.out.println("数组中的元素为：");
		int i=0;
		for(int x[]:arr5) {
			i++;
			int j=0;
			for(int e:x) {
				j++;
				if(i==arr5.length&&j==x.length) {
					System.out.print(e);
				}else
					//如果不是二维数组中的最后一个元素
					System.out.print(e+"、");
			}
		}
		
		//填充替换数组元素
		System.out.println("");
		int arr6[]=new int[5];
		Arrays.fill(arr6,1);//用同一个元素来填充数组
		for(int f=0;f<arr6.length;f++)
		{
			//将数组中的元素依次输出
			System.out.println("第"+(f+1)+"个元素为："+arr6[f]);
		}
		
		System.out.println("");
		int arr7[]=new int[] {11,22,33,44,55};
		Arrays.fill(arr7,1,3,7);//将第(1+1)个元素（包括）到第（3+1）个元素（不包括）替换成7
		for(int g=0;g<arr7.length;g++)
		{
			System.out.println("替换后，数组arr7中第"+(g+1)+"个元素为："+arr7[g]);
		}
		
		//对数组进行排序
		System.out.println("");
		int arr8[]=new int[]{4,45,76,2,434,123,6};
		Arrays.sort(arr8);
		System.out.println("排序后的数组为:");
		for(int h=0;h<arr8.length;h++)
		{
			System.out.println(arr8[h]);
		}
		
		//用两种方法对数组进行复制
		//方法1
		int arr9[]=new int[] {1,2,3,4,5};
		int newarr9[]=Arrays.copyOf(arr9,6);//复制数组arr9前6个元素到数组newarr9中，不足的算0
		for(int j=0;j<newarr9.length;j++)
		{
			System.out.println(newarr9[j]);
		}
		
		//方法2
		System.out.println("");
		int arr10[]=new int[] {1,2,3,4,5,6};
		int newarr10[]=Arrays.copyOfRange(arr10,1,3);
		//复制arr10中第（1+1）个元素（包含）到第（3+1）个元素（不包括）到newarr10中
		for(int k=0;k<newarr10.length;k++)
		{
			System.out.println(newarr10[k]);
		}
		
		//数组查询
		int arr11[]=new int[] {21,4,12};
		Arrays.sort(arr10);
		int index1=Arrays.binarySearch(arr11,0,1,16);
		//在索引0~1处找不到8，所以
		System.out.println(index1);
		
		String str1[]=new String[] {"a","b","c","d"};
		Arrays.sort(str1);
		int index2=Arrays.binarySearch(str1,0,2,"b");
		System.out.println("b的索引位置为："+index2);
		
	}

}
