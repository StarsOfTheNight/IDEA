package demo8;
/**
 * 具体工厂(Concrete Creator)角色：除法类工厂
 *
 */
public class DivFactory implements IFactory {
	@Override
	public Operation CreateOperation() {		
		return new OperationDiv();
	}
}