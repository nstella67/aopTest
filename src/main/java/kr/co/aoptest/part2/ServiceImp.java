package kr.co.aoptest.part2;

public class ServiceImp implements Service {
	@Override
	public void first() {
		System.out.println("---first()");
	}
	
	@Override
	public void first(String str) {
		System.out.println("---"+str+"first()");
	}
	
	@Override
	public void second() {
		System.out.println("---second()");
	}
}//class end
