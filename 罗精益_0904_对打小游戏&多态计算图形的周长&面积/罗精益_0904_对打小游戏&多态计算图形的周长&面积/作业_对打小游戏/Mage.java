public class Mage extends Hero implements  Iweapon1{  //法师

	public Mage(){}
	public Mage(String name){
		super(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return  name ;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getBlood(){
		return  blood ;
	}

	

	public void fight(){  //战斗
		//super.setBlood(super.getBlood()-2);
		//System.out.println("猎人对法师造成5点伤害");
	}

	public void defense(){  //防御
		//super.setBlood(super.getBlood()+1);
		//System.out.println("法师使用加血技能,增加1点生命值");
	}

	public  int sword(){   //剑
		return  0 ; 
	} 


}