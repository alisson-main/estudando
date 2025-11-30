package SwitchCases;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um pokemon pelo seu tipo: ");
        System.out.println("Tipo Água - Squartle");
        System.out.println("Tipo Fogo - Charmander");
        System.out.println("Tipo Grama - Bulbasaur");

        String pokemonEscolhido = scanner.nextLine();

        switch (pokemonEscolhido){
            case "Água":
                System.out.println("Você escolheu Squartle, o pokemon inicial do tipo água!");
                break;
            case "Fogo":
                System.out.println("Você escolheu Charmander, o pokemon inicial do tipo fogo!");
                break;
            case "Grama":
                System.out.println("Você escolheu Bulbasaur, o pokemon inicial do tipo grama!");
        }

        scanner.close();
    }
}
