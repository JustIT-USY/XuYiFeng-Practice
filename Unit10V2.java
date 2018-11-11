package start;

public class Unit10V2 {//多态
	private Unit10V2[] qTest=new Unit10V2[6];
	private int nextIndex=0;
	public void draw(Unit10V2 q) {//在主类中构建四边形方法
		if(nextIndex<qTest.length) {
			qTest[nextIndex]=q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args) {
		Unit10V2 q=new Unit10V2();//创建主类对象
		q.draw(new Square());//创建正方形对象，以正方形对象为形参调用主类中的四边形方法
		q.draw(new Parallelogramgle());
	}
}
class Square extends Unit10V2{//构建正方形类
	public Square() {
		System.out.println("正方形");
	}
}
class Parallelogramgle extends Unit10V2{//构建平行四边形类
	public Parallelogramgle() {
		System.out.println("平行四边形");
	}
}
