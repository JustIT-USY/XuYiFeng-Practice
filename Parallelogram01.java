package start;
class Quadrangle{
	public static void draw(Quadrangle q) {
		//SomeSentence
	}
}
class Square extends Quadrangle{
	//SomeSentence
}
class Anything{
	//SomeSentence
}
public class Parallelogram01 extends Quadrangle{
	public static void main(String args[]) {
		Quadrangle q=new Quadrangle();
		//�жϸ�������Ƿ�ΪParallelogram�����һ��ʵ��
		if(q instanceof Parallelogram) {
			Parallelogram p=(Parallelogram) q;
		}
		//�жϸ�������Ƿ�ΪSquare�����һ��ʵ��
		if(q instanceof Square) {
			Square s=(Square) q;
		}
		//����q����ΪAnything��Ķ���������������Ǵ����
	}
}