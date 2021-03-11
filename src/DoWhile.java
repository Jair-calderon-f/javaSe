import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response=0;
        do{
            System.out.println("seleciona  el numero de la opcion deseada");
            System.out.println("1) movies");
            System.out.println("2) series");
            System.out.println("3) salir");
            Scanner sc= new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());
            switch(response){
                case 1:
                    System.out.println("movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                case 3:
                    System.out.println("salir");
                    break;

            }
        }while (response != 0);
        System.out.println("se termino el programa");
    }
}
