import java.util.Random;
public class MaxIndex{
	public static void main(String[] args) {

		int a = 15 ; //控制数组的大小
		int num  ;
		Random random= new Random();
		int [] arr = new int [a]; 
		for (int i = 0 ; i<a ; i++ ) {
			num = random.nextInt(91)+10; //生成10~100之内的随机数
			arr[i] = num;
			System.out.println("第"+(i+1)+"个数是："+num);
		}

		int big =0; //用于得到最大值
		int xiabiao=0 ;  //用于得到最大值的下标
		for (int i = 0 ;i<arr.length ;i++ ) {
			if(arr[i]>big){
				big = arr[i] ;
				xiabiao = i ;
			}
		}
		System.out.println("最大值是："+big+",下标是："+xiabiao);	
}
}