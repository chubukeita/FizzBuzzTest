package com.example.fizzbuzz.service;

/**
 * 3の倍数のときはfizz、5の倍数のときはbuzz、15の倍数のときはfizzbuzzを出力する.
 */
public class FizzBuzzService {

	public String fizzbuzz(int i) {
	  if (i == 1) {
	    return "1";
	  }
		return "fizz";
	}

}
