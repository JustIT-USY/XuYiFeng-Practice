package start;
import static java.lang.Math.max;
import static java.lang.System.out;
import java.util.Random;
public class Unit11 {
	private static Random idea=new Random();
	//随机产生0~1之间的随机数并赋予定义为final的a1
	private final int a1=idea.nextInt(10);
	//随机产生0~1之间的随机数并赋予定义为static final的a2
	private static final int a2=idea.nextInt(10);
	public static void main(String[] args) {
		out.println("1和4的较大值为："+max(1,4));
		
		//两次运行a1变化a2不变
		Unit11 p1=new Unit11();
		out.println("重新实例化对象调用a1的值："+p1.a1);
		out.println("重新实例化对象调用a2的值："+p1.a2);
		//实例化另一个对象并调用
		Unit11 p2=new Unit11();
		out.println("重新实例化对象调用a1的值："+p2.a1);
		out.println("重新实例化对象调用a2的值："+p2.a2);
	}
}
