public class DataTypes {
    public static void main(String[] args) {
        byte nb = 127;
        short ns = 32727;
        int ni = 2147483647;
        long nl =  9223372036854775807L;
        float nf = 123.456F;
        double nd = 123.456123456;

        var salary  = 1000.0;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employedName = "Rafael Carrillo";
        System.out.println("Employee " + employedName);
    }
}
