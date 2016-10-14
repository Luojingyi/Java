public abstract class Hero {
	public   String name;
	public int blood=11;//血量
	
	
	public Hero(){}
	public Hero(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	
	public abstract void fight();
	public abstract void defense();
}
