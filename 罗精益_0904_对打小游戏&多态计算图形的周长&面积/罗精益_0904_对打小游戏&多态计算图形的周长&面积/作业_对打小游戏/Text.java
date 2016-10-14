import java.util.Scanner ;
import java.util.Random ;
public class Text{

	static Mage  fashi = new Mage();
	static Hunter lieren = new Hunter();
	
	static int p = 1 ;  //统计第几局

	static int fas  = 0 ; //法师赢得的局数
	static int lie = 0 ;   //猎人赢得的局数
	static int i = 0 ;    
	static int gjl = 6 ;   //用户选择的英雄拥有主角光环效果
	static String xzyx;    
	 
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		fas  = 0 ; 
		lie = 0;
		p = 1 ;
		i = 0 ;
		fashi.setBlood(11);
		lieren.setBlood(11);

		System.out.println("请选择你的英雄  1.法师   2.猎人   ");
		 xzyx = scanner.next();
		
		if(xzyx.equals(1+"")){
			System.out.println("请给你选择英雄取一个名字！");
			fashi.setName(scanner.next()+" (法师)"); 
			lieren.setName("电脑 (猎人)"); 
			System.out.println("\n"+"您已拥有主角光环！（攻击力加成！）");
			System.out.println("你的英雄属性：  姓名："+fashi.getName()+"  ,血量："+fashi.getBlood()+"  ,攻击力："+gjl);
			System.out.println("对手英雄属性：  姓名："+lieren.getName()+"   ,血量："+lieren.getBlood()+"  攻击力：5");
		}else if(xzyx.equals(2+"")){
			System.out.println("请给你选择英雄取一个名字！");
			lieren.setName("猎人"+scanner.next());
			fashi.setName("法师(电 脑)");
			System.out.println("你的英雄属性：  姓名："+lieren.getName()+"  ,血量："+lieren.getBlood()+"  ,攻击力："+gjl);
			System.out.println("对手英雄属性：  姓名："+fashi.getName()+"   ,血量："+fashi.getBlood()+"  攻击力：5");
		}else{
			System.out.println("你的选择有误,请重新选择"+"\n");
			main(null);
		}
		System.out.println("\n"+"游戏开始！");
		zhandou();

	}
	public static void zhandou(){
		lieren.setBlood(11);  //重新让英雄为满血
		fashi.setBlood(11);		//重新让英雄为满血
		for ( i = 0 ; i<10;i-- ) {  //死循环 让对手  一直打  直到有一方血量小于等于0
			Random random= new Random();
			int num = random.nextInt(100)+1 ;

				if(num>0 && num<26){	//法师对猎人进行攻击
					lieren.fight();
					int a = lieren.getBlood();
					lieren.setBlood(a-5);
					if(xzyx.equals(1+"")){
						System.out.println(fashi.getName()+" 对 "+lieren.getName()+" 成了"+gjl+"点伤害");
					}else{
						System.out.println(fashi.getName()+" 对 "+lieren.getName()+" 成了了5点伤害");
					}
					
					System.out.println("猎人当前血量还剩："+lieren.getBlood());
					System.out.println("法师当前血量还剩余："+fashi.getBlood()+"\n");
					panduan(); //调用判断英雄血量的方法

				}else if(num> 25 &&num<51){    //法师加血
					fashi.defense();
					int b = fashi.getBlood();
					fashi.setBlood(b+1);
					System.out.println(fashi.getName()+" 使用回血技能  血量+1");
					System.out.println("法师当前血量还剩余："+fashi.getBlood());
					System.out.println("猎人当前血量还剩："+lieren.getBlood()+"\n");
					panduan(); //调用判断英雄血量的方法

				}else if(num>50 && num<76){    //猎人对法师进行攻击
					fashi.fight();
					int c = fashi.getBlood();
					fashi.setBlood(c-5);
					if(xzyx.equals(2+"")){
						System.out.println(lieren.getName()+" 对 "+fashi.getName()+" 造成了"+gjl+"点伤害");
					}else{
						System.out.println(lieren.getName()+" 对 "+fashi.getName()+" 造成了5点伤害");
					}
					
					System.out.println("法师当前血量还剩余："+fashi.getBlood());
					System.out.println("猎人当前血量还剩："+lieren.getBlood()+"\n");
					panduan(); //调用判断英雄血量的方法

				}else if(num>75 && num<101){       //猎人加血
					lieren.defense();
					int d = lieren.getBlood();
					lieren.setBlood(d+1);
					System.out.println(lieren.getName()+" 使用回血技能  血量+1");
					System.out.println("猎人当前血量还剩余："+lieren.getBlood());
					System.out.println("法师当前血量还剩余："+fashi.getBlood()+"\n");
					panduan(); //调用判断英雄血量的方法
				}
			}
		}
	/**
	*  判断英雄的血量，并统计英雄赢得的次数
	*/
	public static void panduan(){
		int faxue = fashi.getBlood();
		int liexue = lieren.getBlood();

		if(faxue<=0){    //如果法师的血量小于0
			
			lie++ ;  //统计猎人赢的局数
			System.out.println("第 "+p+" 局,"+lieren.getName()+"胜利"+"\n");
			p++ ;  //统计第几局
			i=20 ;
			in2();
			zhandou(); // 猎人赢得胜利  重新调用英雄对打的方法

		}
		 if(liexue <= 0 ){   //如果猎人的血量小于0
			fas++ ; //统计法师赢的局数
			System.out.println("第 "+p+" 局,"+fashi.getName()+"胜利"+"\n");
			p++ ;
			i=20 ;
			in2();
			zhandou();
		}
	}

	public static void in(){
			System.out.println("是否继续？  按“y”继续(继续玩下去可以对英雄的攻击力进行强化呦) , 任意键退出程序"  );
			String xz = scanner.next();
			if(xz.equals("y")){
				gjl++ ;   //攻击力每次强化一点
				main(null); //程序从头开始运行
			}else{
				System.out.println("程序已退出,欢迎再次使用");
				 System.exit(0);   //退出程序
			}
		}
		public static void in2(){
		if (lie >= 3) {
			System.out.println("五局三胜。恭喜 " + lieren.getName() + " 取得了最终胜利"+ "\n");
			in();
		}
		if (fas >= 3) {
			System.out.println("五局三胜。恭喜 " + fashi.getName() + " 取得了最终胜利" + "\n");
			in();
		}
	} 
}