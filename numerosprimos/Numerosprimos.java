package numerosprimos;

public class Numerosprimos {

    public static boolean p = false;

    public static void main(String arg[]) {
        int nD = 0;
        int nd = 0;
        nD = Integer.parseInt(arg[0]);
        if (nD <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int div = i;
            int c = 0;

            while (div != 0) {
                div = div / 10;
                c++;
            }
            nd = c;

            if (nd == nD) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int c1 = 0;
                        int i1 = 1;
                        int l = (i - 1) / 2;
                        if (l % 2 == 0) {
                            l--;
                        }
                        while (i1 <= l) {
                            if (i % i1 == 0) {
                                c1++;
                            }
                            i1 += 2;
                            if (c1 == 2) {
                                i1 = l + 1;
                            }
                        }

                        if (c1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
