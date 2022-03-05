package demo8;
/**
 * 具体工厂(Concrete Creator)角色：减法类工厂
 *
 */
public class SubFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationSub();
	}
}