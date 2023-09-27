package java2prj1.interfaceEx.lamda;

public class 연습 {

	//1이 코드를
	int max(int a, int b) {
		return a>b ? a:b;
	}
	//1이렇게 람다식으로 사용 가능
	//==> (int a, int b) -> {return a?b>a:b;}
	//==> (a, b) -> a?b > a:b;

	//2이 코드를
	//int printVar(String name, int age) {
	//	System.out.println(name + "=" + age);
	//}
	//2이렇게 람다식으로 사용 가능
	//==>(String name, int age) -> {System.out.println(name+"=" + age);}
	//==>(name, age) -> System.out.println(name+"=" + age);
	
	//3이 코드를
	int squre(int x) {
		return x*x;
	}
	//3이렇게 람다식으로 사용 가능
	//==>(int x) -> {return x*x;}
	//==>x ->  x*x;
	
	//4이 코드를
	int getRandom() {
		return (int)(Math.random()*6);
	}
	//4이렇게 람다식으로 사용 가능
	//==>() -> {return(int)(Math.random()*6);}
	//==>() -> (int)(Math.random()*6);
		
}
