package com.pncalbl.test;

/**
 * @author pncalbl
 * @date 2021/10/30 0:35
 * @e-mail pncalbl@qq.com
 * @description
 **/

public class User {
	private String username;
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
