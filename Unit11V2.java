package start;
class Parents{
	private final void doit() {
		System.out.println("����.doit()");
	}
	final void doit2() {
		System.out.println("����.doit2()");
	}
	public void doit3() {
		System.out.println("����.doit3()");
	}
}
class Son extends Parents{
	public final void doit() {
		System.out.println("����.doit()");
	}
	/**final void doit2() {
		System.out.println("����.doit2()");
	}**///������final�ķ������ܸ���
	public void doit3() {
		System.out.println("����.doit3()");
	}
}
public class Unit11V2 {
	public static void main(String[] args) {
		Son s=new Son();
		s.doit();
		Parents p=s;//����ת��
		//p.doit();   ���ܵ���private����
		p.doit2();
		p.doit3();
	}
}
