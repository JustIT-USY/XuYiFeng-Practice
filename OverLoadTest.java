package start;

public class OverLoadTest {//����������
	public static int add(int a,int b) {//����1
		return a+b;
	}
	public static double add(double a,double b) {//����2���������Ͳ�ͬ
		return a+b;
	}
	public static int add(int a) {//����3������������ͬ
		return a;
	}
	public static int add(int a,double b) {//����4���������Ͳ�ͬ
		return 1;
	}
	public static int add(double a,int b) {//����5���������Ͳ�ͬ
		return 1;
	}
	public static int add(int... a) {
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		return s;
	}
	public static void main(String args[]) {
		System.out.println("����add(int,int)����:"+add(3,4));
		System.out.println("����add(double,double)����:"+add(3.2,4.6));
		System.out.println("����add(int)����:"+add(3));
		System.out.println("���ò���������������"+add(2,34,5,6,7,8,3,5,6));
		System.out.println("���ò���������������"+add(1));
	}

}
