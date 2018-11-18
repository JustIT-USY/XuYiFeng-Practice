package start;
interface OutInterface{//接口
	public void f();//接口方法，连接接口后必须要覆盖该方法
}
public class Unit11V4 {
	public static void main(String args[]) {
		OuterClass2 out=new OuterClass2();
		//调用doit()方法，返回一个OuterClass接口
		OutInterface outinter=out.doit();//通过接口来访问类OuterClass2中有返回接口的doit方法
		System.out.println("");
		outinter.f();
	}
}
class OuterClass2{
	private class InnerClass implements OutInterface{//连接接口OutInterface
		InnerClass(String s){//内部类的新方法InnerClass
			System.out.println(s);
		}
		public void f() {//覆盖接口原方法f()
			System.out.println("访问内部类中的f()方法");
		}
	}
	public OutInterface doit() {//定义内部类，返回值为OutInterface接口
		return new InnerClass("访问内部类构造方法");//返回一个接口，可让外界通过这个接口访问doit
	}
}
