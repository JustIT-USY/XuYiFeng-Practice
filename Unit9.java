package start;
import java.util.Random;
import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Unit9 {
	public static void main(String[] args) {
		//�����2С��32��6�����ż���ĺ�
		int n=0;
		int sum=0;
		Random idea1=new Random();
		do {
			int a=idea1.nextInt(31);
			if((a%2==0)&&(a!=0))
			{
				n++;
				sum=sum+a;
			}
		}while(n<6);
		System.out.println("����2С��32���������ż����Ϊ��"+sum);
		
		//���巽����Բ�������������λС��
		System.out.println("");
		Scanner idea2=new Scanner(System.in);
		double r=idea2.nextDouble();
		double cc=BanJing(r);
		System.out.println("�뾶Ϊ"+r+"��Բ���Ϊ��"+ChangeNum("00.00000",cc));
		
		//�������������
		System.out.println();
		Random rr=new Random();
		System.out.println("�������һ��������"+rr.nextInt());
		System.out.println("�������һ������0С��10��������"+rr.nextInt(10));
		System.out.println("�������һ�������͵�ֵ��"+rr.nextBoolean());
		System.out.println("�������һ��˫�����͵�ֵ��"+rr.nextDouble());
		System.out.println("�������һ�������͵�ֵ��"+rr.nextFloat());
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ���˫����ֵ��"+rr.nextGaussian());
	}

	public static  double BanJing(double a) {//��뾶
		double PI=3.14;
		return (PI*a*a);
	}
	
	public static String ChangeNum(String pattern,double value) {//�����ת��Ϊ5λС��
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);
		return output;
	}
	
	//�������������
	
	
	
	
	
	
	

}
