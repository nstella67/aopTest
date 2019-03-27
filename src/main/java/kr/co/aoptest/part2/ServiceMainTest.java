package kr.co.aoptest.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceMainTest {

	public static void main(String[] args) {
		//스프링빈을 이용한 AOP
		String aop="src/main/java/kr/co/aoptest/part2/aop.xml";
		ApplicationContext context=new FileSystemXmlApplicationContext(aop);
				
		//1) POJO방식의 객체 생성
		//Service svc=new ServiceImp();
		
		//2) 스프링빈 방식의 객체 생성
		Service svc=(Service)context.getBean("svc");
		
		svc.first();
		svc.first("KOREA");
		
		svc.second();

	}//main() end

}//class end
