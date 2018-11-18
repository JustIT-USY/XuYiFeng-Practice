package start;
interface OutInterface2{
}
class OuterClass3{
	public OutInterface2 doit(final String x) {
		class InnerClass2 implements OutInterface2{
			InnerClass2(String s){
				s=x;
				System.out.println(s);
			}
		}
		return new InnerClass2("doit");
	}
}
public class Unit115 {

}
