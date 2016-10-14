import java.util.*;
public class NewsClient{
	public static void main(String[] args) {
		HashMap<String,ArrayList<Wenzhang>> hm = new HashMap<String,ArrayList<Wenzhang>>();
		ArrayList<Wenzhang> arr1 = new ArrayList<Wenzhang>();//军事集合
		arr1.add(new Wenzhang("军事01",56));
		arr1.add(new Wenzhang("军事02",107));
		arr1.add(new Wenzhang("军事03",28));

		ArrayList<Wenzhang> arr2 = new ArrayList<Wenzhang>();//娱乐集合
		arr2.add(new Wenzhang("娱乐01",280));
		arr2.add(new Wenzhang("娱乐02",78));
		arr2.add(new Wenzhang("娱乐03",298));

		ArrayList<Wenzhang> arr3 = new ArrayList<Wenzhang>();//体育集合
		arr3.add(new Wenzhang("体育01",285));
		arr3.add(new Wenzhang("体育02",170));
		arr3.add(new Wenzhang("体育03",570));
			
		hm.put("军事",arr1);
		hm.put("娱乐",arr2);
		hm.put("体育",arr3);

		// Set<String> set = hm.keySet() ; //将所有的键值得到放入Set集合当中
		// Iterator<String> it = set.iterator();
		Set<Map.Entry<String,ArrayList<Wenzhang>>>  set = hm.entrySet() ; //将所有的键值得到放入Set集合当中
		Iterator<Map.Entry<String,ArrayList<Wenzhang>>> it = set.iterator();   //将集合中的所有元素放到迭代器
		while (it.hasNext()) {
			// String k = it.next();
			// ArrayList<Wenzhang> v = hm.get(k);
			// Iterator<Wenzhang> it1 = v.iterator();
			Map.Entry<String,ArrayList<Wenzhang>> em=it.next(); //  开始迭代所有的元素，k&v的关系
			String v=em.getKey();   //得到k值
			ArrayList<Wenzhang> al=em.getValue();
			Iterator<Wenzhang> it1=al.iterator();
			while (it1.hasNext()) {
				Wenzhang w = it1.next();
				System.out.println(w);
			}
			System.out.println();
		}


	}
}

class Wenzhang{
	String name ;
	int num ;
	public Wenzhang(String name , int num ){
		this.name = name ;
		this.num = num ;
	}
	public String toString (){
		return "("+name+","+num+")";
	}
}