package Main;

import Pokemon.Pokemon;

public class Main {
    public static void main() {
        Pokemon p = new Pokemon("Charmander","Fogo", 15, "Lança Chamas");

        String resultadoBatalha = p.ataquePokemon(100);
        System.out.println(p.nomePokemon + " utilizou o seu ataque " + p.nomeAtaquePokemon + " e " + resultadoBatalha);

        boolean evoluiu = p.evoluir();

        if (evoluiu) {
            System.out.println("Seu Pokémon evoluiu para " + p.nomePokemon + "!");
        } else {
            System.out.println("Nível insuficiente para evoluir.");
        }
    }
}
