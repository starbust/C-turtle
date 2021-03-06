package classwork.evaluatorExample.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import classwork.evaluatorExample.evaluators.DirectSumEvaluator;

public class DirectSumEvaluatorTest {

	@Test
	public void testEval() {
		DirectSumEvaluator e = new DirectSumEvaluator();
		e.add(1.2);
		e.add(2.3);
		assertEquals(3.5d, (Double)e.evaluate(), 0.0);
	}
	
}
