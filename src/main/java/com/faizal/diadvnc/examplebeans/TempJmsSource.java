package com.faizal.diadvnc.examplebeans;

public class TempJmsSource {

	private String username;
	private String password;
	private String url;

	public TempJmsSource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempJmsSource(String username, String password, String url) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
