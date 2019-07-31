package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.DemoService;

/**
 * 测试类
 * @author qinkang
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMysqlTest {
	@Autowired
	private DemoService demoService;
	
	@Test
	public void getName() {
		System.out.println(demoService.getName());
		
	}

}
