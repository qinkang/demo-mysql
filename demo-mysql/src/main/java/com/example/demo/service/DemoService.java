package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestMapper;
import com.example.demo.model.Test;
import com.example.demo.model.TestExample;

/**
 * 了烧烤大家
 * @author qinkang
 *
 */
@Service
public class DemoService {
	@Autowired
	private TestMapper testMapper;
	public String getName() {
		TestExample example = new TestExample();
		example.createCriteria().andIdEqualTo(1);
		List<Test>  list = testMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			return list.get(0).getName();
		}
		return null;
	}
}
