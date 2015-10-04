
public class ZombieAI {
	
	boolean zombieIsApproching;  // True if the zombie is coming at us
	boolean haveGun;             // Keeps track of if we have a gun or not
	boolean haveBat;             // Keeps track of if we have a baseball bat 
	int ammunitionCount;         // Number of bullets left in the gun
	
	public void killZombie() {
		// Check if there is a zombie nearby
		zombieIsApproching = lookAround();
		while (zombieIsApproching) {
			// There is a zombie, decide action
			if (haveGun && (ammunitionCount > 0)) {
				// Try shooting the zombie
				shotZombie();
				ammunitionCount = ammunitionCount - 1;
			} else if (haveBat) {
				// Try beating the zombie
				beatZombieWithBat();
			} else {
				// Try running away from the zombie
				runForYourLife();
			}
			// Action have been performed evaluate if it worked
			zombieIsApproching = lookAround();
		}
	}
}

