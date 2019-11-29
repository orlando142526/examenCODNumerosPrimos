package numerosprimos;

public class Numerosprimos {

    public static boolean p = false;

    public static void main(String arg[]) {
        int numeroDigitos = 0;
        int numeroVecesDigitos = 0;
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int valorDivision = 1; valorDivision <= 99999; valorDivision++) {
            int divisionEntera = valorDivision;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            numeroVecesDigitos = contador;

            if (numeroVecesDigitos == numeroDigitos) {
                if (valorDivision < 4) {
                    p = true;
                } else {
                    if (valorDivision % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (valorDivision - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (valorDivision % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(valorDivision);
                }
            }
        }
    }

}
//refactorizacion en rename y cambiamos los nombres nD=numeroDigitos, nd=numeroVecesDigitos, i=valorDivision , div= divisionEntera, c=contador, c1=limite
