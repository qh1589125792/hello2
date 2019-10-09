package com.atguigu.maven;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import com.atguigu.maven.Hello;

public class HelloFriendTest {
	@Test
	public void testHelloFriend(){
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("weiwei");
		assertEquals("Hello weiwei!I am John",results);	
		System.out.println("测试结果" + results);
	}

}

