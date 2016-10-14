import java.util.ArrayList;
import java.util.Iterator;
// import java.util.List;
// import java.util.ListIterator;
// import java.util.LinkedList;
class ShopTest{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		Commodity c1=new Commodity("乐事薯片原味",8);
		Commodity c2=new Commodity("康帅傅冰红茶",4);
		Commodity c3=new Commodity("话梅",11);
		Commodity c4=new Commodity("六味地黄丸",20);
		Commodity c5=new Commodity("杜蕾斯",12);
		Commodity c6=new Commodity("乐事薯片原味",8);
		Commodity c7=new Commodity("乐事薯片青柠味",8);
		Commodity c8=new Commodity("喜之郎",3);
		Commodity c9=new Commodity("喜之郎",3);
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		a1.add(c5);
		a1.add(c6);
		a1.add(c7);
		a1.add(c8);
		a1.add(c9);
		ArrayList a2=new ArrayList();
		Iterator it1=a1.iterator();
		while(it1.hasNext()){//先把a1不同的复制到a2
			Commodity com=(Commodity)it1.next();
			if (!a2.contains(com)) {
				a2.add(com);
			}
		}
		/*
		遍历a2中的元素，与a1中的比较有相同的就加1
		*/
		Iterator it2=a2.iterator();
		int priceNum=0;
		while(it2.hasNext()){
			int num=0;
			Commodity com1=(Commodity)it2.next();
			System.out.print(com1);
			for (int i=0;i<a1.size() ;i++ ) {
				if (a1.get(i).equals(com1)) {
					num++;
				}
			}
			priceNum=num*com1.getPrice()+priceNum;	
			System.out.println(" "+num);	
		}
		System.out.println("总共为"+priceNum);		
	}
}
class Commodity{
	String name;
	int price;
	public Commodity(String name,int price){
		this.name=name;
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		return name+" "+price;
	}
	public boolean equals(Object o){
		Commodity p=(Commodity)o;
		if (this.name.equals(p.name)&&this.price==p.price) {
			return true;
		}
		return false;
	}
}
