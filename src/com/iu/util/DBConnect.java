package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static void main(String[] args) {
		try {
			Connection con = DBConnect.getConnection();
			System.out.println(con+"에 접속성공!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws Exception {
		//1.로그인 정보 4가지
		String user = "user03";
		String password = "user03";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2.드라이버를 메모리에 로딩
		Class.forName(driver);
		
		//3.로그인 한 Connection 객체
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
		
		//에러발생시 확인하기
		//1. 아이디/패스워드 확인
		//2. 데이터베이스에 유저가 없는 경우
		//3. 유저의 권한이 적용되지 않은 경우
		//4. ojdbc6나 에러가 난 경우
		//5. not connect - ip, port, xe 오타
		//6. 물리적으로 랜선이 뽑힌 경우
		//7. listener문제는 db를 재실행
		//8. classnotfoundexception 드라이버명이 틀리거나 없음
		
	}
}
