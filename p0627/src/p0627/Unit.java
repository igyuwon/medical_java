package p0627;

abstract public class Unit {
	int hitPoint; // 현재체력
	final int MAX_HP; // 최대체력

	Unit(int hp) {
		MAX_HP = hp;
	}

	int x,y;
//	abstract void move(int x,int y); // 추상메서드, 메서드가 구현되려면 {}가 있어야함
	void stop() {
		
	}
}
