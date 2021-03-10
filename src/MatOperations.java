public class MatOperations {
    public static void main(String[] args) {
        double x=2.1 ,y=3;
        //redondeo para arriba
        System.out.println(Math.ceil(x));
        //redondeo pa abajo
        System.out.println(Math.floor(x));
        //numero elevado al otro
        System.out.println(Math.pow(x,y));
        //devuelve el numero mayor
        System.out.println(Math.max(x,y));
        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        //area de un circulo
        //pi *r2
        System.out.println(Math.PI* Math.pow(y,2));
        //area de una esfera
        //4*pi*r2
        System.out.println(4* Math.PI * Math.pow(y,2));
        //volumen de una esfera
        //(4/3)*pi*r3
        System.out.println((4/3)*Math.PI * Math.pow(x,3));
    }
}
