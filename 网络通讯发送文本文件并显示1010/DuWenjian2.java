import java.net.* ;
import java.io.* ;
import java.util.* ;
public class DuWenjian2{
	public static void main(String[] args)throws Exception {
		// InetAddress in = InetAddress.getLocalHost() ;	

		// FileOutputStream fil = new FileOutputStream ("D:\\DUP2.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fil);
		// DatagramSocket ds = new DatagramSocket(2001);
		// while (true) {
		// 	byte [] b = new byte[1024] ;
		// 	DatagramPacket dp=new DatagramPacket(b,b.length);
		// 	ds.receive(dp);
		// 	String str = new String (dp.getData(),0,dp.getLength());
		// 	if(str.contains("over")){
		// 		break;
		// 	}
		// 	byte [] result = dp.getData();
		// 	bos.write(result,0,dp.getLength());
		// 	bos.flush();
		// 	System.out.println(str);
		// }
		// ds.close();

		IntetAddress in = InetAddress.getLocalHost();
		FileOutputStream fil = new FileOutputStream("D:\\ooo2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fil);
		DatagramSocket ds = new DatagramSocket(2001) ;
		while(true){
			byte [] b = new byte[1024] ;
			DatagramPacket dp = new DatagramPacket(b,b.length);
			ds.receive(dp);
			String srt = new String (dp.getData(),0,dp.getLength()) ;
			if(str.contains("over")){
				break; 
			}
			byte [] result = dp.getData ();
			bos.write (result,0,dp.getLength()) ;
			bos.flush();
			System.out.println(str);
		}
		ds.close() ;




	}
}