package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();

		list.add(new Human());
		list.add(new Tiger());

		Animal animal1 = list.get(0);
		animal1.sleep();
		animal1.move();
		if (animal1 instanceof Human) {
			Human human = (Human) animal1;
			human.read();
		}

		System.out.println();

		Animal animal2 = list.get(1);
		animal2.sleep();
		animal2.move();
		if (animal2 instanceof Tiger) {
			Tiger tiger = (Tiger) animal2;
			tiger.hunting();
		}

	}

}

class Animal {

	public void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}

	public void move() {
		
	}

}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}

	public void read() {
		System.out.println("사람이 책을 읽습니다");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}