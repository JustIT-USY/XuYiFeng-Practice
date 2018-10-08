package hellojava;

public class Unit3 {

	public static void main(String[] args) {
		System.out.println("\n");//Java的If使用
		int math=88;  
		if(math>90)
		{System.out.println("成绩优秀");}
		else if(math>75)
		{System.out.println("成绩良好");}
		else if(math>60)
		{System.out.println("成绩及格");}

		System.out.println("\n");//Java的switch使用
		int choose=2;  
		switch(choose){
		case 1:
			System.out.println("你选择了1");
			break;
		case 2:
			System.out.println("你选择了2");
			break;
		case 3:
			System.out.println("你选择了3");
			break;
		}
		
		System.out.println("\n");//Java的while使用
		int a=1,b=0;
		while(a<=10) {
			b=b+a;
			a++;
		}
		System.out.println("1到10的累加为："+b);
		
		System.out.println("\n");//Java的do while使用
		int x=100,y=0;
		do {
			y=y+x;
			x--;
		}while(x>=80);
		System.out.println("80加到100的值为："+y);
		
		System.out.println("\n");//Java的for使用
		int c,d=0;
		for(c=0;d<=100;d++)
		{
			c=c+d;
		}
		System.out.println("1加到100的值为："+c);
		
		System.out.println("\n");//Java中foreach的使用
		int arr[]= {5,75,8};
		System.out.println("数组中的值为：");
		for(int q:arr) {
			System.out.println(q);
		}
		
		System.out.println("\n");//Java中跳出外层循环的使用
		Loop:for(int n=0;n<3;n++) {
			for(int m=0;m<100;m++)
			{
				if(m==3)
				{
					break Loop;
				}
				System.out.println("n="+n+",m="+m);
			}
		}
		
		System.out.println("\n");//Java循环中continue的使用
		System.out.println("小于15的偶数为:");
		for(int i=1;i<15;i++)
		{
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\n");//用for循环做镂空菱形
		for(int e=1;e<=5;e++)//菱形上部行数
		{
			for(int r=1;r<=5-e;r++)
			{System.out.print(" ");}//上部空格数
			for(int t=1;t<=2*e-1;t++)
			{
				if(t==1||t==2*e-1)
				{System.out.print("*");}//上部每行第一个或最后一个输出*
				else 
				{System.out.print(" ");}//上部其余部分输出空格
			}
			System.out.print("\n");//每输出一行就换一行
		}
		for(int e=1;e<=4;e++)//菱形下部行数，由于中间部分已经在上部输出过了，所以比上部少一行
		{
			for(int r=5;r>5-e;r--)
			{System.out.print(" ");}//下部空格数
			for(int t=1;t<=(5-e)*2-1;t++)
			{
				if(t==1||t==(5-e)*2-1)
			    {System.out.print("*");}//下部每行第一个或最后一个输出*
				else
				{System.out.print(" ");}}//下部其余部分输出空格
			    System.out.print("\n");//下部换行
		    }
			
	}

}
