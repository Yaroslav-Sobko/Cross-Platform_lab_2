import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		float x = 0, y = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (x == 0 || y == 0) {
			System.out.println("Введіть координату x:");
			x = Float.parseFloat(input.readLine());
			System.out.println("Введіть координату y:");
			y = Float.parseFloat(input.readLine());

			if (x == 0 || y == 0) {
				System.out.println("Ви ввели помилкові дані!!!");
			}
		}

		if (x > 0 && y > 0) {
			System.out.println("I");
		} else if (x < 0 && y > 0) {
			System.out.println("II");
		} else if (x < 0 && y < 0) {
			System.out.println("III");
		} else {
			System.out.println("IV");
		}

		System.out.println("\n\n\nДруга частина" + "\nВведіть a:");
		float a = Float.parseFloat(input.readLine());
		System.out.println("Введіть b:");
		float b = Float.parseFloat(input.readLine());
		System.out.println("Введіть b:");
		float c = Float.parseFloat(input.readLine());

		Part2.solution(a, b, c);

		// Усі вітки розгалуження
		System.out.println("Усі вітки розшалуження:\n");
		System.out.println("\na = 0, b i c - будь які:");
		Part2.solution(0, 0.1f, 13);
		System.out.println("\na > 0, D = b * b - 4 * c < 0:");
		Part2.solution(12.04f, 0.1f, 13);
		System.out.println("\na > 0, D = b * b - 4 * c = 0:");
		Part2.solution(12.04f, 4, 4);
		System.out.println("\na > 0, D = b * b - 4 * c > 0:");
		Part2.solution(12.04f, -100, 4);
		System.out.println("\na < 0, D = b * b - 4 * c < 0:");
		Part2.solution(-6.8f, 0, 4);
		System.out.println("\na < 0, D = b * b - 4 * c = 0:");
		Part2.solution(-3f, 4, 4);
		System.out.println("\na < 0, D = b * b - 4 * c > 0:");
		Part2.solution(-3f, 4, 0);
	}
}