public class While {
    static  boolean isTurnOnLight=false;
    public static void main(String[] args) {
        turnOnOfflight();
        int i=1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
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
