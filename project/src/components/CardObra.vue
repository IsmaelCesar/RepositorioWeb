<template>
    <div class="card_obra">
        <b-card 
        v-if="teste != null"
        :title="teste.nome_obra"
        :img-src="teste.thubnail_obra"
        img-alt="Image"
        img-top
        tag="article"
        style="max-width: 20rem;"
        class="mb-2">
            <p class="card-text">
                {{teste != null ? teste.descricao_obra : 'default'}}
            </p>
            <b-button @click="onDetalharObra" variant="primary">Detalhar</b-button>
        </b-card>
    </div>  
</template>

<script>
import { EventBus } from '../main'

export default {
    name:'cardObra',
    props:['obras_usuario'],
    data(){
        return{
            array_obra:[],
            teste:null
        }
    },
    methods:{
        onDetalharObra(){
            alert("Detalhar Obra")
        }
    },
    created(){
        EventBus.$on('emitArrayObras',(data)=>{            
            if(data.length != 0){
                this.array_obra = data
                this.teste = this.array_obra[0]
            }
        })
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