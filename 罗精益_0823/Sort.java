import java.util.Scanner;
import java.util.Random;
public class Sort{
		static int num = 15 ;  //用来控制数组的大小
		static Random random = new Random();
		static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean kai = true ;   //用来控制循环的开关
		while(kai){
			System.out.println("1，选择排序法。  2，冒泡排序法。 任意键退出程序");
		    String xz = scanner.next();
		switch (xz) {
			case 1+"" :   
			yi();  

			break;
			case 2+"" :   
				er() ;

			break;
			default:
			System.out.println("程序已退出，欢迎再次使用");
			kai = false ;
			break;
		}
	}
	}

	/**
	*选择排序
	*/
	public static void  yi(){  
		int a; 
		int [] arr = new int [num] ;
		System.out.println("系统分别生成了15个（10~100）之间的随机数");
		for (int i = 0 ;i<num ;i++ ){
 			a = random.nextInt(91)+10; //生成10~100之内的随机数
 			arr [i] = a ;   //分别把随机数存进数组中
 			System.out.println("第"+(i+1)+"个数是："+a);
 		}
 		System.out.println();
 		/*
 		*选择排序法
 		*/
 		for (int i = 0 ;i<arr.length ;i++ ) {
 			for (int j =i+1 ;j<arr.length ;j++) {
 				if(arr[i]>arr[j]){
 					int num1 ;
 					num1 = arr[i];
 					arr[i] = arr[j] ; 
 					arr[j] = num1 ;
 				}
 			}
 		}
 		System.out.println("最小值是："+arr[0]+",最大值是："+arr[arr.length-1]);
 		System.out.println();
 	}

 	/**
 	*冒泡排序方法
 	*/
 	public static void er(){
 		int a ;
 		int [] arr = new int [num] ;
		System.out.println("系统分别生成了15个（10~100）之间的随机数");
		for (int i = 0 ;i<num ;i++ ){
 			a = random.nextInt(91)+10; //生成10~100之内的随机数
 			arr [i] = a ;   //分别把随机数存进数组中
 			System.out.println("第"+(i+1)+"个数是："+a);
 			
 		}
			System.out.println();
 		for (int i = 0 ; i<arr.length-1; i++) {
 			for (int j = 0;j<arr.length-i-1 ;j++ ) {
 				if(arr[j]>arr[j+1]){
 					int num2;
 					num2 = arr[j] ;
 					arr[j] = arr[j+1] ;
 					arr[j+1] = num2 ;
 				}
 			}
 		}
 			System.out.println("最小值是："+arr[0]+",最大值是："+arr[arr.length-1]);
 			System.out.println();



 	}



 }



