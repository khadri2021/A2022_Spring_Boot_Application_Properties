package com.khadri.spring.boot.application.props.oracle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OracleConnection {
	
	@Value("${oracle.user}")
	private String user;

	@Value("${oracle.password}")
	private String password;

	@Value("${oracle.url}")
	private String url;

	@Value("${oracle.driver}")
	private String driver;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
}
