package start;

interface drawTest{//���ýӿ�
	public void draw();
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface//����̳и���
          implements drawTest{//���ӽӿ�
	public void draw() {//���Ǹ��෽��
		System.out.println("ƽ���ı���.draw()");
	}
	void doAnyThing() {//���Ǹ��෽��
		//SomeSentence
	}
}
class SquareUseInterface extends QuadrangleUseInterface implements
          drawTest{//���ӽӿ�
	public void draw() {//���Ǹ��෽��
		System.out.println("������.draw()");
	}
	void doAnyThing() {//���Ǹ��෽��
		//SomeSentence
	}
}
class AnyThingUseInterface extends QuadrangleUseInterface{
	void doAnyThing() {//û�����ӽӿڣ�ֻ��Ҫ���Ǹ���ǽӿڵķ���
		
	}
}
public class QuadrangleUseInterface {
	public void doAnyYhing() {//���෽��
		//SomeSentence
	}
	public static void main(String[] args) {
		drawTest[] d= {//�������飬�洢�����������
				new SquareUseInterface(),new ParallelogramgleUseInterface()
		};
		for(int i=0;i<d.length;i++) {//�������
			d[i].draw();
		}
	}
}


















