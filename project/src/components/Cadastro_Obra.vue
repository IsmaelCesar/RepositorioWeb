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

      <label>Imagem</label>
       <b-form-file v-model="file" :state="Boolean(file)" placeholder="Escolha uma foto..."></b-form-file>
     <div class="mt-3">Selected file: {{file && file.name}}</div>
     
   <b-form-group label="A obra possuirá Piscina?">
      <b-form-radio-group v-model="selected"
                          :options="options"
                          name="radioInline">
      </b-form-radio-group>
    </b-form-group>
    


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
export default {
  name: 'cadastroObra',
  data () {

    return {
      form: {
        name: '',
        crea:'',
        obras: [],
        file:null
      },
      selected: '',
      user:'Engenheiro',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ]
    }
    

  },
  methods:{
     onSubmit() {
      this.$http.get('http://localhost:3000/obras').then(response => {
      this.form.obras = response.body
    }, response => {
      // error callback
    })
var quant= this.form.obras.length;
    
  
    this.$http.post('http://localhost:3000/obras',{
      id:quant,
      num_crea: this.form.crea,
        nome_obra: this.form.name,
        thubnail_obra: this.form.file,
        descricao_obra: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        is_finished: false,
        piscina:this.selected
     
      }).then(response => {
      post.save();
    }, response => {
      // error callback
    })

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
</style>