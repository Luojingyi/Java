import java.util.ArrayList;
import java.util.Iterator;
public class Test{
	public static void main(String[] args) {

		String [] arr1 = {"鄂尔多斯","玉溪","黄鹤楼","荷花","万宝路","利群","荷花","555","兰州","玉溪","爱喜","鄂尔多斯"};
		int [] arr2 = {130,21,19,80,21,19,80,17,80,21,20,130};
		ArrayList list = new ArrayList ();
		ShopCar s ;
		for (int i = 0 ; i<arr1.length;i++) {
			s = new ShopCar(arr1[i],arr2[i]); 
			list.add(s);
		}

		ArrayList a2 = new ArrayList();
		Iterator it = list.iterator();//通过集合内部的一个方法来生成迭代器
		while(it.hasNext()){   //如果有下一个元素，则进行下面的操作
			Object ob = it.next();
			ShopCar pe= (ShopCar)ob;
			if(!a2.contains(pe)){
				a2.add(pe);
			}
		}
		Iterator it2=a2.iterator();
		int priceNum=0;
		while (it2.hasNext()) {
			int num = 0 ;
			ShopCar s2 = (ShopCar)it2.next();
			System.out.print(s2);
			for (int i = 0 ;i<list.size() ;i++ ) {
				if(list.get(i).equals(s2)){
					num ++ ;
				}
			}
			priceNum = num*s2.getPrice()+priceNum;
			System.out.println("    数量："+num+"包");
		}
		System.out.println("总共为："+priceNum+"元");
	}
}

class ShopCar{
	private  String name ;  
	private  int price;   // 价格
	public ShopCar(){}

	public ShopCar(String name,int price){
		this.name = name ;
		this.price = price ;
	}

	public void setName(String name ){
		this.name = name ;
	}
	public String getName(){
		return name ;
	}
	public void setPrice(int price){
		this.price = price ;
	}
	public int getPrice(){
		return price ;
	}

	public boolean equals (Object o ){
		ShopCar s = (ShopCar)o;
		if(this.name.equals(s.name) && this.price == s.price){
			return true ;
		}
		return false ;
	}
	
	public String toString(){
		return "商品名称："+this.name+"---￥"+this.price;
	}
}