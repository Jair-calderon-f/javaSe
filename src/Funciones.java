public class Funciones {
    public static void main(String[] args) {
        double y=3;
        //area de un circulo pi *r2
        double area=AreaCirculo(y);
        System.out.println(area);
        System.out.println(AreaCirculo(y));

        //area de una esfera  4*pi*r2
        double sArea=sphereArea(y);
        System.out.println(sArea);
        System.out.println(sphereArea(y));

        //volumen de una esfera (4/3)*pi*r3
        double sVolumen=sphereVolumen(y);
        System.out.println(sVolumen);
        System.out.println(sphereVolumen(y));

        // function
        System.out.println("pesos a dolares "+converToDolar(200,"m"));

        con
    }
    private static double AreaCirculo(double r){
        return Math.PI * Math.pow(r,2);
    }
    private static double sphereArea(double r){
        return 4* Math.PI * Math.pow(r,2);
    }
    private static  double sphereVolumen(double r){
        return (4/3)*Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion:Funcion que especificando su moneda,convierte a dolares
     * @param quiantity cantidad de dinero
     * @param currency tipo de moneda: solo acepta pesos mexicanos o colombianos
     * @return currency devieleve la cantidad en dolares
     */
    private static double converToDolar(double quiantity,String currency){
        switch (currency){
            case "m":
                quiantity=quiantity * 0.052;
                break;
            case "c":
                quiantity=quiantity*0.00031;
                break;
        }
        return  quiantity;
    }
}
