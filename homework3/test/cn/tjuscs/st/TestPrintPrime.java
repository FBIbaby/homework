package cn.tjuscs.st;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrintPrime {
	@Test
	public void test(){
		String [] argv = new String[1];
		argv[0] = "3";
		printPrimes.main(argv);

	}
	@Test
	public void test1(){
		String [] argv = new String[0];
		printPrimes.main(argv);

	}
}




