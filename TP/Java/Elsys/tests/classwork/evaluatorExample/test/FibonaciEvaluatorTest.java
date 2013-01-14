package classwork.evaluatorExample.test;

import static org.junit.Assert.*;

import org.junit.Test;

import classwork.evaluatorExample.evaluators.FibonaciEvaluator;

public class FibonaciEvaluatorTest {

	@Test
	public void test() {
		FibonaciEvaluator e = new FibonaciEvaluator();
		e.add(2.0);
		e.add(5.0);
		assertEquals(8, e.evaluate(), 0.001);
	}

}