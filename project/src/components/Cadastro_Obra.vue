<template>
  <div class="cadastroObra">
<div class="py-5">
<div class="container">
      <div class="row">
  <!--div class="col-md-1"> </div-->
        <div class="col-md-12">
<div class="card text-white p-5 bg-primary">
  <div class="card-body" >
    <b-form @submit="onSubmit" @reset="onReset">
    <fieldset><h2>Cadastro Obra</h2></fieldset>
    <br>
    

      <b-form-group id="exampleInputGroup2"
                    label="Nome da Obra:"
                    label-for="exampleInput2">
        <b-form-input id="exampleInput2"
                      type="text"
                      v-model="form.name"
                      required
                      placeholder="Nome da Obra">
        </b-form-input>
      </b-form-group>


         <b-form-group id="exampleInputGroup6"
                    label="Numero CREA:"
                    label-for="exampleInput6">
        <b-form-input id="exampleInput6"
                      type="number"
                      v-model="form.crea"
                      required
                      placeholder="CREA">
        </b-form-input>
      </b-form-group>

        <b-form-group id="exampleInputGroup2"
                    label="URL da imagem"
                    label-for="exampleInput2">
        <b-form-input id="exampleInput2"
                      type="text"
                      v-model="form.imagem"
                      required
                      placeholder="URL da imagem">
        </b-form-input>
      </b-form-group>

     

      <!--b-form-group id="exampleInputGroup5"
                    label="A obra possuirá Piscina?"
                    label-for="exampleInput5">
        <b-form-select id="exampleInput5"
                      :options="options"
                        required
                      v-model="selected" >
                      
        </b-form-select>
      </b-form-group-->
    


      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>

</div>
</div>
</div>
</div>
</div>
</div>
 

   </div>
</template>

<script>
import { EventBus } from '../main'

export default {
  name: 'cadastroObra',
  data () {

    return {
        idUser:'',
      form: {
        name: '',
        crea:'',
        obras: [],
        imagem: '',
      },
      selected: '',
      user:'',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ]
    }
    

  },
  methods:{
    beforeCreate (){
        EventBus.$on('emitIdPessoa',(idPessoa)=>{
      this.idUser = idPessoa
      alert(idPessoa )
    })
    },
  
     onSubmit(evt) {


        this.$http.post('http://localhost:5000/user/1/obra',{
            nome: this.form.name,
        status: false,
        piscina:this.selected,
        imagem: '',
        numeroCrea: this.form.crea,
        descricao_obra: " "
      
      }).then(response => {
                 
       alert("Cadastrado com Sucesso")
             
      // post.save();
    }, response => {
      // error callback
      alert("Erro ao Cadastrar Obra ");
    }) 

  //'+ this.idUser +'

  /*  this.$http.post('http://localhost:5000/user/1/obra',{
        nome: this.form.name,
        status: false,
        piscina:this.selected,
        imagem: '',
        numeroCrea: this.form.crea,
        descricao_obra: " "
       
      }).then(response => {
    
        alert("Obra Inserida com Sucesso")
    }, response => {
      // error callback
      alert("Erro ao Inserir Obra")
    })

 evt.preventDefault();
      alert(JSON.stringify(this.form)); */
},
  onReset(evt){
     evt.preventDefault();
         this.form.name= ' ',
    this.selected='',
     this.form.crea='',
     this.form.file='';
     
  this.$nextTick(() => { this.show = true });

  }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
.bg-primary {
  background-color: #17a2b8 !important;
}

.bg-secondary {
  background-color: #056877 !important;
}
b{
  color:white;
}
.mt-3,
.my-3 {
  margin-top: 0rem !important;
}
.cadastroObra{
   background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
}



</style>