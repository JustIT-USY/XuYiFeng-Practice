package hellojava;
import java.util.Random;//�����������
import java.util.Scanner;//������������
public class work1 {
	public static void main(String[] args) {
		System.out.println("���ǲ�����Ϸ������10�λ���!");
		System.out.println("������һ������(0~50)");
		Random game = new Random();
		Scanner idea=new Scanner(System.in);
        int number = game.nextInt(51);//�������һ��С��51������
        int times=1;
        do {
        	System.out.println("�㻹��"+(11-times)+"�λ���");
        	int num=idea.nextInt();
        	if(num==number)
        	{
        		System.out.println("��ȷ");
        		break;
        	}
        	else if(num>number)
        	{
        		System.out.println("̫����");
        	}
        	else if(num<number)
        	{
        		System.out.println("̫С��");
        	}
        	times++;
        }while(times<=10);
        
        if(times<=3)
        {
        	System.out.println("������");
        }
        else if(times<=5)
        {
        	System.out.println("������");
        }
        else if(times<=8)
        {
        	System.out.println("һ���");
        }
        else if(times<=10)
        {
        	System.out.println("��");
        }
        else if(times==11)
        {
        	System.out.println("ʧ��");
        }
        
		
	}

}
