package demo8;
/**
 * 具体产品(Concrete Product)角色：减法类
 *
 */
public class OperationSub extends Operation {	
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() - super.getNumberB();
		return result;
	}
}