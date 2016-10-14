import java.util.ArrayList;
import java.util.Iterator;
public class ShopCarTest{
	public static void main(String[] args) {
		//添加商品
		ArrayList a1=new ArrayList();
		a1.add(new Goods("苹果",3));
		a1.add(new Goods("苹果",3));
		a1.add(new Goods("香蕉",3));
		a1.add(new Goods("西瓜",5));
		a1.add(new Goods("西瓜",5));

		//元素去重
		ArrayList a2=new ArrayList();
		Iterator it=a1.iterator();
		int sum=0;
		while(it.hasNext()){
			Goods g=(Goods)it.next();
			sum=sum+g.price;
			if(!a2.contains(g)){
				a2.add(g);
			}
		}

		//统计商品个数
		int[] num=new int[a2.size()];//该数组是存放商品个数的
		//将a1集合中的所有元素和a2集合中的元素进行依次比较，相同则将对应对应下标数组的值加1
		for (int i=0;i<a1.size();i++) {
			for(int j=0;j<a2.size();j++){
				Goods g1=(Goods)(a1.get(i));
				Goods g2=(Goods)(a2.get(j));
				if(g1.equals(g2)){
					num[j]=num[j]+1;
				}				
			}
		}

		//打印商品
		for (int i = 0; i < a2.size(); i++) {
			Goods g=(Goods)a2.get(i);
			System.out.println((g.name+" "+g.price+"元 "+num[i]+"个"));
		}

		//打印总额
		System.out.println("total price:"+sum+"元");
	}
}
class Goods{
	String name;
	int price;
	public Goods(String name,int price){
		this.name=name;
		this.price=price;
	}
	public boolean equals(Object o){
		Goods g=(Goods)o;
		if(this.name.equals(g.name)&&this.price==g.price){
			return true;
		}
		return false;
	}
}