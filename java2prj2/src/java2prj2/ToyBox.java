package java2prj2;

public class ToyBox<T> {
	private Object[] obj;
	private int index;

	ToyBox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(T toy) {
		obj[index] = toy;
		index++;
	}

	public int size() {
		return index;
	}

	public T get(int index) {
		return (T) obj[index];
	}

	public void forEach(ToyBoxT<? super T> s) {
		for (int i = 0; i < index; i++) {
			s.save(get(i));
		}
	}
}
