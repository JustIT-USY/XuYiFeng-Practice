package hellojava;
import java.util.Scanner;//导入包
public class Unit5work {
	public static void main(String[] args) {
		//大小写转换
		String s;
		Scanner idea=new Scanner(System.in);
		System.out.println("请输入一串英文字符");
		s=idea.nextLine();
		System.out.println("转化为小写的结果是"+s.toLowerCase());
		System.out.println("转化为大写的结果是"+s.toUpperCase());
		
		System.out.println("");
		//分别截取两字符串的其中一段来判断是否相同
		String str1=new String("Hello Java");
		String str2=new String("Hello World");
		boolean a=str1.substring(0,4).equals(str2.substring(0,4));
		if(a==true)
		{
			System.out.println("相同");
		}
		else
		{
			System.out.println("不相同");
		}
		
		System.out.println("");
		//判断一串字符是否为合法的手机号
		String Pnumber="\\d{11}";
		String num;
		System.out.println("请输入一个手机号");
		num=idea.next();
		
		if(num.matches(Pnumber)) {
	    	System.out.println(num+"是一个合法的手机号码");
	    }
		else {
	    	System.out.println(num+"不是一个合法的手机号码");
	    }
		
		System.out.println("");
		//使用字符串生成器，将字符串str追加1~10这10个数字
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
