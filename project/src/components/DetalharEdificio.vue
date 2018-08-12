<template>  
    <div class="detalhar_obra">

        <b-container class="bg-secondary my-3">
            <b-row>
                <b-col class="md-4 float-left">
                    <!--Imagem Obra-->
                </b-col>    
                <!--Nome da obra-->
                <b-row class="md-8 float-right">
                    <p class="h3">{{edf != null ? edf.nome : "Nome da obra"}}</p>
                </b-row>    
            </b-row>    
        </b-container>  
    </div>
</template>

<script>
import { EventBus } from '../main'

export default {
    name:'detalharObra',
    props:['id_obra','id_edf'],
    data(){
        return{
            teste:null,
            edf:null,
            id_obra:props.id_obra //Adicionar obra posteriormente
        }
    },
    methods:{
        onAtualizarEdificio(){
            this.$http.put('http://localhost:5000/edf/'+ edf.id,edf) //Fazendo um put com o edf atualizado
        }
    },
    created(){
        //Quando o componente for criado a obra é carregada
        this.$http.get('http://localhost:5000/edf/'+ props.id_edf).then(response => {
             window.location.reload();
             this.edf = response.body[0] //Obtendo a edifivio como resposta
             }, response => {
                  alert("nao foi possivel remover")
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