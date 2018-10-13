package hellojava;
import java.util.Date;//导入java.util.Date类

public class Unit5 {
	public static void main(String[] args) {
		String c=new String("Good");//Java的String用法
		System.out.println(c);
		char a[]= {'s','t','u','d','e','n','t'};
		String b=new String(a,2,4);//取数组a中第3个到第5个元素并组合
		System.out.println(b);
		
		System.out.print("\n");
		String s1=new String("Hello");
		String s2=new String("World");
		String s=s1+" "+s2+" ";
		System.out.println(s);

		System.out.print("\n");
		int size1=s.length();//获取字符串长度
		System.out.println("Hello World的长度为"+size1);
		
		int size2=s.indexOf("W");//从字符串开头开始查找
		System.out.println("W的位置为"+size2);
		
		int size3=s.lastIndexOf("o");//从字符串末尾开始查找
		System.out.println("最后一个o的位置为"+size3);
		
		char word1=s.charAt(6);
		System.out.println("第七个位置的内容是："+word1);
		
	    String sentence1=s.substring(2);//取第3个字符到末尾
	    System.out.println("从第3个字符到末尾的的内容为："+sentence1);
	    
	    String sentence2=s.substring(4,7);//从4开始，在7之前结束，不是取6
	    System.out.println("从第5到第7个字符为："+sentence2);
		
	    System.out.println("Hello World有空格的长度："+s.length());
	    System.out.println("Hello World去开头和末尾空格的长度："+s.trim().length());
	    
	    String sentence3=s.replace("World","Java");//替换
	    System.out.println(sentence3);
	    
	    boolean a1=s.startsWith("H");
	    boolean a2=s.endsWith("D");
	    boolean a3=s.startsWith("h");
	    boolean a4=s.endsWith(" ");
	    System.out.println("Hello World 是否以H开头"+a1);
	    System.out.println("Hello World 是否以D结尾"+a2);
	    System.out.println("Hello World 是否以h开头"+a3);
	    System.out.println("Hello World 是否以空格结尾"+a4);
	    
	    System.out.print("\n");
	    String b1=new String("abc");
	    String b2=new String("ABC");
	    boolean c1=b1.equals(b2);
	    boolean c2=b1.equalsIgnoreCase(b2);
	    System.out.println("abc equals ABC："+c1);
	    System.out.println("abc equalsIgnoreCase abc："+c2);
	    
	    String d1=new String("a");
	    String d2=new String("c");
	    String d3=new String("e");//前者Unicode值减后者Unicode值
	    System.out.println(d2+" compareTo "+d1+":"+d2.compareTo(d1));
	    System.out.println(d2+" compareTo "+d3+":"+d2.compareTo(d3));
	    
	    String e1=new String("abc def");
	    System.out.println(e1.toLowerCase());//转换大写
	    System.out.println(e1.toUpperCase());//转换小写
	    
	    String f=new String("123.456.789.000");
	    String[] f1=f.split("\\.");
	    String[] f2=f.split("\\.",2);
	    System.out.println("原字符串:"+f);
	    System.out.println("全部分割结果:");
	    for(String t:f1)//这个t可以是任何字符
	    {
	    	System.out.println(t);
	    }
	    System.out.println("分割两次结果:");
	    for(String t:f2)
	    {
	    	System.out.println(t);
	    }
	    
	    Date date=new Date();//创建Date对象date
	    String year=String.format("%tY",date);//格式化
	    String month=String.format("%tB",date);
	    String day=String.format("%td",date);
	    String hour=String.format("%tH",date);
	    String minute=String.format("%tM",date);
	    String second=String.format("%tS",date);
	    System.out.println("今年是:"+year+"年");
	    System.out.println("今天是:"+month+day+"日");
	    System.out.println("现在是:"+hour+"时"+minute+"分"+second+"秒");
	    String time=String.format("%tc",date);
	    String form=String.format("%tF",date);
	    System.out.println("当前时间为:"+time);
	    System.out.println("年-月-日格式为："+form);
	    
	    String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";//一般的邮件格式
	    //"//w+"："//w"代表任意字符,"+"代表字符可以出现多次
	    //"@\\w+"：代表@后可以有多个任意字符
	    //"(\\.\\w{2,3})*"：代表形如.com的可以出现0次或多次
	    //"\\.\\w{2,3}"：代表结尾字符，如".com"
	    String str1="aaa@";
	    String str2="aaaaa";
	    String str3="111@111ffuu.dfg.com";
	    if(str1.matches(regex)) {
	    	System.out.println(str1+"是一个正确的邮件地址");
	    }
	    if(str2.matches(regex)) {
	    	System.out.println(str2+"是一个正确的邮件地址");
	    }
	    if(str3.matches(regex)) {
	    	System.out.println(str3+"是一个正确的邮件地址");
	    }
	    
	    //字符生成器设定和用法
	    StringBuilder bf=new StringBuilder("Hello Java World");
	    bf.insert(5," my");//在5号位插入字符，5号字符及后面的往后移动
	    System.out.println(bf.toString());
	    bf.delete(5,8);//删除第5位到第8-1位的字符（第一位为0位）
	    System.out.println(bf.toString());
	    bf.append("!");//直接在末尾添加字符
	    System.out.println(bf.toString());
	    
	    
	    
	    
	}

}
