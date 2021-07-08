import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numRegistros;
        System.out.println("Ingrese el número de datos");
        numRegistros = Integer.parseInt(entrada.nextLine());
        //Byte.parseByte(entrada.nextLine())
        //Float.parseFloat(entrada.nextLine())
        String datos;
        //String [] vector = {"Hola","Maria"}
        //int [] vector2 = {1,2,5}
        //int [] vector = new int[8];
        //vector[0]=46;
        float [][] matrizdedatos = new float[numRegistros][3];
        String [] datosDividos;

        for (int i=0;i<numRegistros;i++){
            System.out.println("Ingrese el dato #"+(i+1)+":");
            datos = entrada.nextLine();//num1 num2 num3
            datosDividos = datos.split(" ");

            for (int j=0;j<datosDividos.length;j++){
                matrizdedatos[i][j]=Float.parseFloat(datosDividos[j]);
                //System.out.print(datosDividos[j]+" ");
            }
            System.out.println("");

        }

        for(int fila=0;fila<matrizdedatos.length;fila++){
            for(int columna=0;columna<matrizdedatos[fila].length;columna++){
                System.out.print(matrizdedatos[fila][columna]+" ");
            }
            System.out.println("");
        }



        /*String nombre;
        int edad;

        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        edad = entrada.nextInt();
        System.out.println("Su nombres es: "+nombre+" "+edad);*/

        /*int numero ;//numero = 10
        System.out.println("Ingrese un número");
        numero = entrada.nextInt();

        if (numero>0){
            System.out.println("El número es positivo");
            
        }else{
                System.out.println("El número es negativo");
            }*/
    }
}
