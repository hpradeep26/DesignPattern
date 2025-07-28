package com.java.design.pattern.creational.prototype;

public class GameMain {

	public static void main(String[] args) {
		EnemyRegistry registry = new EnemyRegistry();
		// Register prototype enemies
		registry.register("flying", new Enemy("FlyingEnemy", 100, 12.0, false, "Laser"));
		registry.register("armored", new Enemy("ArmoredEnemy", 300, 6.0, true, "Cannon"));
		
		 Enemy e1 = registry.get("flying");
	     Enemy e2 = registry.get("flying");
	     e2.setHealth(80); // maybe this one was spawned with less HP
	     
	     Enemy e3 = registry.get("armored");	
	     
	     e1.printStats();
	     e2.printStats();
	     e3.printStats();
	}

}
