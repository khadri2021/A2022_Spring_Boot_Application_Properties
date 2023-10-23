package com.khadri.spring.boot.application.props.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.props.oracle.OracleConnection;

@Component
public class OracleRunner implements ApplicationRunner {

	@Autowired
	private OracleConnection oracleConnection;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ORACLE USERNNAME "+oracleConnection.getUser());
		System.out.println("ORACLE PASSWORD "+oracleConnection.getPassword());
		System.out.println("ORACLE URL "+oracleConnection.getUrl());
		System.out.println("ORACLE DRIVER "+oracleConnection.getDriver());
	}

}