package hellojava;
import java.util.Date;//����java.util.Date��

public class Unit5 {
	public static void main(String[] args) {
		String c=new String("Good");//Java��String�÷�
		System.out.println(c);
		char a[]= {'s','t','u','d','e','n','t'};
		String b=new String(a,2,4);//ȡ����a�е�3������5��Ԫ�ز����
		System.out.println(b);
		
		System.out.print("\n");
		String s1=new String("Hello");
		String s2=new String("World");
		String s=s1+" "+s2+" ";
		System.out.println(s);

		System.out.print("\n");
		int size1=s.length();//��ȡ�ַ�������
		System.out.println("Hello World�ĳ���Ϊ"+size1);
		
		int size2=s.indexOf("W");//���ַ�����ͷ��ʼ����
		System.out.println("W��λ��Ϊ"+size2);
		
		int size3=s.lastIndexOf("o");//���ַ���ĩβ��ʼ����
		System.out.println("���һ��o��λ��Ϊ"+size3);
		
		char word1=s.charAt(6);
		System.out.println("���߸�λ�õ������ǣ�"+word1);
		
	    String sentence1=s.substring(2);//ȡ��3���ַ���ĩβ
	    System.out.println("�ӵ�3���ַ���ĩβ�ĵ�����Ϊ��"+sentence1);
	    
	    String sentence2=s.substring(4,7);//��4��ʼ����7֮ǰ����������ȡ6
	    System.out.println("�ӵ�5����7���ַ�Ϊ��"+sentence2);
		
	    System.out.println("Hello World�пո�ĳ��ȣ�"+s.length());
	    System.out.println("Hello Worldȥ��ͷ��ĩβ�ո�ĳ��ȣ�"+s.trim().length());
	    
	    String sentence3=s.replace("World","Java");//�滻
	    System.out.println(sentence3);
	    
	    boolean a1=s.startsWith("H");
	    boolean a2=s.endsWith("D");
	    boolean a3=s.startsWith("h");
	    boolean a4=s.endsWith(" ");
	    System.out.println("Hello World �Ƿ���H��ͷ"+a1);
	    System.out.println("Hello World �Ƿ���D��β"+a2);
	    System.out.println("Hello World �Ƿ���h��ͷ"+a3);
	    System.out.println("Hello World �Ƿ��Կո��β"+a4);
	    
	    System.out.print("\n");
	    String b1=new String("abc");
	    String b2=new String("ABC");
	    boolean c1=b1.equals(b2);
	    boolean c2=b1.equalsIgnoreCase(b2);
	    System.out.println("abc equals ABC��"+c1);
	    System.out.println("abc equalsIgnoreCase abc��"+c2);
	    
	    String d1=new String("a");
	    String d2=new String("c");
	    String d3=new String("e");//ǰ��Unicodeֵ������Unicodeֵ
	    System.out.println(d2+" compareTo "+d1+":"+d2.compareTo(d1));
	    System.out.println(d2+" compareTo "+d3+":"+d2.compareTo(d3));
	    
	    String e1=new String("abc def");
	    System.out.println(e1.toLowerCase());//ת����д
	    System.out.println(e1.toUpperCase());//ת��Сд
	    
	    String f=new String("123.456.789.000");
	    String[] f1=f.split("\\.");
	    String[] f2=f.split("\\.",2);
	    System.out.println("ԭ�ַ���:"+f);
	    System.out.println("ȫ���ָ���:");
	    for(String t:f1)//���t�������κ��ַ�
	    {
	    	System.out.println(t);
	    }
	    System.out.println("�ָ����ν��:");
	    for(String t:f2)
	    {
	    	System.out.println(t);
	    }
	    
	    Date date=new Date();//����Date����date
	    String year=String.format("%tY",date);//��ʽ��
	    String month=String.format("%tB",date);
	    String day=String.format("%td",date);
	    String hour=String.format("%tH",date);
	    String minute=String.format("%tM",date);
	    String second=String.format("%tS",date);
	    System.out.println("������:"+year+"��");
	    System.out.println("������:"+month+day+"��");
	    System.out.println("������:"+hour+"ʱ"+minute+"��"+second+"��");
	    String time=String.format("%tc",date);
	    String form=String.format("%tF",date);
	    System.out.println("��ǰʱ��Ϊ:"+time);
	    System.out.println("��-��-�ո�ʽΪ��"+form);
	    
	    String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";//һ����ʼ���ʽ
	    //"//w+"��"//w"���������ַ�,"+"�����ַ����Գ��ֶ��
	    //"@\\w+"������@������ж�������ַ�
	    //"(\\.\\w{2,3})*"����������.com�Ŀ��Գ���0�λ���
	    //"\\.\\w{2,3}"�������β�ַ�����".com"
	    String str1="aaa@";
	    String str2="aaaaa";
	    String str3="111@111ffuu.dfg.com";
	    if(str1.matches(regex)) {
	    	System.out.println(str1+"��һ����ȷ���ʼ���ַ");
	    }
	    if(str2.matches(regex)) {
	    	System.out.println(str2+"��һ����ȷ���ʼ���ַ");
	    }
	    if(str3.matches(regex)) {
	    	System.out.println(str3+"��һ����ȷ���ʼ���ַ");
	    }
	    
	    //�ַ��������趨���÷�
	    StringBuilder bf=new StringBuilder("Hello Java World");
	    bf.insert(5," my");//��5��λ�����ַ���5���ַ�������������ƶ�
	    System.out.println(bf.toString());
	    bf.delete(5,8);//ɾ����5λ����8-1λ���ַ�����һλΪ0λ��
	    System.out.println(bf.toString());
	    bf.append("!");//ֱ����ĩβ����ַ�
	    System.out.println(bf.toString());
	    
	    
	    
	    
	}

}
