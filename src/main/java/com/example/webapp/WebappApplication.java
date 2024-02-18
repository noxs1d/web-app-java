package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class WebappApplication {


	public static void main(String[] args) {
		final String db_url="jdbc:mysql://localhost:3306/db_example";
		try(Connection connection= DriverManager.getConnection(db_url,"root","Tsukuyomy7@");
			Statement statement=connection.createStatement();){

			ResultSet sr=statement.executeQuery("select * from users");
			while( sr.next()){
				int i=sr.getInt(1);
				String str =sr.getString(2);
				System.out.println(i+") "+str);
			}
		}
		catch (SQLException e) {
            throw new RuntimeException(e);
        }
        SpringApplication.run(WebappApplication.class, args);

	}

}
