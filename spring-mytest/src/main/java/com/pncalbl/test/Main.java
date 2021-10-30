package com.pncalbl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pncalbl
 * @date 2021/10/30 0:44
 * @e-mail pncalbl@qq.com
 * @description
 **/

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User bean = context.getBean(User.class);
		System.out.println("User = " + bean);
	}
}
