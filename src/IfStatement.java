public class IfStatement {
    public static void main(String[] args) {
        boolean idBluetoothEnable=false;
        int fileSend=3;
        if(idBluetoothEnable){
            fileSend++;
            System.out.println("archivo enviado");
        }else{
            fileSend--;
            System.out.println("archivo no enviado");
        }
    }
}
