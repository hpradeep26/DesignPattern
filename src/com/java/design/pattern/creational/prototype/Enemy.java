package com.java.design.pattern.creational.prototype;

public class Enemy implements EnemyPrototype{

	private String type;
	private int health;
	private double speed;
	private boolean armored;
	private String weapon;

	public Enemy(String type, int health, double speed, boolean armored, String weapon) {
		super();
		this.type = type;
		this.health = health;
		this.speed = speed;
		this.armored = armored;
		this.weapon = weapon;
	}


	@Override
	public Enemy Clone() {
		return new Enemy(type, health, speed, armored, weapon);
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void printStats() {
		System.out.println(type + " [Health: " + health +
				", Speed: " + speed +
				", Armored: " + armored +
				", Weapon: " + weapon + "]");
	}
}
