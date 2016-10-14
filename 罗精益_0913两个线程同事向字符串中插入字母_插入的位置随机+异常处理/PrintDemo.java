import java.util.Random ;
public class PrintDemo{
	public static void main(String[] args) {
		Resource r = new Resource();
		Print p = new Print(r);
		Thread t1 = new Thread (p,"线程1");
		Thread t2 = new Thread (p,"线程2");
		t1.start();
		t2.start();

	}
}
class Resource{
	StringBuffer string = new StringBuffer("java");

}

class Print implements Runnable{
	String letter = "qwertyuioplkjhgfdsazxcvbnm";
	private Resource r ; 
	public Print(Resource r){
		this.r = r ;
	}
	Random random = new Random();
	
	public void run(){
		while(r.string.length()<=50){
			synchronized(r){
				try{
					Thread.sleep(10);
				}catch (Exception e) {

				}
				if(r.string.length()>=50){
					break;         
				}
			int a = random.nextInt(letter.length()) ;   //得到一个在在字符串范围内的随机数
			char cha = letter.charAt(a);  //随机从字符串中截取一个字母·用来插入到指定的字符串中
			int b = random.nextInt(10);//得到当前字符串的长度，随机数在要插入的字符串的范围之内
			try{
				r.string.insert(b,cha+""); //把截取到的字符串插入到随机位置；
			}catch(Exception e){
				e.printStackTrace();
				System.out.println();
			}
		}
		System.out.println( Thread.currentThread().getName()+"插入内容，当前字符串长度是："+r.string.length());
		System.out.println("当前内容为："+r.string+"\n");
	}
}
}
