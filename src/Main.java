import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        float x = 0 , y = 0;
        while (x == 0 || y == 0) {
            System.out.println("Введіть координату x:");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            x = Float.parseFloat(input.readLine());
            System.out.println("Введіть координату y:");
            y = Float.parseFloat(input.readLine());

            if (x == 0 || y == 0){
                System.out.println("Ви ввели помилкові дані!!!");
            }
        }

        if (x > 0 && y > 0) {
            System.out.println("I");
        } else if(x < 0 && y > 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        } else {
            System.out.println("IV");
        }
    }
}