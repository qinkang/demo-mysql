package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

/**
 * 请求入口
 * @author qinkang
 *
 */
@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/getName")
	public String getName() {
		return demoService.getName();
	}
	
}
