package start;

public class Unit8 {
	public static void main(String[] args) {
		//进制转换
		String str1=Integer.toString(222);
		String str2=Integer.toBinaryString(222);
		String str3=Integer.toHexString(222);
		String str4=Integer.toOctalString(222);
		System.out.println("222的十进制表示为:"+str1);
		System.out.println("222的二进制表示为:"+str2);
		System.out.println("222的十六进制表示为:"+str3);
		System.out.println("222的八进制表示为:"+str4);
		
		//判断大小写
		Character mychar1=new Character('A');
		Character mychar2=new Character('a');
		System.out.println(mychar1+"是大写字母吗？"+Character.isUpperCase(mychar1));
		System.out.println(mychar2+"是小写字母吗？"+Character.isLowerCase(mychar2));
		
		Character dx1=new Character('A');
		Character dx2=new Character('A');
		System.out.println(dx1.equals(dx2));
		dx1=Character.toLowerCase(dx1);
		dx2=Character.toLowerCase(dx2);
		System.out.println(dx1.equals(dx2));
	}
}
