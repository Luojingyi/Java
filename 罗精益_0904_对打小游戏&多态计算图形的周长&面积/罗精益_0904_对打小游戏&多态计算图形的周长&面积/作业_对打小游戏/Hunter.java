public class Hunter extends Hero implements  Iweapon2{  //猎人
	
	public Hunter(){}
	public Hunter(String name){
		super(name );
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

	public void fight(){
		//super.setBlood(super.getBlood()-2);
		//System.out.println("法师对猎人造成了5点伤害");
	}
	public void defense(){
		//super.setBlood(super.getBlood()+1);
		//System.out.println("猎人使用加血技能,增加1点生命值");
	}

	public int axe(){
		return 0;
	}

}