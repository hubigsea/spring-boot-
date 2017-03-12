package com.ibigsea.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置,Spring boot 自身的自动配置
 * @author bigsea
 *
 */
@ConfigurationProperties(prefix="hello")
public class HelloProperties {
	
	private static final String MSG = "world";
	
	private String msg = MSG ;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
