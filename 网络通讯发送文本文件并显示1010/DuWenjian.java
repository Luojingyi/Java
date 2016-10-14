import java.net.* ;
import java.io.* ;
import java.util.* ;
public class DuWenjian{
	public static void main(String[] args)throws Exception {
		// FileInputStream fis = new FileInputStream("D:\\DUP1.txt");
		// BufferedInputStream bis = new BufferedInputStream (fis);
		// byte [] b = new byte[1024];
		// int len = 0 ;
		// DatagramSocket ds = new DatagramSocket (2000);
		// while ((len = bis.read(b))!=-1) {
		// 	System.out.println(new String(b,0,len));
		// 	DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),2001);
		// 	ds.send(dp);
		// }
		// String str = "over" ;
		// byte [] b1 = str.getBytes() ;
		// DatagramPacket dp1 = new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),2000);
		// ds.send(dp1);
		// bis.close();

		FileInputStream fis = new FileInputStream("D:\\ooo.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte [] b = new byte [1024] ;
		int len = 0 ;
		DatagramSocket ds = new DatagramSocket (2000) ;
		while((len = bis.read(b))!=-1){
			System.out.println(new String(b,0,len));
			DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),2001);
			ds.send(dp);
		}
		String str = "over" ;
		byte [] b1 = str.getBytes();
		DatagramPacket dp1 = new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),2000);
		ds.send (dp1);
		bis.close() ;



	}
}