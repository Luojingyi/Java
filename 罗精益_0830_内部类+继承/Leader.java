
public class Leader{     //领导   父类
	public String name;
	public int age ;
	/**
	*空构造方法
	*/
	public Leader(){} 
	/**
	*带参构造方法
	*/
	public Leader(String name,int age){
		super();
		this.name = name ;
		this.age= age ;
	}

	/**
	*get set方法
	*/
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

	
	public void lead(){    //工作
		System.out.println("领导工作");
	}


	
}