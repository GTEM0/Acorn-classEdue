package java2prj1.interfaceEx.lamda;

@FunctionalInterface
interface multipleInterface {
	int multiple(int x, int y);
}

public class multipleInterfaceEx {

	public static void main(String[] args) {

		class multipleInterfaceImp implements multipleInterface {

			@Override
			public int multiple(int x, int y) {

				return x * y;
			}
		}

		multipleInterfaceImp m1 = new multipleInterfaceImp();
		int result1 = m1.multiple(81, 9);
		System.out.println(result1);

		
		multipleInterface m2 = new multipleInterface() {

			@Override
			public int multiple(int x, int y) {
				
				return x*y;
			}			
		};
		int result2 = m2.multiple(3, 21);
		System.out.println(result2);
		
		
		multipleInterface m3 = (x, y) -> x * y;
		int result3 = m3.multiple(result1, result2);
		System.out.println(result3);
	}
}
