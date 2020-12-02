package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon {
	public String pokemonInfo(Pokemon pokemon) {
		 return "Pokemon Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
	}

}
