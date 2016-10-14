
import java.util.Calendar;
public class Post{
	public static void main(String[] args) {

		loginy();
		
	}

	/**
	*登录 login
	*@author luojy
	*@version V1.0
	*/
	public static void loginy(){
		String name = "yuann";   //用户名
		String pssw = "123456";   //用jiequ户密码
		String string="http://120.32.4.343:8080/login.jsp?name=yuann&&password=123456&&sex=men&&login=1470277690256";
		String string1 = string.replace("?"," ");
		String [] arr = string1.split(" ");
		String [] arr1 = arr[1].split("&&");
		String [] usename = arr1[0].split("=");  //得到用户名
		//System.out.println(usename[1]);
		String [] usepassw = arr1[1].split("=");  //得到密码
		// System.out.println(usename[1]);
		// System.out.println(usepassw[1]);
		
		if(name.equals(usename[1])&&pssw.equals(usepassw[1])){
			Calendar calendar = Calendar.getInstance(); //获取一个日历的对象
			int nian = calendar.get(Calendar.YEAR);// 获取年分
			int yue = calendar.get(Calendar.MONTH)+1;//月份是从0开始
			int ri = calendar.get(Calendar.DATE);//获取日
			System.out.println("登录成功,用户名："+usename[1]+" ,登陆时间："+nian+"/"+yue+"/"+ri);
			removal();
		}

}

  /**
	*登陆成功之后把过期的帖子删除 removal
	*@author luojy
	*@version V1.0
	*/
   public static void removal(){

   		String [] xinshuzu ;
   		
   		 StringBuffer strbuf =new StringBuffer("");

   		Calendar calendar= Calendar.getInstance(); //获取一个日历的对象
   		int shijitian = calendar.get(Calendar.DAY_OF_YEAR);//获取当前一年当中的第几天
   		//System.out.println(shijitian);

   		String[] postStamp={"20160201","20160412","20160529","20160720","20160802"}; //发帖日期
   		int[] zan={				12,			44,			78,		135,		23        }; //每个帖子的点赞数量

   		int []riqi = new int[postStamp.length];
   		for (int i = 0; i<postStamp.length;i++ ) {

   			String jiequyue = postStamp[i].substring(4,6);//截取月份
   			String jiequri = postStamp[i].substring(6);  //截取日
   			
   			int yue = Integer.parseInt(jiequyue)-1;  //将月份转为int类型
   			int ri = Integer.parseInt(jiequri);//将日转为i

			calendar.set(Calendar.MONTH,yue);  //修改日期
			calendar.set(Calendar.DATE,ri);

			int tian = calendar.get(Calendar.DAY_OF_YEAR);//获取修改过后的一年当中的第几天
			//System.out.println(tian);
			if((shijitian-tian)<100){

				strbuf.append(i);//把过期的帖子的下标存入当中
				//xinshuzu[p] = postStamp[i];	
			}
			//xinshuzu = new String [p];
		}
       
		xinshuzu = new String [strbuf.length()];
		String yi = strbuf.substring(0,1);
		String er  = strbuf.substring(1,2);
		String san = strbuf.substring(2);

		int y = Integer.parseInt(yi);
		int e = Integer.parseInt(er);
		int s = Integer.parseInt(san);

		int po []  = {y,e,s};

		for (int l = 0 ;l<strbuf.length() ; l++) {
			xinshuzu[l] = postStamp[po[l]];
			System.out.println(xinshuzu[l]);
		}
		int kai = 0 ;
		int id = 0 ;
		for (int i = 0;i<xinshuzu.length ; i++) {
			
			for (int j = 0;j<zan.length ;j++ ) {
				if(zan[j]>kai){
					kai=zan[j];
					int a = (zan.length)-(xinshuzu.length);
					id = (j-a)+1;
				}
			}
		}
		System.out.println("帖子的点赞数最多的是："+kai+",第"+id+"篇");
   }
}
