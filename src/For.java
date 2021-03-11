public class For {
    static  boolean isTurnOnLight=false;
    public static void main(String[] args) {
        turnOnOfflight();
        for (int i = 1; i <=10 ; i++) {
            printSOS();
        }
        
    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }
    public static  boolean turnOnOfflight(){
        isTurnOnLight=(isTurnOnLight)?false:true;
        return isTurnOnLight;

    }
}
