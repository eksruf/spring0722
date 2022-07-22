package com.care.mvc02;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("aaaa") //이름을 지정하지 않으면 클래스 이름을 따라간다
public class TestDAO {
	public TestDAO() {
		System.out.println("dao생성자 실행");
	}
}
