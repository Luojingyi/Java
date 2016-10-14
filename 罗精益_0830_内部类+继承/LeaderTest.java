import java.util.Random;
public class LeaderTest{
	public static void main(String[] args) {
		Random r = new Random();
		int sj = r.nextInt(18)+1;
		int a = r.nextInt(21)+55;  //产生 20 到 75之间的随机数
			
		Minister buzhang = new Minister("部长,",27 ,sj);//实例化 部长
		buzhang.lead();  //并调用 部长的工作方法
		
		Director juzhang = new Director ("局长",38,150);//实例化 局长
		juzhang.lead();//调用 局长的工作方法

		Director.Assistant xiaomi = juzhang.new Assistant("小秘",20);//实例化小秘（内部类） 
		xiaomi.useMoney(a);   //调用小秘 花钱技能
		int qian = juzhang.getMoney(); //获取局长的money
		int liv = buzhang.getLevel();  //获取局长的等级
		 
		 if(qian<100){   //判断局长的钱是否小于100万
		 	if(liv>=10){
		 		System.out.print("发现局长的小秘,部长当前等级为："+liv+"级,");
		 		buzhang.against(); //部长开始反腐
		 		juzhang.setMoney(0);//将局长的财产设置为0

		 		System.out.println("将局长的财产没收");
		 	}else{
		 		System.out.println("但是部长当前等级为："+liv+"级,并没有权利反腐局长");

		 	}
		 	
		 }


	}
}