package start;
class Quadrangle{
	public static void draw(Quadrangle q) {//向上转型
		//SomeSentence
	}
}
public class Parallelogram extends Quadrangle{
	public static void main(String args[]) {
		draw(new Parallelogram());
		Quadrangle q=new Parallelogram();//建立父类对象
		//错误写法：Parallelogram p=q;
		Parallelogram p=(Parallelogram) q;//将父类对象赋予子类对象，并强制转换为子类型
	}
}