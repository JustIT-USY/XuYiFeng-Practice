package start;
import static java.lang.Math.max;
import static java.lang.System.out;
import java.util.Random;
public class Unit11 {
	private static Random idea=new Random();
	//�������0~1֮�������������趨��Ϊfinal��a1
	private final int a1=idea.nextInt(10);
	//�������0~1֮�������������趨��Ϊstatic final��a2
	private static final int a2=idea.nextInt(10);
	public static void main(String[] args) {
		out.println("1��4�Ľϴ�ֵΪ��"+max(1,4));
		
		//��������a1�仯a2����
		Unit11 p1=new Unit11();
		out.println("����ʵ�����������a1��ֵ��"+p1.a1);
		out.println("����ʵ�����������a2��ֵ��"+p1.a2);
		//ʵ������һ�����󲢵���
		Unit11 p2=new Unit11();
		out.println("����ʵ�����������a1��ֵ��"+p2.a1);
		out.println("����ʵ�����������a2��ֵ��"+p2.a2);
	}
}
