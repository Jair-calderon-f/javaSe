public class LogicOperations {
    public static void main(String[] args) {
        int a =8;
        int b=5;
        //asignacion
        System.out.println(a +" es igual a - "+b+" "+(a==b));
        System.out.println(a +" es diferente  a - "+b+" "+(a!=b));
        //operadores relacionales
        System.out.println(a +" es mayor a - "+b+" "+(a>b));
        System.out.println(a +" es menor  a - "+b+" "+(a<b));
        System.out.println(a +" es mayo o igual  a - "+b+" "+(a>=b));
        System.out.println(a +" es menor o igual a - "+b+" "+(a<=b));

        System.out.println("==============================");
        if((a==b)&& (a>b)){
            System.out.println(a +" es igual a - "+b);
        }else if(a!=b){
            System.out.println(a +" es diferente  a - "+b);
        }else if(a>b){
            System.out.println(a +" es mayor a - "+b);
        }else if(a<b){
            System.out.println(a +" es menor  a - "+b);
        }else if(a>=b){
            System.out.println(a +" es mayo o igual  a - "+b);
        }else if(a<=b){
            System.out.println(a +" es menor o igual a - "+b);
        }else {
        }
    }
}
