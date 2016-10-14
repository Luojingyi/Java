public class Minister extends Leader{   //部长 继承领导类
	
	public int level; //等级
	/**
	*空构造方法
	*/
	public Minister(){} 
	/**
	*带参构造方法
	*/
	public Minister(String name,int age,int level ){
		super(name,age);
		this.level =level;
	}

	/**
	*get set方法
	*/
	public void setLevel(int level){
		this.level =  level ;
	}
	public int  getLevel(){
		return level ;
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

	public void against(){   //反腐
		System.out.println("部长开始反腐工作");
	}



	public void lead(){    //工作方法
		System.out.println("部长领导工作");
	}

	public void show(){  //输出信息
		System.out.println(name+"年龄："+age+",等级："+level);
	}


}