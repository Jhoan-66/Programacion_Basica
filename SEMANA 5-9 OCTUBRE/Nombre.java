public class Nombreporconsola {

    public static void main(String[] args) {
        /// la varible scanner permite interpretar lo que el usuario ingresa 
        var scanner = new Scanner (System.in);
        /// Permite mostrar la imformacion en la consola 
        System.out.println("Dame tu nombre");
        /// La variable name guarda la imformacion que se ingreso en sccanner.nextline pasa esa imformacion a string
        var name = scanner.nextLine();
        System.out.println("El nombre del jugador es : " + name);
        System.out.println("Hello World!");
    }
}
