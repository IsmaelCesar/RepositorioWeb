<template>
    <div class="card_obra">
        <b-card 
        :title="nome"
        :img-src="thumbnail"
        img-alt="Image"
        img-top
        tag="article"
        style="max-width: 20rem;"
        class="mb-2">
            <p class="card-text">
                {{descricao != null ? descricao : 'default'}}
            </p>
            <b-button @click="onDetalharObra" variant="primary">Detalhar</b-button>
        </b-card>
    </div>  
</template>

<script>

export default {
    name:'cardObra',
    props:['nome','thumbnail','descricao'],
    data(){
        return{
            msg:'Card Obra'
        }
    },
    methods:{
        onDetalharObra(){
            alert("Detalhar Obra")
        }
    }
}
</script>

<style>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>