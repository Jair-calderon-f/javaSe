public class updatingVariables {
    public static void main(String[] args) {
        int salary=1000;
        int bono=500;
        int descuento=50;
        int bonofinal=salary + bono ;
        int bonofinalDescuento=salary+descuento;
        //2 horas extra 30$ c/u
        //1 hora esta en 15$
        int costoHorasExtra=15 ,horasExtras=2 ,comida=45;

        int totalHorasExtras=horasExtras * costoHorasExtra - comida;
        System.out.println("bono final"+ bonofinal);
        System.out.println("salario con descuento"+bonofinalDescuento);
        System.out.println("horas extras menos comida"+totalHorasExtras);

        //actualizando cadenas de texto
        String employeeName="jair calderon";
        employeeName=employeeName+" flores";
        System.out.println("employee Name"+employeeName);
    }
}
