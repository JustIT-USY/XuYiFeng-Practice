package start;
import java.util.Random;
import java.util.Scanner;

//��ļ̳С���д������
class Test{//����
	public Test() {//���췽��
		//SomeSentence
	}
	protected void doSomething() {//��Ա����
		//SomeSentence
	}
	protected Test dolt() {//��������ΪTest
		return new Test();
	}
}
class Test2 extends Test{//����̳и���
	public Test2() {//���췽��
		super();//���ø��๹�췽��
		super.doSomething();//���ø����Ա����
	}
	public void doSomethingnew() {//��������
		//SomeSentence
	}
	public void doSomething() {//��д���෽��
		//SomeNewSentence
	}
	protected Test2 dolt() {//��д���෽�������ҷ���ֵ����ΪTest2
		return new Test2();
	}
}
class Parent{
	Parent(){
		System.out.println("���ø����Parent()���췽��");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("���������SubParent()���췽��");
	}
}
public class Subroutine extends SubParent{
	Subroutine(){
		System.out.println("���������Subroutine()���췽��");
	}
	public static void main(String[] args) {
		Subroutine s=new Subroutine();
	}
}
public class Unit10 {
	
}













