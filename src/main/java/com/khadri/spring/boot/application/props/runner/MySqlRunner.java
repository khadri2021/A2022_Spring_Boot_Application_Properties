package com.khadri.spring.boot.application.props.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.props.mysql.MySQLConnection;

@Component
public class MySqlRunner implements ApplicationRunner {

	@Autowired
	private MySQLConnection mySQLConnection;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MYSQL USERNNAME "+mySQLConnection.getUser());
		System.out.println("MYSQL PASSWORD "+mySQLConnection.getPassword());
		System.out.println("MYSQL URL "+mySQLConnection.getUrl());
		System.out.println("MYSQL DRIVER "+mySQLConnection.getDriver());
	}

}
