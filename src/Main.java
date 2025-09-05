import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(imc());
        }
       /* public static void menu(){


        int opcion=3
                switch (opcion){
                    case 1:
                        System.out.println("Opcion 1: Ejercicio 2 dados");
                        break;
                    case 2:
                        System.out.println("Opcion 2: Ejercicio 3 dados");
                        break;
                    case 3:
                        System.out.println("Opcion 3: Calcular IMC");
                        break;
                    case 4:
                        System.out.println("Opcion 4: Ejercicio 2 dados");
                        break;
                    case 5:
                        System.out.println("Opcion 5: Ejercicio 2 dados");
                        break;
                    case 6:
                        System.out.println("Opcion 6: Salir");
                        break;

                }
        }

    public static void dados2{

        Random aleatorio = new Random();
        int d1, d2, suma1=0, suma2=0;
        for ( int i=1; i<=20; i++) {

            d1=aleatorio.nextInt(7-1)+1;
            System.out.println("Dado 1 generado: "+d1);
            suma1+=d1;

            d2=aleatorio.nextInt(7-1)+1;
            System.out.println("Dado 2 generado: "+d2);
            suma2+=d2;

        }

        System.out.println("Suma 1 generada: "+suma1);
        System.out.println("Suma 2 generada: "+suma2);

        if (suma1>suma2) {
            System.out.println("El dado ganador es: Dado 1");
            System.out.println("Segundo lugar: Dado 2");
            else {
                System.out.println("El dado ganador es: Dado 2");
                System.out.println("Segundo lugar: Dado 1");
            }

        }

    }
    public static void dados3(){

        Random aleatorio = new Random();
        int d1, d2, d3, suma1=0, suma2=0, suma3=0;
        for ( int i=1; i<=20; i++) {

            d1=aleatorio.nextInt(7-1)+1;
            System.out.println("Dado 1 generado: "+d1);
            suma1+=d1;

            d2=aleatorio.nextInt(7-1)+1;
            System.out.println("Dado 2 generado: "+d2);
            suma2+=d2;

            d3=aleatorio.nextInt(7-1)+1;
            System.out.println("Dado 3 generado: "+d3);
            suma3+=d3;

        }

        System.out.println("Suma 1 generada: "+suma1);
        System.out.println("Suma 2 generada: "+suma2);
        System.out.println("Suma 3 generada: "+suma3);

        if (suma1>suma2 && suma1>suma3) {
            System.out.println("El dado ganador es: Dado 1");
            if (suma2>suma3) {
                System.out.println("Segundo lugar: Dado 2");
                System.out.println("Tercer lugar: Dado 3");
            } else {
                System.out.println("Segundo lugar: Dado 3");
                System.out.println("Tercer lugar: Dado 2");
            }

        }
        if (suma2>suma1 && suma2>suma3) {
            System.out.println("El dado ganador es: Dado 2");
            if (suma1>suma3) {
                System.out.println("Segundo lugar: Dado 1");
                System.out.println("Tercer lugar: Dado 3");
            } else {
                System.out.println("Segundo lugar: Dado 3");
                System.out.println("Tercer lugar: Dado 1");
            }

        }
        if (suma3>suma1 && suma3>suma2) {
            System.out.println("El dado ganador es: Dado 3");
            if (suma1>suma2) {
                System.out.println("Segundo lugar: Dado 1");
                System.out.println("Tercer lugar: Dado 2");
            } else {
                System.out.println("Segundo lugar: Dado 2");
                System.out.println("Tercer lugar: Dado 1");
            }

        }

    }

        */
    public static String imc(){
        Scanner teclado = new Scanner(System.in);
                double n1, n2, operacion;
        String resultado = "";
        System.out.println("Digite su peso en kg");
        n1= teclado.nextDouble();
        System.out.println("Digite su estatura en metros");
        n2= teclado.nextDouble();
        operacion=n1/(n2*n2);

        System.out.println("Su peso es:"+n1);
        if (operacion<18.5){
            resultado="Su IMC es: "+operacion+"Tiene bajo peso";
        } else if (operacion>=18.5 && operacion<24.9) {
            resultado="Su IMC es: "+operacion+"Tiene peso normal";
        } else if (operacion>25 && operacion<26.9) {
            resultado="Su IMC es: "+operacion+"Tiene sobrepeso de grado 1";
        } else if (operacion>27 && operacion<29.9) {
            resultado="Su IMC es: "+operacion+"Tiene sobrepeso de grado 2";
        } else if (operacion>30 && operacion<34.9) {
            resultado="Su IMC es: "+operacion+"Tiene obesidad de tipo 1";
        } else if (operacion>35 && operacion<39.9) {
            resultado="Su IMC es: "+operacion+"Tiene obesidad de tipo 2";
        } else if (operacion>=40 && operacion<49.9) {
            resultado="Su IMC es: "+operacion+"Tiene obesidad de tipo 3";
        }
        else {
            resultado="Su IMC es: "+operacion+"Tiene obesidad de tipo 4, extrema";
        }

        return resultado+operacion;

    }

    }