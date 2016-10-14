import java.io.* ;
import java.util.*;
public class Text{
	public static void main(String[] args) throws Exception{
		
		File f = new File("D:\\s.txt");
		long time = 0 ;
		Properties p = new Properties();
		p.load(new FileInputStream(f));
		time = Long.parseLong(p.getProperty("time"));
		long time1 = System.currentTimeMillis(); // 获取系统当前时间
		int i = 30 ;
		while ((Long.parseLong(p.getProperty("time")))<30000) {
			
			try{
				Thread.sleep(50);
			}catch (Exception e) {
				
			}
			time = Long.parseLong(p.getProperty("time"));
			long time2 = System.currentTimeMillis();// 获取系统当前时间
			time = time + time2 - time1 ;
			p.setProperty("time",time+"");
			p.store(new FileOutputStream(f),"");
			System.out.println("你现在还有"+(i-1)+"秒使用时间");
			//System.out.println("你现在还有"+((30000-time)/1000)+"秒使用时间");
			
			i--;

			
		}
		System.out.println("免费使用时间已使用完毕  请充值");
	}
}