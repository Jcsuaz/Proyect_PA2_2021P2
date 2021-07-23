function cargarPokemons(){
  let url="https://pokeapi.co/api/v2/pokemon/";
  fetch(url)
    .then(
        function(respuesta){
          return respuesta.json()
        }
    )
    .then(
        function(respuestaJson){
          let lista=respuestaJson.results
          lista.forEach(
            function(pokemon){
              detallePokemon(pokemon)
            }
          )
        }
    )
}

function detallePokemon(pokemon){
  fetch(pokemon.url)
    .then(
        function(respuesta){
          return respuesta.json()
        }
    )
    .then(
        function(respuestaJson){
          let experiencia=respuestaJson.base_experience
          let nombre=respuestaJson.name

          alert("Nombre: "+nombre+" experiencia: "+experiencia)
        }
    )
}
function detallePokemonById(idPokemon){
  let url="https://pokeapi.co/api/v2/pokemon/"+idPokemon;
  fetch(url)
    .then(
        function(respuesta){
          return respuesta.json()
        }
    )
    .then(
        function(respuestaJson){
          let experiencia=respuestaJson.base_experience
          let nombre=respuestaJson.name
          let id=respuestaJson.id
          alert(id+" Nombre: "+nombre+" experiencia: "+experiencia)
        }
    )
}
function buscarPokemon(){
  let idPokemon=document.getElementById("idPokemon").value
  detallePokemonById(idPokemon)

}