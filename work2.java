package hellojava;

public class work2 {
	public static void main(String[] args) {
		double a1=2.50,a2=10.00,a3=7.00;
		int b1=100,b2=126,b3=91;
		int c1=4,c2=8,c3=7;
		String food1=new String("肉丁烧麦");
		String food2=new String("灌汤包");
		String food3=new String("玉米肉饺子");
		System.out.println("------------杭州小笼包------------");
		System.out.println("食品名称     价格（元）  已售出（份）  一份X个");
		System.out.println(food1+"\t"+a1+"\t"+b1+"\t"+c1+"\t");
		System.out.println(food2+"\t"+a2+"\t"+b2+"\t"+c2+"\t");
		System.out.println(food3+"\t"+a3+"\t"+b3+"\t"+c3+"\t");
		System.out.println("-------------------------------");
		System.out.println("已售出份数:"+(b1+b2+b3));
        
	}

}
