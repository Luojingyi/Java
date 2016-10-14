public class Director extends Leader{  //局长类
	public int money ;  //钱
	public String name;
	public int age ;

	/**
	*空构造方法
	*/
	public Director(){}

	/**
	*带参构造方法
	*/
	public Director(String name,int age ,int money){
		super(name,age);
		this.money = money ;
	}

	/**
	*get set方法
	*/
	public void setMoney(int money){
		this.money =money;
	}
	public int getMoney(){
		return money ;
	}
	public void setName(String name){
		this.name =  name ;
	}
	public String getName(){
		return name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public int getAge(){
		return age ;
	}

	public void lead(){
		System.out.println("局长领导工作");
	}





	void dateAssistant(){   //约小秘
		System.out.println("约小秘");
	}

	public class Assistant{  //小秘 内部类
	public	String name;
	public	int age;
	public Assistant(){

	}

	public Assistant(String name,int age){
		this.name = name ;
		this.age = age ;
		
	}
	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return name ;
	}
	
	public void setAge(int  age){
		this.age =age;
	}
	public int getAge(){
		return age ;
	}



	public void  useMoney(int a ){//花钱，内部类可以直接访问外部类属性
		money = money-a;
		System.out.println("小秘一共消费了："+a+"万,局长还剩下"+money+"万");
		
	}




	}




}