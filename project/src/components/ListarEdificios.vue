<template>
    <div class="listar_edificios">
        <b-card-group v-if="array_edificio != null" deck>
            <div class="lista_obras" v-for="edf in array_edificio" :key="edf.id">
                <b-card 
                v-if="edf != null"
                :title="edf.nome_obra"
                tag="article"
                style="max-width: 20rem;"
                class="mb-2">
                    <p class="card-text">
                        {{edf != null ? (edf.tipoFundacao+'\n'+
                                        'empresa da funação'+edf.empresaFundaao) : 'default'}}
                    </p>
                    <b-button @click="onDetalharEdificio" variant="primary">Detalhar</b-button>
                    <b-button @click="onDeletarEdificio(edificio.id)" variant="danger">Remover</b-button>
                </b-card>
            </div>
        </b-card-group>    
    </div>  
</template>

<script>
import { EventBus } from '../main'

export default {
    name:'listarEdificios',
    props:['id_obra','array_edificios'],
    data(){
        return{
            array_edificios:[],
            teste:null,
            id_obra:null
        }
    },
    methods:{
        onDetalharObra(){
            alert("Detalhar Edificio")
        },
         onDeletarEdificio(x){
            alert("Tem certeza que quer remover esta Obra?")
            this.$http.delete('http://localhost:5000/obra/'+ id_obra+'/'+x).then(response => {
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