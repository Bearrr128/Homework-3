
public class test_p09 {
	public static void main(String[] args) {
		Car3 car1;
		car1=new Car3();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
	}
}

class Car3{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}