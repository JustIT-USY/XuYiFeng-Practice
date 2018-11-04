package start;
import java.util.Random;
import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Unit9 {
	public static void main(String[] args) {
		//求大于2小于32的6个随机偶数的和
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
		System.out.println("大于2小于32的六个随机偶数和为："+sum);
		
		//定义方法求圆的面积，保留五位小数
		System.out.println("");
		Scanner idea2=new Scanner(System.in);
		double r=idea2.nextDouble();
		double cc=BanJing(r);
		System.out.println("半径为"+r+"的圆面积为："+ChangeNum("00.00000",cc));
		
		//产生各种随机数
		System.out.println();
		Random rr=new Random();
		System.out.println("随机产生一个整数："+rr.nextInt());
		System.out.println("随机产生一个大于0小于10的整数："+rr.nextInt(10));
		System.out.println("随机产生一个布尔型的值："+rr.nextBoolean());
		System.out.println("随机产生一个双精度型的值："+rr.nextDouble());
		System.out.println("随机产生一个浮点型的值："+rr.nextFloat());
		System.out.println("随机产生一个概率密度为高斯分布的双精度值："+rr.nextGaussian());
	}

	public static  double BanJing(double a) {//求半径
		double PI=3.14;
		return (PI*a*a);
	}
	
	public static String ChangeNum(String pattern,double value) {//将面积转化为5位小数
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);
		return output;
	}
	
	//产生各种随机数
	
	
	
	
	
	
	

}
