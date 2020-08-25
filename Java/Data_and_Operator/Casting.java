// 8.3 데이터 타입의 변환(casting: type converting)
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		// 손실이 없었기 때문에 자동으로 b는 double
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b2);
		
		//int c = 1.1;
		double d = 1.1;
		// 0.1이 손실
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		System.out.println(f);
	}

}
