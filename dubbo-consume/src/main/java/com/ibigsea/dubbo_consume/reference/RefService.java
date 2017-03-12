package com.ibigsea.dubbo_consume.reference;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ibigsea.service.BaseService;

@Service("refService")
public class RefService {
	
	@Reference(group="helloService", version="1.0")
	private BaseService baseService;
	
	public String sayHello(String name){
		return baseService.build(name);
	}
	
}
