package controller;

public class Ex01 {
	
	public Ex01() {
		super();
	}
	
	public int Multiplica (int a, int b, int cta, int num) {
		if (cta > a) { 
			return num;
		}else {
			num = num + b;
		}
		return Multiplica(a, b, cta + 1, num);
		
	}

}
