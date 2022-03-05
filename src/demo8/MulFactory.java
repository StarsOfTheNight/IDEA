package demo8;
/**
 * 具体工厂(Concrete Creator)角色：乘法类工厂
 *
 */
public class MulFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationMul();
	}
}