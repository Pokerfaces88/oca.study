package oca.study.chapter1;

public class Animal implements Moveable {

	public static void main(String[] args) {
		
		Fish salmon = new Fish();
		Bird ostrich = new Bird();
		Human cormac = new Human();
		Mountain k2 = new Mountain();
		
		salmon.move();
		ostrich.move();
		cormac.move();
		k2.move();
		
	}
	
	public void move(Animal a){
		a.move();
	}
	
	public void move() {
		move();
	}


}

abstract interface Moveable{
	public abstract void move();
}

class Fish extends Animal{
	public void move() {
		System.out.println("Fish swim");
	}
}

class Bird extends Animal{
	public void move() {
		System.out.println("Birds fly");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("Humans can walk run swim fly and many other things");
	}
}

class Mountain implements Moveable{
	public void move() {
		System.out.println("Mountains don't move George!");
	}
}