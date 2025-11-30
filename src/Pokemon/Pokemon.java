package Pokemon;

public class Pokemon {
    // 1. Atributos
    public String nomePokemon;
    public String tipoPokemon;
    public String nomeAtaquePokemon;
    public int nivelPokemon;



    // 2. Construtor
    public Pokemon(String nomePokemon, String tipoPokemon, int nivelPokemon, String nomeAtaquePokemon){
        this.nomePokemon = nomePokemon;
        this.tipoPokemon = tipoPokemon;
        this.nivelPokemon = nivelPokemon;
        this.nomeAtaquePokemon = nomeAtaquePokemon;
    }

    // 3. Métodos
    public String ataquePokemon(int dano){ // int para retornar se o ataque causado foi super efetivo ao pokemon adversário
        if (dano > 80){
            return "o ataque foi super efetivo";
        } else if (dano > 50) {
            return "o ataque teve um dano normal";
        } else if (dano > 0) {
            return "o ataque não foi efetivo";
        } else {
            return "o ataque teve dano nulo";
        }
    }

    public boolean evoluir() {
        if (nivelPokemon >= 16) {
            if (nomePokemon.equals("Charmander")) {
                nomePokemon = "Charmeleon";
            }
            return true;
        } else {
            return false;
        }
    }


}
