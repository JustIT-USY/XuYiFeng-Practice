package hellojava;
import java.util.Scanner;
public class work3 {
	public static void main(String[] args) {
		Scanner idea=new Scanner(System.in);
		int name[]=new int[20];
		String password[]=new String[20];
		System.out.println("��վע�����");
		for(int i=0;i<20;i++)
		{
			System.out.println("�������û����������֣�");
			name[i]=idea.nextInt();
			System.out.println("���������루���ּ���ĸ��");
			password[i]=idea.next();
			System.out.println("�Ƿ����ע�᣿��Y/N��");
			String choose=idea.next();
			if("N".equals(choose)==true)
			{
				break;
			}
		}
		
		for(int a=0;a<name.length;a++)
		{
			if(name[a]==0)
			{
				break;
			}
			System.out.println("��"+(a+1)+"λ�û����û���Ϊ��"+name[a]+"   ����Ϊ��"+password[a]);
		}
		
	}

}
