package start;

public class Unit10V2 {//��̬
	private Unit10V2[] qTest=new Unit10V2[6];
	private int nextIndex=0;
	public void draw(Unit10V2 q) {//�������й����ı��η���
		if(nextIndex<qTest.length) {
			qTest[nextIndex]=q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args) {
		Unit10V2 q=new Unit10V2();//�����������
		q.draw(new Square());//���������ζ����������ζ���Ϊ�βε��������е��ı��η���
		q.draw(new Parallelogramgle());
	}
}
class Square extends Unit10V2{//������������
	public Square() {
		System.out.println("������");
	}
}
class Parallelogramgle extends Unit10V2{//����ƽ���ı�����
	public Parallelogramgle() {
		System.out.println("ƽ���ı���");
	}
}
