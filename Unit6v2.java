package hellojava;
import java.util.Arrays;
public class Unit6v2 {
	public static void main(String[] args) {
		//ð������
		int[] arr1= {65,3,55,34,22,5,67};
		Unit6v2 sorter=new Unit6v2();//����ð��������Ķ���
		sorter.sort(arr1);//����sort���򷽷�
	}
	//����sort���򷽷�
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
		showArray(arr1);//���ñ������鷽��
	}
	
	//�����������鷽��
	public void showArray(int[] arr1)
	{
		for(int i:arr1) {
			System.out.print(">"+i);
		}
		System.out.println();
	}
}
