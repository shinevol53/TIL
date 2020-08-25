import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		p1.toString()
		p2.write("Hello World!);
		
		// new를 통해 새로운 인스턴스(p1, p2)를 만들었고
		// 그 인스턴스는 내부적으로 각자의 상태를 가지고 있음
		// p1는 result1.txt, p2는 result2.txt라는 상태를
		// 내부적으로 내장하고 있기 때문에
		// p1.write은 result1에, p2.write은 result2
		p1.write("Hello 1");
		
		// PrintWriter라는 class를 write라는 Method를 돌려쓰기 때문에 
		// 여러 번 써야 함
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
	}

}
