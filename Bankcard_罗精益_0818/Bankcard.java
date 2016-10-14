import java.util.Scanner ;
public class Bankcard{
public static void main(String[] args) {
	
	float balance = 10000 ;   //余额为10000元
	Scanner  a = new Scanner(System.in); //调用键盘输入
	System.out.println("请输入你要取的金额");
	float qu = a.nextFloat(); //用输入的数字赋值给变量qu、

	/**
	*if else 方法
	*/
	// if (qu>balance) {
	// 	System.out.println("你的余额不足");
	// }else{
	// 	System.out.println("取款成功！");
	// }

	int bn = (int)qu/10000;
	/**
	*switch 方法
	*/
	switch(bn){
		case 0:
		System.out.println("取款成功！");
		break;
		case 1:
		System.out.println("余额不足！");
		break;
		default:
		System.out.println("余额不足！");
		break;
	}
}
}