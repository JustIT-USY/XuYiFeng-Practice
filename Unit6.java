package hellojava;
import java.util.Arrays;//����Arrays�滻ʱҪ������
public class Unit6 {
	public static void main(String[] args) {
		//һά����
		int arr1[]=new int[] {1,2,3,4,5,6};
		char arr2[]=new char[] {'a','b','c','d','e','f'};
		System.out.println("����arr1������Ϊ");
		for(int a=0;a<6;a++)
		{
			System.out.print(arr1[a]+" ");
		}
		
		//��ά����
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
		
		//��for��������ά����
		System.out.println("");
		int arr4[][]=new int[][] {{1},{2,3},{4,5,6}};
		for(int d=0;d<arr4.length;d++)//Ҫ��length�����ó������֣���Ȼ�����
		{
			for(int e=0;e<arr4[d].length;e++)
			{
				System.out.print(arr4[d][e]);
			}
			System.out.println("");
		}
		
		//��foreach��������ά����
		System.out.println("");
		int arr5[][]= {{11,22},{33,44}};
		System.out.println("�����е�Ԫ��Ϊ��");
		int i=0;
		for(int x[]:arr5) {
			i++;
			int j=0;
			for(int e:x) {
				j++;
				if(i==arr5.length&&j==x.length) {
					System.out.print(e);
				}else
					//������Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e+"��");
			}
		}
		
		//����滻����Ԫ��
		System.out.println("");
		int arr6[]=new int[5];
		Arrays.fill(arr6,1);//��ͬһ��Ԫ�����������
		for(int f=0;f<arr6.length;f++)
		{
			//�������е�Ԫ���������
			System.out.println("��"+(f+1)+"��Ԫ��Ϊ��"+arr6[f]);
		}
		
		System.out.println("");
		int arr7[]=new int[] {11,22,33,44,55};
		Arrays.fill(arr7,1,3,7);//����(1+1)��Ԫ�أ����������ڣ�3+1����Ԫ�أ����������滻��7
		for(int g=0;g<arr7.length;g++)
		{
			System.out.println("�滻������arr7�е�"+(g+1)+"��Ԫ��Ϊ��"+arr7[g]);
		}
		
		//�������������
		System.out.println("");
		int arr8[]=new int[]{4,45,76,2,434,123,6};
		Arrays.sort(arr8);
		System.out.println("����������Ϊ:");
		for(int h=0;h<arr8.length;h++)
		{
			System.out.println(arr8[h]);
		}
		
		//�����ַ�����������и���
		//����1
		int arr9[]=new int[] {1,2,3,4,5};
		int newarr9[]=Arrays.copyOf(arr9,6);//��������arr9ǰ6��Ԫ�ص�����newarr9�У��������0
		for(int j=0;j<newarr9.length;j++)
		{
			System.out.println(newarr9[j]);
		}
		
		//����2
		System.out.println("");
		int arr10[]=new int[] {1,2,3,4,5,6};
		int newarr10[]=Arrays.copyOfRange(arr10,1,3);
		//����arr10�еڣ�1+1����Ԫ�أ����������ڣ�3+1����Ԫ�أ�����������newarr10��
		for(int k=0;k<newarr10.length;k++)
		{
			System.out.println(newarr10[k]);
		}
		
		//�����ѯ
		int arr11[]=new int[] {21,4,12};
		Arrays.sort(arr10);
		int index1=Arrays.binarySearch(arr11,0,1,16);
		//������0~1���Ҳ���8������
		System.out.println(index1);
		
		String str1[]=new String[] {"a","b","c","d"};
		Arrays.sort(str1);
		int index2=Arrays.binarySearch(str1,0,2,"b");
		System.out.println("b������λ��Ϊ��"+index2);
		
	}

}
