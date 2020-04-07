import java.awt.Color;

public abstract class BunnyNoLegs extends Animals {

	public BunnyNoLegs(Location myLocation, World myWorld) {
		super(myLocation, myWorld);
		myColor = Color.DARK_GRAY;
		myLifeSpan = 3;
		myLevel=1;
	}

	public void reproduce() {
		int newX = (int)Math.random()*(2);
		int newY = (int)Math.random()*(2); 
		
		myWorld.getCreatureList().add(new BunnyNoLegs(new Location(newX,newY), myWorld));
	}
}
