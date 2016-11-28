package test6;

import static org.junit.Assert.*;

import org.junit.Test;

public class result_int {

	@Test
	public void testJudge_char() {
		int result=test6.judge_char('x');
		assertEquals(2,result,0);
	}

	@Test
	public void testIns_true() {
		int result=test6.ins_true("x+1","!d/d x",5,10);
		assertEquals(1,result,0);
	}

	@Test
	public void testStr_int() {
		int result=test6.str_int("1234");
		assertEquals(1234,result,0);
	}

}
