package hellojava;
import java.util.Scanner;//�����
public class Unit5work {
	public static void main(String[] args) {
		//��Сдת��
		String s;
		Scanner idea=new Scanner(System.in);
		System.out.println("������һ��Ӣ���ַ�");
		s=idea.nextLine();
		System.out.println("ת��ΪСд�Ľ����"+s.toLowerCase());
		System.out.println("ת��Ϊ��д�Ľ����"+s.toUpperCase());
		
		System.out.println("");
		//�ֱ��ȡ���ַ���������һ�����ж��Ƿ���ͬ
		String str1=new String("Hello Java");
		String str2=new String("Hello World");
		boolean a=str1.substring(0,4).equals(str2.substring(0,4));
		if(a==true)
		{
			System.out.println("��ͬ");
		}
		else
		{
			System.out.println("����ͬ");
		}
		
		System.out.println("");
		//�ж�һ���ַ��Ƿ�Ϊ�Ϸ����ֻ���
		String Pnumber="\\d{11}";
		String num;
		System.out.println("������һ���ֻ���");
		num=idea.next();
		
		if(num.matches(Pnumber)) {
	    	System.out.println(num+"��һ���Ϸ����ֻ�����");
	    }
		else {
	    	System.out.println(num+"����һ���Ϸ����ֻ�����");
	    }
		
		System.out.println("");
		//ʹ���ַ��������������ַ���str׷��1~10��10������
		StringBuilder bf=new StringBuilder("[");
		for(int i=1;i<=10;i++)
		{
			if(i!=10)
			{
				bf.append(i+",");
			}
			else
			{
				bf.append(i+"]");
			}
			
		}
		System.out.println(bf.toString());
		
		
	}
	

}
