public class Casting {
    public static void main(String[] args) {
        //en un año ubique 30 perritos ,cuantos ubique al mes
        double monthlyDogs=30.0/12.0;
        System.out.println(monthlyDogs);
        //estimacion
        int estimatedMonthlyDogs=(int)monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
        //exactitud
        int a=30,  b=12;
        System.out.println((double)a/b);

    }
}
