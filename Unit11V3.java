package start;

public class Unit11V3 {
	innerClass in=new innerClass();
	public void ouf() {
		in.inf();      //���ⲿ������ڲ��෽��
	}
	class innerClass{
		innerClass(){       //�ڲ����Ա����
		}
		public void inf() {  //�ڲ����Ա����
		}
		int y=0;     //�ڲ����Ա����
	}
	public innerClass doit() {
		//y=4;    //�ⲿ�಻��ֱ�ӷ����ڲ����Ա����
		in.y=4;   //�����ڲ����Ա����
		return new innerClass();  //�����ڲ�������
	}
	public static void main(String args[]) {
		Unit11V3 out=new Unit11V3();
		//�ڲ���Ķ���ʵ���������������ⲿ����ⲿ��ķǾ�̬������ʵ�� 
		Unit11V3.innerClass in=out.doit();
		Unit11V3.innerClass in2=out.new innerClass();
	}
}
