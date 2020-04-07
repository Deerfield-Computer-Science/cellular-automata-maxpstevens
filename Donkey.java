import java.awt.Color;

public abstract class Donkey extends Animals {

	public Donkey(int mls, Location ml, Color mc, World mw) {
		super(ml, mw);
		myColor = Color.YELLOW;
		myLifeSpan = 12;
		myLevel=2;
	}
	
	public void reproduce() {
		int newX = (int)(3);
		int newY = (int)(3); 
		
		myWorld.getCreatureList().add(new Donkey(new Location(newX,newY), myWorld));
	}
	
	public void move() {
		Location newX = getMyLocation();
		int x = newX.getX();
		int y = newX.getY();
		y+=1;
		x+=1;
		myLocation.setX(x);
		myLocation.setY(y);
	}
	
	public void eat() {
		int x1;
		int x2;
		int y1;
		int y2;
		int d1;
		int d2;
		int currentSizeOfCreatureList = creatureList.size();
			for(int j=0; j< currentSizeOfCreatureList; j++) {
				x1=this.getMyLocation().getX();
				y1=this.getMyLocation().getY();
				x2=creatureList.get(j).getMyLocation().getX();
				y2=creatureList.get(j).getMyLocation().getY();
				d1 = x1-x2;
				d2 = y1-y2;
				if(Math.sqrt(Math.pow(d1, 2)+Math.pow(d2, 2))<Math.sqrt(2)) {
					if(creatureList.getLevel()<this.getLevel()) {
					creatureList.get(j).alive = false;
					}
				}
			}
		}
	}


}
