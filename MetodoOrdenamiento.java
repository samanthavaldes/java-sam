public class MetodoOrdenamiento {

    public void imprimeArreglo(String mensaje, int[] arreglo) {
        System.out.print(mensaje);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void saltoLinea() {
        System.out.println("\n");
    }

    public static void main(String args[]) {
        int[] arreglo = {11,23,9,20};

        MetodoOrdenamiento objOrdena = new MetodoOrdenamiento();

        objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
        objOrdena.saltoLinea();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < arreglo.length - 1; j++) {
                objOrdena.imprimeArreglo("  Arreglo comparando: ", arreglo);
                System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");

                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("    ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);
                    
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    objOrdena.imprimeArreglo("    Arreglo modificado: ", arreglo);
                    objOrdena.saltoLinea();
                }
            }
        }

        objOrdena.saltoLinea();
        objOrdena.imprimeArreglo("Arreglo final: ", arreglo);
    }
}