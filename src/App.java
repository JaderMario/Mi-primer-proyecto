import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Mostrar mensaje por pantalla
        System.out.println("Hello, World!");
    

        //Ejemplo de post incremento
        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        
        Scanner sc = new Scanner(System.in);       //Para ingresar datos por pantalla

        //Invocar el método dtNúmero
        System.out.print("Digite un número: ");
        int num = sc.nextInt();                   // Escanea el número ingresado anteriormente y lo asigna a la variable num
        System.out.println(dtNumero(num));

        //Invocar el método grado
        System.out.print("Digite los grados centígrados: ");
        double c = sc.nextDouble();
        System.out.println("Los grados Faharenheit = " + grados(c));

        //Invocar el operador condicional
        System.out.print("Digite un número: ");
        int n = sc.nextInt();
        System.out.println(operadorCondicional(n));

        sc.close();
        
    }

    public static String dtNumero(int n) {
        return "doble = " + (n*2) + " triple = " + (n*3);
    }

    public static double grados (double c) {
        return 32 + 9*(c/5);
    }

    public static String operadorCondicional(int n){
        return n%2 == 0? n + " es par": n + " es impar";
        /* otra forma:
        String r = "";
        if (n%2 == 0){
            r = n + "es par";
        } else{
            r =  n + "es impar";
        }
        return r;  */
    }
}

