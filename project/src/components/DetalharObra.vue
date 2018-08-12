<template>  
    <div class="detalhar_obra">

        <b-container class="bg-secondary my-3">
            <b-row>
                <b-col class="md-4 float-left">
                    <!--Imagem Obra-->
                </b-col>    
                <!--Nome da obra-->
                <b-row class="md-8 float-right">
                    <p class="h3">{{obra != null ? obra.nome : "Nome da obra"}}</p>
                </b-row>    
            </b-row>    
        </b-container>  
        <b-container v-if="obra != null">  
            <listar-edificios id_obra="this.obra.id" array_edificios=""></listar-edificios>
        <b-container> 
    </div>
</template>

<script>
import { EventBus } from '../main'
import ListarEdificios from '@components/ListarEdificios'

export default {
    name:'detalharObra',
    components:{
        'listar-edificios':ListarEdificios
    },
    props:['obra_selecionada'],
    data(){
        return{
            teste:null,
            edf:[],
            obra:null //Adicionar obra posteriormente
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
             this.obra = response.body[0] //Obtendo a obra como resposta
             }, response => {
                  alert("nao foi possivel remover")
            })   

        }
    },
    created(){
        //Quando o componente for criado a obra é carregada
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