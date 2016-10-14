	import java.util.Scanner ;
	import java.util.Calendar;
	import java.text.SimpleDateFormat;
	public class DateFormatTester{
	public static void main(String[] args) {

		String sr ="";
		Scanner scanner = new Scanner(System.in);
		boolean kai = true ;
		while(kai){
			System.out.println("请输如你要查询的日期：");
			sr = scanner.next();
			if(sr.length() != 10){
				System.out.println("你输入的日期格式有误.(2016/06/01)");
				continue ;
			}else{
					Calendar calendar= Calendar.getInstance(); //获取一个日历的对象
					int xtxq = calendar.get(Calendar.WEEK_OF_YEAR);   //获取当前的星期在当年的第几个星期
					int  xtnian = calendar.get(Calendar.YEAR);// 获取年分
					String n  = sr.substring(0,4); //截取用户输入的日期  年
					String y  = sr.substring(5,7);   //月
				 	String r  = sr.substring(8);     //日

				    int nian  = Integer.parseInt(n);  //将数字转为int类型
				    int yue   = Integer.parseInt(y)-1;
				    int ri    = Integer.parseInt(r);

				    calendar.set(Calendar.YEAR,nian);//修改日期   2015 2 12    1212-212
					calendar.set(Calendar.MONTH,yue);
				    calendar.set(Calendar.DATE,ri);
				    int srxq = calendar.get(Calendar.WEEK_OF_YEAR);   //一年中的第几个星期

				    long time=calendar.getTimeInMillis();
					SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
					String dateStr=dateFormat.format(time);
					System.out.println(dateStr);

				    if(nian%4==0){
				   	int a = 365/7;  //得到多少个周
				   	int b = 365%7;  //余多少天
				   	int dedaoxq = xtxq-srxq;  //得到相差多少个星期
				   	int dedaonian = xtnian-nian; //当前的年份减去用户要查询的年份得到相差多少年
				   	if(dedaonian != 0 ){
				   		int xiangchaxq  = (dedaonian*a)+dedaoxq;  // 加上相差的星期
				   		 System.out.println("相差"+xiangchaxq+"个星期");
				   	}else{
				   		 int xiangchaxq = dedaonian+dedaoxq;
				   		   System.out.println("相差"+xiangchaxq+"个星期");
				   	}
				   }else{
				   	int c = 365/7;  //得到多少个周
				   	int d = 365%7;  //余多少天
				   	int dedaoxq2 = xtxq-srxq;  //得到相差多少个星期
				   	int dedaonian2 = xtnian-nian; //当前的年份减去用户要查询的年份得到相差多少年
				   	if(dedaoxq2 != 0 ){
				   		int xiangchaxq2 = (dedaonian2*c)+dedaoxq2;  // 加上相差的星期
				   			System.out.println("相差"+xiangchaxq2+"个星期");
				   	}else{
				   		int xiangchaxq2 = dedaonian2+dedaoxq2; 
				   			System.out.println("相差"+xiangchaxq2+"个星期");
				   	}
				   	//System.out.println(d);
				   }
			}
		}	
	}
}