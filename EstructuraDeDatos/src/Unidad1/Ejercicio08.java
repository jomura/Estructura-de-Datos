package Unidad1;
public class Ejercicio08 {
    public static int Mayor (int numeros[], int posicion){
        int aux;
        if (posicion == 0){
            return numeros [posicion];
        }
        else{
            aux = Mayor (numeros, posicion - 1);
            if(numeros [posicion] > aux){
                return numeros [posicion];
            }
            else{
                return Mayor(numeros, posicion - 1);
            }
        }
    }
    public static String imprimeArreglo(int arre[]){
        String cadena = "";
        for (int i = 0; i<arre.length; i++){
            cadena = cadena + arre[i] + " , ";
        }
        return cadena;
    }
    public static void main(String[] args) {
        int arreglo[]= {4,5,22,10,9,8,5,1,0,-9,5};
        System.out.println("Arreglo Original: " + imprimeArreglo(arreglo));
        Mayor(arreglo, 0);
        System.out.println("Arreglo Ordenado: " + (Mayor(arreglo, arreglo.length - 1)));
    }
    
}
