package start;

public class Unit8 {
	public static void main(String[] args) {
		//����ת��
		String str1=Integer.toString(222);
		String str2=Integer.toBinaryString(222);
		String str3=Integer.toHexString(222);
		String str4=Integer.toOctalString(222);
		System.out.println("222��ʮ���Ʊ�ʾΪ:"+str1);
		System.out.println("222�Ķ����Ʊ�ʾΪ:"+str2);
		System.out.println("222��ʮ�����Ʊ�ʾΪ:"+str3);
		System.out.println("222�İ˽��Ʊ�ʾΪ:"+str4);
		
		//�жϴ�Сд
		Character mychar1=new Character('A');
		Character mychar2=new Character('a');
		System.out.println(mychar1+"�Ǵ�д��ĸ��"+Character.isUpperCase(mychar1));
		System.out.println(mychar2+"��Сд��ĸ��"+Character.isLowerCase(mychar2));
		
		Character dx1=new Character('A');
		Character dx2=new Character('A');
		System.out.println(dx1.equals(dx2));
		dx1=Character.toLowerCase(dx1);
		dx2=Character.toLowerCase(dx2);
		System.out.println(dx1.equals(dx2));
	}
}
