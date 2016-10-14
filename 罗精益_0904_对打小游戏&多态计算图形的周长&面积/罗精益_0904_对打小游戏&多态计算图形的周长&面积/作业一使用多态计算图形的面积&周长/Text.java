import java.util.Scanner;

public class Text{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		boolean kai = true ;
		while (kai) {
			System.out.println("\n"+"请输入你要计算的图形   1/矩形  2/圆形  任意键退出程序");
			String de = scanner.next();
			switch (de) {
				case 1+"":
				juxing();
				break;

				case 2+"":
				yuan();
				break;

				default:
				System.out.println("程序已退出,欢迎再次使用");
				kai = false ;
				break;

			}
		}
	}




	public static void ru( Shape_dete s ){ //父类的引用指向子类的对象
		 s.geper();
		 s.geArea();
	}

	/**
	*矩形方法
	*/
	public static void juxing(){
		System.out.println("请输入矩形的长：");
		double chang = scanner.nextDouble();
		System.out.println("请输入矩形的宽：");
		double kuan = scanner.nextDouble();
		Rectangle r  = new Rectangle (chang,kuan);   //矩形
		ru(r);
	}
	/**
	*圆形方法
	*/
	public static void yuan(){
		System.out.println("请输入圆形的半径");
		double ban = scanner.nextDouble();
		Circle c = new Circle(ban);   //圆
		ru(c);
	}
}