package com.example.fizzbuzz.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzBuzzServiceTest {

	@Test
	@Description("1を入力したら1を返すこと")
	void test01() {
		FizzBuzzService target = new FizzBuzzService();
		String action = target.fizzbuzz(1);

		assertThat(action).isEqualTo("1");
	}

	@Test
	@Description("3を入力したらfizzを返すこと")
	void test02() {
		FizzBuzzService target = new FizzBuzzService();
		String action = target.fizzbuzz(3);

		assertThat(action).isEqualTo("fizz");
	}
	
	@Test
	@Description("4を入力したら4を返すこと")
	void test03() {
	  FizzBuzzService target = new FizzBuzzService();
	  String action = target.fizzbuzz(4);
	  
	  assertThat(action).isEqualTo("4");
	}
}
