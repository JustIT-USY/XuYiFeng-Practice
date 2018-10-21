package hellojava;
import java.util.Scanner;
public class work3 {
	public static void main(String[] args) {
		Scanner idea=new Scanner(System.in);
		int name[]=new int[20];
		String password[]=new String[20];
		System.out.println("网站注册程序");
		for(int i=0;i<20;i++)
		{
			System.out.println("请输入用户名（纯数字）");
			name[i]=idea.nextInt();
			System.out.println("请输入密码（数字加字母）");
			password[i]=idea.next();
			System.out.println("是否继续注册？（Y/N）");
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
			System.out.println("第"+(a+1)+"位用户的用户名为："+name[a]+"   密码为："+password[a]);
		}
		
	}

}
