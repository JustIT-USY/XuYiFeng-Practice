package start;
interface OutInterface{//�ӿ�
	public void f();//�ӿڷ��������ӽӿں����Ҫ���Ǹ÷���
}
public class Unit11V4 {
	public static void main(String args[]) {
		OuterClass2 out=new OuterClass2();
		//����doit()����������һ��OuterClass�ӿ�
		OutInterface outinter=out.doit();//ͨ���ӿ���������OuterClass2���з��ؽӿڵ�doit����
		System.out.println("");
		outinter.f();
	}
}
class OuterClass2{
	private class InnerClass implements OutInterface{//���ӽӿ�OutInterface
		InnerClass(String s){//�ڲ�����·���InnerClass
			System.out.println(s);
		}
		public void f() {//���ǽӿ�ԭ����f()
			System.out.println("�����ڲ����е�f()����");
		}
	}
	public OutInterface doit() {//�����ڲ��࣬����ֵΪOutInterface�ӿ�
		return new InnerClass("�����ڲ��๹�췽��");//����һ���ӿڣ��������ͨ������ӿڷ���doit
	}
}
