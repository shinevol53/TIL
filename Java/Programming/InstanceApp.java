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
		
		// new�� ���� ���ο� �ν��Ͻ�(p1, p2)�� �������
		// �� �ν��Ͻ��� ���������� ������ ���¸� ������ ����
		// p1�� result1.txt, p2�� result2.txt��� ���¸�
		// ���������� �����ϰ� �ֱ� ������
		// p1.write�� result1��, p2.write�� result2
		p1.write("Hello 1");
		
		// PrintWriter��� class�� write��� Method�� �������� ������ 
		// ���� �� ��� ��
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
	}

}
