package com.manage.system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manage.system.mapper.SigninMapper;

@SpringBootTest
public class MapperTests {
	@Autowired
	private SigninMapper signinMapper;
	
	@Test
	public void testOfSignin() {

		String result = signinMapper.userSignin("admin");
		System.out.println("결과는 " + result + "입니다.");
	}
}
