<template>
    <div class="card_obra">
        <b-card-group v-if="array_obra != null" deck>
            <div class="lista_obras" v-for="obra in array_obra" :key="obra.id">
                <b-card 
                v-if="obra != null"
                :title="obra.nome_obra"
                :img-src="obra.thubnail_obra"
                img-alt="Image"
                img-top
                tag="article"
                style="max-width: 20rem;"
                class="mb-2">
                    <p class="card-text">
                        {{obra != null ? obra.descricao_obra : 'default'}}
                    </p>
                    <b-button @click="onDetalharObra" variant="primary">Detalhar</b-button>
                    <b-button @click="onDeletarObra(obra.id)" variant="danger">Remover</b-button>
                </b-card>
            </div>
        </b-card-group>    
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
            teste:null,
            edf:[]
        }
    },
    methods:{
        onDetalharObra(){
            alert("Detalhar Obra")
        },
         onDeletarObra(x){
            alert("Tem certeza que quer remover esta Obra?")
            this.$http.delete('http://localhost:5000/obra/'+ x).then(response => {
             window.location.reload();
    }, response => {
      alert("nao foi possivel remover")
    })   

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