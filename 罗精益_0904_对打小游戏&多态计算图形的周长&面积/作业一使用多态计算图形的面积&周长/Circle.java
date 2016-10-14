public class Circle extends Shape_dete{

	private  double  r ;

	public Circle(){}   //空构造方法

	public Circle( double  r ){ //带参构造方法
		this.r = r ;
	}

	/**
	*  get set  方法
	*/
	public void setR(){
		this.r = r ;
	}

	public double getR(){
		return r ;
	}



	public double geArea(){      //重写父类的方法
		System.out.println("面积是："+(r*r*3.14));

		return r*r*3.14 ;
	}
	public double  geper(){     //重写父类的方法
		System.out.println("周长是:"+(2*r*3.14));

 		return 2*r*3.14 ;
 	}
	


}