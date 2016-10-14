public class Rectangle extends Shape_dete{
	double length ;
	double wide ;
	public Rectangle(){}  //空构造

	public Rectangle(double length,double wide){   //带参构造
		
		this.length = length ;
		this.wide = wide ;
	}

	/**
	*get  set  方法
	*/
	public void setLength(){
		this.length =length ;
	}
	public double getLength(){
		return length ;
	}
	public void setWide(){
		this.wide =wide ;
	}
	public double getWide(){
		return wide ;
	}
  
	public double geArea() {     //重写父类的方法  
		System.out.println("面积是："+(length * wide));
    	return length * wide;
 	}

 	public double geper(){         //重写父类的方法
 		System.out.println("周长是："+(length+wide)*2);
 		return (length+wide)*2;
 	}






}