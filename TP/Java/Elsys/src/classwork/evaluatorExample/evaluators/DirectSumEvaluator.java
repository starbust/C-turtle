package classwork.evaluatorExample.evaluators;

import java.util.List;

import classwork.evaluatorExample.Evaluator;

public class DirectSumEvaluator extends Evaluator{

	@Override
	public Double evaluate() {
		double res = 0;
		for(Double value : evaluated) {
			res += value;
		}
		evaluated.removeAll(evaluated);
		evaluated.add(res);
		return res;
	}
	
	public Double evaluate(List<Double> evaluated) {
		double res = 0;
		for(Double value : evaluated) {
			res += value;
		}
		evaluated.removeAll(evaluated);
		evaluated.add(res);
		return res;
	}

}