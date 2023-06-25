package game;

public abstract class Unit {
	private int nowhp; //현재 hp
	private int maxhp; //최대 hp
    private int power; 
    private String name;
    private String stage="normal";
    
    Unit(){
    	
    };
    
    Unit(String n, int m, int p ){
    	name=n;
    	nowhp=m;
    	maxhp=m;
    	power=p;
    	
    	
    }
    //getter
    public String getName() {
    	return this.getName();
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    //초기값
    void init() {
    	
    }
    
    void attack() {
    	
    }
    
    
    
    
    
	
	
}
