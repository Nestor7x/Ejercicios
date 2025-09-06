import java.util.*;

public class Main {
    public static void main(String[] args) {

        menu();
        }
        public static void menu(){


        Scanner teclado = new Scanner(System.in);
        int opcion;
            System.out.println("Menu de opciones: \n " +
                    "1. Ejercicio dos dados \n " +
                    "2. Ejercicio 3 dados \n" +
                    "3. Calcular IMC \n" +
                    "4. Calcular notas del semestre \n" +
                    "5. \n" +
                    "6. Salir \n");
        opcion= teclado.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Opcion 1: Ejercicio 2 dados");
                        dados2();
                        break;
                    case 2:
                        System.out.println("Opcion 2: Ejercicio 3 dados");
                        dados3();
                        break;
                    case 3:
                        System.out.println("Opcion 3: Calcular IMC");
                        System.out.println(imc());
                        break;
                    case 4:
                        System.out.println("Opcion 4: Calcular notas del semestre");
                        notas();
                        break;
                    case 5:
                        System.out.println("Opcion 5: ");
                        break;
                    case 6:
                        System.out.println("Opcion 6: Salir");
                        break;

                }
        }

    public static void dados2(){

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
        }
            else {
                System.out.println("El dado ganador es: Dado 2");
                System.out.println("Segundo lugar: Dado 1");
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

    public static String imc(){
        Scanner teclado = new Scanner(System.in);
                double n1, n2, operacion;
        String resultado = "";
        System.out.println("Digite su peso en kg");
        n1= teclado.nextDouble();
        System.out.println("Digite su estatura en metros");
        n2= teclado.nextDouble();
        operacion=n1/(n2*n2);

        System.out.println("Su peso es: "+n1+" kg");
        System.out.println("Su estatura es: "+n2+" m");
        if (operacion<18.5){
            resultado="Su IMC es: "+operacion+", Tiene bajo peso";
        } else if (operacion>=18.5 && operacion<24.9) {
            resultado="Su IMC es: "+operacion+", Tiene peso normal";
        } else if (operacion>25 && operacion<26.9) {
            resultado="Su IMC es: "+operacion+", Tiene sobrepeso de grado 1";
        } else if (operacion>27 && operacion<29.9) {
            resultado="Su IMC es: "+operacion+", Tiene sobrepeso de grado 2";
        } else if (operacion>30 && operacion<34.9) {
            resultado="Su IMC es: "+operacion+", Tiene obesidad de tipo 1";
        } else if (operacion>35 && operacion<39.9) {
            resultado="Su IMC es: "+operacion+", Tiene obesidad de tipo 2";
        } else if (operacion>=40 && operacion<49.9) {
            resultado="Su IMC es: "+operacion+", Tiene obesidad de tipo 3";
        }
        else {
            resultado="Su IMC es: "+operacion+", Tiene obesidad de tipo 4, extrema";
        }

        return resultado;

    }
    public static void notas(){
        Scanner teclado = new Scanner(System.in);
        double fisica, calculoIntegral, comunicacion, fundamentosAdm, ingles, programacion, notaFinal;

        System.out.println("Ingrese la nota obtenida en fisica(1-5): ");
        fisica= teclado.nextDouble();
        while (fisica<1 || fisica>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            fisica= teclado.nextDouble();
        }
        System.out.println("Ingrese la nota obtenida en calculo Integral(1-5): ");
        calculoIntegral= teclado.nextDouble();
        while (calculoIntegral<1 || calculoIntegral>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            calculoIntegral= teclado.nextDouble();
        }
        System.out.println("Ingrese la nota obtenida en comunicacion(1-5): ");
        comunicacion= teclado.nextDouble();
        while (comunicacion<1 || comunicacion>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            comunicacion= teclado.nextDouble();
        }
        System.out.println("Ingrese la nota obtenida en fundamentos Administrativos(1-5): ");
        fundamentosAdm= teclado.nextDouble();
        while (fundamentosAdm<1 || fundamentosAdm>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            fundamentosAdm= teclado.nextDouble();
        }
        System.out.println("Ingrese la nota obtenida en ingles(1-5): ");
        ingles= teclado.nextDouble();
        while (ingles<1 || ingles>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            ingles= teclado.nextDouble();
        }
        System.out.println("Ingrese la nota obtenida en programacion(1-5): ");
        programacion= teclado.nextDouble();
        while (programacion<1 || programacion>5){
            System.out.println("El rango de la nota debe ser de 1 a 5, vuelva a ingresar el valor: ");
            programacion= teclado.nextDouble();
        }

        notaFinal=((fisica*4+calculoIntegral*4+comunicacion*2+fundamentosAdm*2+ingles*2+programacion*3)/17);
        if (notaFinal<3.2){
            System.out.println("Lo sentimos, rebrobo el semestre, su4 nota final es: "+notaFinal);
        } else {
            System.out.println("Felicidades, aprobo el semestre, su nota final es: "+notaFinal);
        }
    }
    }