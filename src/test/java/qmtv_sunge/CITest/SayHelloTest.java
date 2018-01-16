package qmtv_sunge.CITest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for SayHello .
 */
public class SayHelloTest{
	@BeforeTest
	public void beforeTest(){
		System.out.println("----开始执行SayHello的测试----");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("----执行SayHello的测试完毕!----");
	}
	
	@Test
	public void testHello(){
		System.out.println("---->>>>正则执行testHello的测试----");
		SayHello hello = new SayHello();
		String results = hello.sayHello("李小璐");
		assertEquals("Hello 李小璐, welcome to Maven world.",results);		
	}
	
}
