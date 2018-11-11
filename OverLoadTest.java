package start;

public class OverLoadTest {//方法的重载
	public static int add(int a,int b) {//方法1
		return a+b;
	}
	public static double add(double a,double b) {//方法2：参数类型不同
		return a+b;
	}
	public static int add(int a) {//方法3：参数个数不同
		return a;
	}
	public static int add(int a,double b) {//方法4：参数类型不同
		return 1;
	}
	public static int add(double a,int b) {//方法5：参数类型不同
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
		System.out.println("调用add(int,int)方法:"+add(3,4));
		System.out.println("调用add(double,double)方法:"+add(3.2,4.6));
		System.out.println("调用add(int)方法:"+add(3));
		System.out.println("调用不定长参数方法："+add(2,34,5,6,7,8,3,5,6));
		System.out.println("调用不定长参数方法："+add(1));
	}

}
