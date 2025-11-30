import java.util.Scanner;

public class ScannerDoUsuario {
    static void main(String[] args) {
        Scanner  caixaDeTexto = new Scanner(System.in);

        String nomeNinja = caixaDeTexto.nextLine();
        System.out.println(nomeNinja);
        caixaDeTexto.close();
    }
}
