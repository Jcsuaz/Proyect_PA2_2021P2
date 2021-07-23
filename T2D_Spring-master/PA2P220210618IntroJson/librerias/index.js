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

          let contenidoEtiqueta=document.getElementById("listaPokemon")
          let pokemonEtiqueta=document.createElement("div")
          pokemonEtiqueta.classList.add("carousel-item")
          if(id==1){
            pokemonEtiqueta.classList.add("active")
          }

          let pokemonImg=document.createElement("img")
          pokemonImg.src=imagen
          //pokemonImg.style.cssText="width:100%"
          pokemonImg.classList.add("d-block")
          pokemonImg.classList.add("w-100")

          let pokemonInfoEtiqueta=document.createElement("div")
          pokemonInfoEtiqueta.classList.add("carousel-caption")
          pokemonInfoEtiqueta.classList.add("d-none")
          pokemonInfoEtiqueta.classList.add("d-md-block")

          let pokemonH5=document.createElement("h5")
          pokemonH5.innerText=id+" - "+nombre

          let pokemonP=document.createElement("p")
          pokemonP.innerText="Prueba de servicio de PA2"

          pokemonInfoEtiqueta.append(pokemonH5,pokemonP)

          pokemonEtiqueta.append(pokemonImg,pokemonInfoEtiqueta)

          contenidoEtiqueta.append(pokemonEtiqueta)

          /*<div class="carousel-item active">
            <img src="..." class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h5>First slide label</h5>
              <p>Some representative placeholder content for the first slide.</p>
            </div>
          </div>*/
    /*<div class="carousel-item active">
      <img src="..." class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Some representative placeholder content for the third slide.</p>
      </div>
    </div>*/
        }
    )
}