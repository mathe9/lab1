package test6;

import static org.junit.Assert.*;

import org.junit.Test;

public class reslut {

	@Test
	public void testPart_solv_ins1() {
		String result=test6.part_solv_ins1("x*2*y*z*3*x",'x');
		assertEquals("12*x*y*z",result);
	}
	
	@Test
	public void testPart_solv_ins12() {
		String result2=test6.part_solv_ins1("x*2*y*x*3*x",'x');
		assertEquals("18*x*x*y",result2);
	}
	
	@Test
	public void testPart_solv_ins13() {
		String result=test6.part_solv_ins1("x*0*y*z*3*x",'x');
		assertEquals("0*x*y*z",result);
	}
	
	@Test
	public void testPart_solv_ins14() {
		String result=test6.part_solv_ins1("x",'x');
		assertEquals("1",result);
	}

}
