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
		String name = "贾乃亮";
		System.out.println("马上和"+name+"say Hello啦...");
		String results = hello.sayHello(name);
		assertEquals("Hello "+name+", welcome to Maven world.",results);		
	}
	
}
