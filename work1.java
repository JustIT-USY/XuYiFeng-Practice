package hellojava;
import java.util.Random;//导入随机数包
import java.util.Scanner;//导入键盘输入包
public class work1 {
	public static void main(String[] args) {
		System.out.println("这是猜数游戏，你有10次机会!");
		System.out.println("请输入一个数字(0~50)");
		Random game = new Random();
		Scanner idea=new Scanner(System.in);
        int number = game.nextInt(51);//随机产生一个小于51的整数
        int times=1;
        do {
        	System.out.println("你还有"+(11-times)+"次机会");
        	int num=idea.nextInt();
        	if(num==number)
        	{
        		System.out.println("正确");
        		break;
        	}
        	else if(num>number)
        	{
        		System.out.println("太大了");
        	}
        	else if(num<number)
        	{
        		System.out.println("太小了");
        	}
        	times++;
        }while(times<=10);
        
        if(times<=3)
        {
        	System.out.println("棒极了");
        }
        else if(times<=5)
        {
        	System.out.println("还不错");
        }
        else if(times<=8)
        {
        	System.out.println("一般般");
        }
        else if(times<=10)
        {
        	System.out.println("差");
        }
        else if(times==11)
        {
        	System.out.println("失败");
        }
        
		
	}

}
