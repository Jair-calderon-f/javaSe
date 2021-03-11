public class Swich {
    public static void main(String[] args) {
    String colorModeSelected="Dar";
        switch (colorModeSelected){
            case "light":
                System.out.println("selecccionaste light Mode");
                break;
            case "night":
                System.out.println("seleccionaste night Mode");
                break;
            case "blue darck":
                System.out.println("seleccionaste blue darck mode");
                break;
            case "Dark":
                System.out.println("seleccionaste darck");
                break;
            default:
                System.out.println("selecciona una opcion sea correcta");
        }
    }
}
