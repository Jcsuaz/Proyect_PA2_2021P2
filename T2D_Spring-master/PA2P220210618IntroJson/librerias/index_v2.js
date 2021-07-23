function cargarPokemons(){
  let url="https://pokeapi.co/api/v2/pokemon?limit=200&offset=0";
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
          let id=respuestaJson.id
          let imagen=respuestaJson.sprites.front_default

          let contenidoEtiqueta=document.getElementById("contenido")
          let pokemonEtiqueta=document.createElement("div")
          pokemonEtiqueta.classList.add("rounded")
          pokemonEtiqueta.classList.add("float-start")
          pokemonEtiqueta.classList.add("pokemon")


          let pokemonH2=document.createElement("h2")
          pokemonH2.innerText=id+" - "+nombre

          let pokemonImg=document.createElement("img")
          pokemonImg.srcset=imagen

          pokemonEtiqueta.append(pokemonH2,pokemonImg)
          contenidoEtiqueta.append(pokemonEtiqueta)

        }
    )
}