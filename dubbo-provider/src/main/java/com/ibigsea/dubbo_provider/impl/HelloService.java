package com.ibigsea.dubbo_provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ibigsea.service.BaseService;

@Service(group="helloService", version="1.0")
public class HelloService implements BaseService {

	@Override
	public String build(String str) {
		return "hello "+str+" !";
	}

}
