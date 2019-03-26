package kr.co.aoptest.part1;

public class GilGong {
	void say() {
		System.out.println("나는 홍길동입니다");
	}
	
	public static void main(String[] args) {
		//AOP 연습
		new GilGong().say();
	}//main() end
}//class end
