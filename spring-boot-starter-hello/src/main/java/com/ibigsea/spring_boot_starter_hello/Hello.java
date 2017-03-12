package com.ibigsea.spring_boot_starter_hello;

/**
 * 通过application.properties的hello.msg来配置,默认为world
 * @author bigsea
 *
 */
public class Hello {
	
	private String msg;

	public String sayHello() {
		return "hello " + msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
