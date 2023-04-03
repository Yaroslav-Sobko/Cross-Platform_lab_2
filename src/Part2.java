public class Part2 {
    static void solution(float a, float b, float c) {
        float D = b * b - 4 * c;
        if (a == 0) {
            System.out.println("x Є [ EMPTY SET ]");
        } else if (a > 0) {
            if (D < 0) {
                System.out.println("x Є R");
            } else if (D == 0) {
                System.out.println("x Є ( -inf; " + ( -b / 2 ) + " ) U ( " + ( -b / 2) + "; +inf )");
            } else {
                System.out.println("x Є ( -inf; " + ( ( -b - Math.sqrt(D) )/ 2 ) + " ) U ( " + ( ( -b + Math.sqrt(D) )/ 2 ) + "; +inf )");
            }
        } else {
            if (D <= 0) {
                System.out.println("x Є [ EMPTY SET ]");
            } else {
                System.out.println("x Є ( " + ( ( -b - Math.sqrt(D) )/ 2 ) + "; " + ( ( -b + Math.sqrt(D) )/ 2 ) + " )");
            }
        }
    }
}
