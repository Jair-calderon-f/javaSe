import org.w3c.dom.ls.LSOutput;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersion= new String [17];
        int days[]= new int[7];

        String [][] cities=new String [4][2];

        int [][][] numbers= new int[2][2][2];
        int [][][][] numbers4= new int[2][2][2][2];

        androidVersion[0]="aplee";
        androidVersion[1]="banna";
        androidVersion[2]="cupcake";
        androidVersion[3]="donut";

        for (int i = 0; i <androidVersion.length ; i++) {
            System.out.println(androidVersion[i] );
        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
            
        }
        //System.out.println(androidVersion[0]);
        //System.out.println(androidVersion[1]);
        //System.out.println(androidVersion[2]);

        cities[0][0]="colombia";
        cities[0][1]="medellín";
        cities[1][0]="colombia";
        cities[1][1]="bogotá";
        cities[2][0]="mexico";
        cities[2][1]="guaala";
        cities[3][0]="méxico";
        cities[3][1]="cdmx";
/**
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
**/
        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j <cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }

        String [][][][] animals = new String [2][3][2][2];
        animals[1][0][0][1]="mono";
//        System.out.println(animals [1][0][0][1]);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 0; j++) {
                for (int k = 0; k < 0; k++) {
                    for (int l = 0; l < 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
            
        }

        for (String androidVerion:androidVersion) {
            System.out.println(androidVerion);
        }

        for (String []pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
    }

}
