package start;
class Quadrangle{
	public static void draw(Quadrangle q) {//����ת��
		//SomeSentence
	}
}
public class Parallelogram extends Quadrangle{
	public static void main(String args[]) {
		draw(new Parallelogram());
		Quadrangle q=new Parallelogram();//�����������
		//����д����Parallelogram p=q;
		Parallelogram p=(Parallelogram) q;//�����������������󣬲�ǿ��ת��Ϊ������
	}
}