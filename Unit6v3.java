package hellojava;

public class Unit6v3 {
	public static void main(String[] args) {
		//ֱ��ѡ�����������ҳ����������������������������һλ��������λ��
		//Ȼ���ҳ������еڶ�����������������鵹���ڶ�λ��������λ��
		int array[]= {23,4,64,1246,4,35,2,21};
		Unit6v3 sorter=new Unit6v3();
		//����ֱ��ѡ������Ķ���sorter
		sorter.sort(array);
		//����ֱ��ѡ�����򷽷�
	}
	//����ֱ��ѡ�����򷽷�
	public void sort(int[] array)
	{
		int index;
		for(int i=1;i<array.length;i++)//ֻ��Ҫѭ����Ԫ�ظ���-1���Σ�ÿѭ��һ���ҳ�һ���������������Ӧλ�ã���Ӧλ�õ�Ԫ�������������
		{
			index=0;
			for(int j=1;j<=array.length-i;j++)//����i������ѭ���������٣�
			{
				if(array[j]>array[index])//���ڶ������͵�һ�������жԱ�
				{
					index=j;
				}
			}
			int temp=array[array.length-i];
			array[array.length-i]=array[index];//��ʱ��array[index]Ϊ��һ������Χѭ���������
			array[index]=temp;
		}
		showArray(array);//���ñ�������
	}
	//�����������
	public void showArray(int[] array) {
		for(int i:array)
		{
			System.out.print(">"+i);
		}
		System.out.println("");
	}

}
