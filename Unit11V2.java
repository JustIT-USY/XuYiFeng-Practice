package start;
class Parents{
	private final void doit() {
		System.out.println("父类.doit()");
	}
	final void doit2() {
		System.out.println("父类.doit2()");
	}
	public void doit3() {
		System.out.println("父类.doit3()");
	}
}
class Son extends Parents{
	public final void doit() {
		System.out.println("父类.doit()");
	}
	/**final void doit2() {
		System.out.println("父类.doit2()");
	}**///父类中final的方法不能覆盖
	public void doit3() {
		System.out.println("父类.doit3()");
	}
}
public class Unit11V2 {
	public static void main(String[] args) {
		Son s=new Son();
		s.doit();
		Parents p=s;//向上转型
		//p.doit();   不能调用private方法
		p.doit2();
		p.doit3();
	}
}
