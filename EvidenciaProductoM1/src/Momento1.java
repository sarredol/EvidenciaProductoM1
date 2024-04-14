import java.util.Scanner;

public class Momento1 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        //Crear un menú que permita registrar el usuario, iniciar sesión y salir. Si el usuario inicia sesión exitosamente,
        //ingresa a un nuevo menú  que le permita calcular el imc, validar el rango del imc y según su rango le da recomendaciones medicas
        //y finalmente le permita salir


        String name = "Pepito";
        String email = "Pepito@mail.com";
        String phone = "3215024522";
        int password = 123456;

        System.out.println("Ingrese su usuario: ");

        String user = sc.nextLine();

        System.out.println("Ingrese su password: ");

        int userPassword = sc.nextInt();

        sc.nextLine();

        if ((user.equals(email) || user.equals(phone)) && userPassword == password){

            System.out.println("Bienvenido" + name);
        }else {
            System.out.println("Valide sus credenciales");
        }

        System.out.println("¿Desea calcular el imc?\n" +
                "1.Si\n" +
                "2.No\n" +
                "3.Salir");

        int menu=sc.nextInt();

        while (menu == 1){
//

            System.out.println("Ingrese su Peso");
            double peso =  sc.nextDouble();
            System.out.println("Ingrese su estatura");
            double estatura = sc.nextDouble();

            double imc= Math.round(peso/(estatura*estatura));

            System.out.println(imc);

            if (imc<18){
                System.out.println("Su imc corresponde a bajo peso");
            }else if (imc>= 18 && imc < 25){
                System.out.println("Su imc corresponde a un nivel normal");
            }else if (imc >= 25 && imc < 30){
                System.out.println("Su imc corresponde a sobre peso");
            }else if (imc >= 30){
                System.out.println("Su imc corresponde a obesidad");
            }

            System.out.println("Desea tener Recomendaciones medicas:\n" +
                    "1. Bajo peso\n" +
                    "2. Peso normal\n"+
                    "3. Sobrepeso\n" +
                    "4. Obesidad\n" +
                    "5. Salir");

            int opc=sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Recomedaciones medicas para aumentar el imc");
                    break;
                case 2:
                    System.out.println("Recomendaciones medicas para mantener el imc del peso normal");
                    break;
                case 3:
                    System.out.println("Recomendaciones medicas para disminuir el peso");
                    break;
                case 4:
                    System.out.println("Recomendaciones medicas para tratar la obesidad");
                    break;
                case 5:
                    System.out.println("Muchas gracias por la consulta");
                    break;
                default:
                    System.out.println("Ingresar una opcion valida");
                    break;



            }

            System.out.println("¿Deseas consulta un nuevo imc?\n" +
                    "1.Si\n" +
                    "2.No\n" +
                    "3.Salir");

            menu=sc.nextInt();


//               System.out.println("Su peso es: "+ peso);
//               System.out.println("Su estatura es: "+ estatura);


        }
        System.out.println("Chao y adios");



    }
}
