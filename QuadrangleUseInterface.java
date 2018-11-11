package start;

interface drawTest{//设置接口
	public void draw();
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface//子类继承父类
          implements drawTest{//连接接口
	public void draw() {//覆盖父类方法
		System.out.println("平行四边形.draw()");
	}
	void doAnyThing() {//覆盖父类方法
		//SomeSentence
	}
}
class SquareUseInterface extends QuadrangleUseInterface implements
          drawTest{//连接接口
	public void draw() {//覆盖父类方法
		System.out.println("正方形.draw()");
	}
	void doAnyThing() {//覆盖父类方法
		//SomeSentence
	}
}
class AnyThingUseInterface extends QuadrangleUseInterface{
	void doAnyThing() {//没有连接接口，只需要覆盖父类非接口的方法
		
	}
}
public class QuadrangleUseInterface {
	public void doAnyYhing() {//父类方法
		//SomeSentence
	}
	public static void main(String[] args) {
		drawTest[] d= {//类似数组，存储两个子类对象
				new SquareUseInterface(),new ParallelogramgleUseInterface()
		};
		for(int i=0;i<d.length;i++) {//输出子类
			d[i].draw();
		}
	}
}


















