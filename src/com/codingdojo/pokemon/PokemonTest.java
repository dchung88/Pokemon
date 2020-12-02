package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon charmander = new Pokemon("Charmander", 100, "Fire");
		Pokemon squirtle = new Pokemon("Squirtle", 100, "Water");
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 100, "Grass");
		
		Pokedex pokedex = new Pokedex();
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 100, "Electric");
		System.out.println(pokedex.pokemonInfo(charmander));
		System.out.println(pokedex.pokemonInfo(pikachu));
		
		charmander.attackPokemon(bulbasaur);
		pikachu.attackPokemon(squirtle);
		System.out.println(pokedex.pokemonInfo(bulbasaur));
		System.out.println(pokedex.pokemonInfo(squirtle));

	}

}
