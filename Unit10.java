package start;
import java.util.Random;
import java.util.Scanner;

//类的继承、重写与新增
class Test{//父类
	public Test() {//构造方法
		//SomeSentence
	}
	protected void doSomething() {//成员方法
		//SomeSentence
	}
	protected Test dolt() {//返回类型为Test
		return new Test();
	}
}
class Test2 extends Test{//子类继承父类
	public Test2() {//构造方法
		super();//调用父类构造方法
		super.doSomething();//调用父类成员方法
	}
	public void doSomethingnew() {//新增方法
		//SomeSentence
	}
	public void doSomething() {//重写父类方法
		//SomeNewSentence
	}
	protected Test2 dolt() {//重写父类方法，并且返回值类型为Test2
		return new Test2();
	}
}
class Parent{
	Parent(){
		System.out.println("调用父类的Parent()构造方法");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("调用子类的SubParent()构造方法");
	}
}
public class Subroutine extends SubParent{
	Subroutine(){
		System.out.println("调用子类的Subroutine()构造方法");
	}
	public static void main(String[] args) {
		Subroutine s=new Subroutine();
	}
}
public class Unit10 {
	
}













