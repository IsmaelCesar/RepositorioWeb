<template>
  <div class="atualizaObra">
<div class="py-5">
<div class="container">
      <div class="row">
  <!--div class="col-md-1"> </div-->
        <div class="col-md-12">
<div class="card text-white p-5 bg-primary">
  <div class="card-body" >
    <b-form @submit="onSubmit" @reset="onReset">
    <fieldset><h2>Atualizar</h2></fieldset>
    <br>
    

     <b-form-group id="exampleInputGroup1"
                    label="Obra:"
                    label-for="exampleInput1">
        <b-form-select id="exampleInput1"
                      :options="obras"
                      required
                      v-model="form.obra">
        </b-form-select>
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
  name: 'atualizaObra',
  data () {

    return {
      form: {
        name_obra: '',
        crea:'',
        user:'Engenheiro',
        checked: [],
        obra:null,
      },
        cargos: [
        { text: 'Select One', value: null },
        'Engenheiro', 'Tecnico'
      ],
      obras: [
        { text: 'Select One', value: null },
        'obra1', 'obra2'
      ],
      show: true,
      selected: '',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ]
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
.atualizaObra{
   background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
}
</style>