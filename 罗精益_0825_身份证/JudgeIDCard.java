import java.util.Scanner ;
import java.util.Random ;
public class JudgeIDCard{
	static String usesr ="";   //用户输入的身份证号码
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		boolean kai = true ;
		while(kai){
		System.out.println("");
		System.out.println("请输入你要查询的身份证号码：");
		usesr = scanner.next();
		if(usesr.length()== 18){   			//判断用户输入的是18位还是15位
			eighteen(); 
			in() ; 					//调用18位身份证的方法
		}else if(usesr.length()== 15){
			fifteen();	
			in() ;					//调用15位身份证的方法
		}else {    //如果用户输入的字符串即不是18位也不是15位的话 提示重新输入
			System.out.println("你输入的号码有误,请重新输入");
			System.out.println("");
			continue ;
		}
	}
	}
	/**
	*18位身份证号码
	*/
	public static void eighteen(){
		boolean onoff = false ;
		String nianl =usesr.substring(6,10);  //截取出生年份
		int nl = Integer.parseInt(nianl); //把截取到的出生年份转为int类型
		String yue = usesr.substring(10,12);    //截取月份
		String ri  = usesr.substring(12,14);  //截取日期
		int zyue=Integer.parseInt(yue);   
		int zri =Integer.parseInt(ri);
		if(zyue >12){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			System.out.println("");
			main(null);
		}else if(zri>31){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			System.out.println("");
			main(null);
		}else if(nl>2016){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			main(null);
		}else{
			onoff = true ;
		}
	
		if(onoff = true){
		String xb = usesr.substring(16,17); 
		int  nannv=Integer.parseInt(xb);   //把截取到的字符串转为int类型
		if ( nannv %2==0){
			System.out.println("");
			System.out.println("是女性");
		}
		else {
			System.out.println("");
			System.out.println("是男性");
		}
		System.out.println("你的出生日期是："+nl+"年"+yue+"月"+ri+"日");
		int age =  2016-(nl);
		System.out.println("你今年的年龄是："+age+"岁");
		System.out.println("");
}
	}
	/**
	*15位身份证号码
	*/
	public static void fifteen(){
		boolean onoff = false ; 
		String nianl =usesr.substring(6,8);  //截取出生年份
		int nl = Integer.parseInt(nianl); //把截取到的出生年份转为int类型
		String yue = usesr.substring(8,10);    //截取月份
		int zyue = Integer.parseInt(yue);
		String ri  = usesr.substring(10,12);  //截取日期
		int zri = Integer.parseInt(ri);
		String na =  usesr.substring(14);   //截取最后一位
		int zna= Integer.parseInt(na);
		if(nl>2016){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			main(null);
		}else if(zyue>12){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			main(null);
		}else if(zri>31){
			System.out.println("您输入的身份证号码日期有误,请重新输入");
			main(null);
		}else{
			onoff = true ;
		}

		if(onoff = true ){
			if ( zna %2==0){
				System.out.println("");
			System.out.println("是女性");
		}else {
			System.out.println("");
			System.out.println("是男性");
		}
			System.out.println("你的出生日期是："+nl+"年"+yue+"月"+ri+"日");
			int age =  2016-(nl);
			System.out.println("你今年的年龄是："+age+"岁");
			System.out.println("");
		}
	}

	public static void in(){
		System.out.println("按“y”继续查询，任意键退出程序");
		String ok = scanner.next();
		if("y".equals(ok)){
			main(null);
		}else{
			System.out.println("程序已退出,欢迎再次使用！");
			System.exit(0);
		}


	}





}