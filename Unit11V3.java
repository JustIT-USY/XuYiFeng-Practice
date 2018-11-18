package start;

public class Unit11V3 {
	innerClass in=new innerClass();
	public void ouf() {
		in.inf();      //在外部类调用内部类方法
	}
	class innerClass{
		innerClass(){       //内部类成员方法
		}
		public void inf() {  //内部类成员方法
		}
		int y=0;     //内部类成员变量
	}
	public innerClass doit() {
		//y=4;    //外部类不能直接访问内部类成员变量
		in.y=4;   //访问内部类成员变量
		return new innerClass();  //返回内部类引用
	}
	public static void main(String args[]) {
		Unit11V3 out=new Unit11V3();
		//内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现 
		Unit11V3.innerClass in=out.doit();
		Unit11V3.innerClass in2=out.new innerClass();
	}
}
