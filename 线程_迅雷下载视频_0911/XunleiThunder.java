import java.util.Random ;
import java.util.Scanner;
public class XunleiThunder{
	static int leng = 0 ;
	
	public static void main(String[] args) {

		System.out.println("请输入你要下载视频的数量：");
		Scanner scanner = new Scanner(System.in);
		leng = scanner.nextInt();

		Xunlei x = new Xunlei();
		System.out.println("一共要下载"+leng+"部电影,下载即将开始,正在初始化资源...");
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(x);
		Thread t3 = new Thread(x);
		t1.start();
		t2.start();
		t3.start();
	}
}
class Xunlei implements Runnable{
	
	int a = XunleiThunder.leng;
	
	Object obj = new Object();
	public void run(){
		// while (a>0) {
		// 	synchronized (obj){
		// 		if(a>0){
		// 			try{
		// 				Random a = new Random();
		// 				Thread.sleep(a.nextInt(1200)+10);
		// 			}catch(Exception e){
		// 				e.printStackTrace();
		// 			}
		// 			System.out.println("第"+(a-(a-b))+"部视频下载完成！");
		// 			a--;
		// 			b++;
		// 			if(a == 0 ){
		// 				System.out.println("恭喜你,所有视频已下载完成！");
		// 			}
		// 		}
		// 	}
		// }

		synchronized (obj){
			//try{
				Xunlei.xiazai(0);
			// }catch(XiazaiLanping e){
			// 	System.out.println(e.getMessage());
			// 	System.out.println("请输入‘1’重新连接宽带");
			// 	Scanner scann = new Scanner(System.in);
			// 	int sr = scann.nextInt();
			// 	// if(sr == 1 ){
			// 	// 	System.out.println("网络已恢复！重新开始下载");
			// 	// 	Xunlei.xiazai(XunleiThunder.lan);
			// 	// }
			// }
			
		}
	}

public static void xiazai(int lan){
	int a = XunleiThunder.leng;
	int b = 1 ;

	
	while (a>0) {
			//synchronized (obj){
				if(a>0){
					// if(a==10){
					// 	throw new XiazaiLanping("电脑蓝屏了！");
					// 	//lan = a ;
					// }else{
					//try{
						//Random ran = new Random();
						//Thread.sleep(ran.nextInt(1000)+10);
					//}catch(Exception e){
					//	e.printStackTrace();
					//}
					System.out.println("第"+(a-(a-b))+"部视频下载完成！");
					a--;
					b++;
					if(a == 0 ){
						System.out.println("恭喜你,所有视频已下载完成！");
					}
					//}
				}
			//}
		}

} 





}
class XiazaiLanping extends RuntimeException{   //蓝屏
	public XiazaiLanping(String name ){
		super(name);
	}
}

class XiazaiDuanwang extends RuntimeException{   //断网
	public XiazaiDuanwang(String name ){
		super(name);
	}
}

