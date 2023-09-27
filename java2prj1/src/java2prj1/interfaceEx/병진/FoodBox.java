package java2prj1.interfaceEx.병진;

public class FoodBox<F> {

	private Object[] obj;
	private int index;

	FoodBox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(F food) {
		obj[index] = food;
		index++;
	}

	public int size() {
		return index;
	}

	public F get(int index) {
		return (F) obj[index];
	}

	public void forEach(FoodBoxF<? super F> f) {
		for (int i = 0; i < index; i++) {
			f.enjoy(get(i));
		}
	}

}
