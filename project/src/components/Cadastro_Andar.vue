<template>
  <div class="cadastroAndar">
<div class="py-5">
<div class="container">
      <div class="row">
  <!--div class="col-md-1"> </div-->
        <div class="col-md-12">
<div class="card text-white p-5 bg-primary">
  <div class="card-body" >
    <b-form @submit="onSubmit" @reset="onReset">
    <fieldset><h2>Cadastro Andar </h2></fieldset>
    <br>
     <br>

     <b-form-group id="exampleInputGroup1"
                    label="Edificação:"
                    label-for="exampleInput1">
        <b-form-select id="exampleInput1"
                      :options="edificios"
                      required
                      v-model="form.edificio">
        </b-form-select>
      </b-form-group>
     <b-form-group id="exampleInputGroup2"
                    label="Quantidade de Andar:"
                    label-for="exampleInput2"
                      description="Digite a quantidade de andares se todos possuirem as mesmas especificações.">
        <b-form-input id="exampleInput2"
                      type="number"
                      v-model="form.quantAndar"
                      required
                      placeholder="10">
        </b-form-input>
      </b-form-group>
       <b-form-group id="exampleInputGroup4"
                    label="Andar:"
                    label-for="exampleInput4"
                      description="Digite o andar atual se quiser cadastrar um andar por vez.">
        <b-form-input id="exampleInput4"
                      type="number"
                      v-model="form.AtualAndar"
                      required
                      placeholder="1">
        </b-form-input>
      </b-form-group>
      <b-form-group id="exampleInputGroup3"
                    label="Quantidade de Apartamento:"
                    label-for="exampleInput3">
        <b-form-input id="exampleInput3"
                      type="number"
                      v-model="form.quantApart"
                      required
                      placeholder="10">
        </b-form-input>
      </b-form-group>
      
 <br>
     <fieldset><h4>Alvenaria </h4></fieldset>
     <br>

         <b-form-group id="exampleInputGroup7"
                    label="ALvenaria (m²):"
                    label-for="exampleInput7">
        <b-form-input id="exampleInput7"
                      type="number"
                      v-model="form.alvenaria"
                      required
                      placeholder="1500">
        </b-form-input>
      </b-form-group>

       <b-form-group id="exampleInputGroup8"
                    label="Vigas(un):"
                    label-for="exampleInput8">
        <b-form-input id="exampleInput8"
                      type="number"
                      v-model="form.vigas"
                      required
                      placeholder="10">
        </b-form-input>
      </b-form-group>

     <b-form-group id="exampleInputGroup9"
                    label="Pilares (un):"
                    label-for="exampleInput9">
        <b-form-input id="exampleInput9"
                      type="number"
                      v-model="form.pilares"
                      required
                      placeholder="5">
        </b-form-input>
      </b-form-group>
 <br>
   <fieldset><h4>Eletríca </h4></fieldset>
   <br>

         <b-form-group id="exampleInputGroup10"
                    label="Tubulações Eletrícas (m):"
                    label-for="exampleInput10">
        <b-form-input id="exampleInput10"
                      type="number"
                      v-model="form.TubEletrica"
                      required
                      placeholder="1000">
        </b-form-input>
      </b-form-group>

       <b-form-group id="exampleInputGroup11"
                    label="Pontos Eletricos (un):"
                    label-for="exampleInput11">
        <b-form-input id="exampleInput11"
                      type="number"
                      v-model="form.PontEletrica"
                      required
                      placeholder="7000">
        </b-form-input>
      </b-form-group>

 <br>
  <fieldset><h4>Hidraulica</h4></fieldset>
 <br>

         <b-form-group id="exampleInputGroup12"
                    label="Tubulações Hidraulicas (m):"
                    label-for="exampleInput12">
        <b-form-input id="exampleInput12"
                      type="number"
                      v-model="form.TubHidra"
                      required
                      placeholder="200">
        </b-form-input>
      </b-form-group>

       <b-form-group id="exampleInputGroup13"
                    label="Pontos Hidraulicos (un):"
                    label-for="exampleInput13">
        <b-form-input id="exampleInput13"
                      type="number"
                      v-model="form.PontHidra"
                      required
                      placeholder="400">
        </b-form-input>
      </b-form-group>


 <br>
      <fieldset><h4>Revestimento </h4></fieldset>
 <br>
         <b-form-group id="exampleInputGroup14"
                    label="Piso (m²):"
                    label-for="exampleInput14">
        <b-form-input id="exampleInput14"
                      type="number"
                      v-model="form.piso"
                      required
                      placeholder="1000">
        </b-form-input>
      </b-form-group>

       <b-form-group id="exampleInputGroup15"
                    label="Pintura (m²):"
                    label-for="exampleInput15">
        <b-form-input id="exampleInput15"
                      type="number"
                      v-model="form.pintura"
                      required
                      placeholder="3000">
        </b-form-input>
      </b-form-group>

     <b-form-group id="exampleInputGroup16"
                    label="Esquadria (un):"
                    label-for="exampleInput16">
        <b-form-input id="exampleInput16"
                      type="number"
                      v-model="form.esquadria"
                      required
                      placeholder="180">
        </b-form-input>
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
  name: 'cadastroAndar',
   created () {
    this.$http.get('http://localhost:3000/edficios').then(response => {
      this.edificios = response.body
    }, response => {
      // error callback
    })
  },
  data () {

    return {
      form: {
        name_obra: '',
        crea:'',
        fundacao:'',
        edificio: null,
        quantAndar:'',
         quantApart:'',
         AtualAndar:'',
        alvenaria:'',
        vigas:'',
        pilares:'',
        esquadria:'',
        pintura:'',
        piso:'',
        TubEletrica:'',
        PontEletrica:'',
        TubHidra:'',
        PontHidra:'',
        checked: [],
        user:'Engenheiro',
        andares: []
      },
        edificios: [
        { text: 'Select One', value: null },
        'edificacao1', 'edificacao2'
      ],
      show: true,
      selected: '',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ],
      Status: [
        { text: 'Select One', value: null },
        'ativo', 'desativada'
      ],
       StatusFund: [
        { text: 'Select One', value: null },
        'Irá iniciar','Em andamento', 'Concluida'
      ],
    }
    

  },
   methods:{
     onSubmit() {
          this.$http.get('http://localhost:3000/andares').then(response => {
          this.form.andares = response.body
        }, response => {
          // error callback
        })
        var quant= this.form.andares.length;
        
      
        this.$http.post('http://localhost:3000/andares',{
          id:quant,
          nome_obra: this.form.obra,
          nome_edf: this.form.name,
            alvenaria: {
            pilares: 0,
            pilares_max:this.form.pilares,
            vigas: 0,
            vigas_max: this.form.vigas,
            alvenaria: 0,
            alvenaria_max: this.form.alvenaria
          },
          eletrica: {
            tubulacoes_eletricas: 0,
            tubulacoes_eletricas_max: this.form.TubEletrica,
            pontos_eletricos: 0,
            pontos_eletricos_max:this.form.PontEletrica 
          },
          hidraulica: {
            tubulacoes_hidraulicas: 0,
            tubulacoes_hidraulicas_max: this.form.TubHidra,
            pontos_hidraulicos: 0,
            pontos_eletricos_max: this.form.PontEletrica
          },
          revestimento: {
            piso: 0,
            piso_max: this.form.piso,
            pintura: 0,
            pintura_max: this.form.pintura ,
            esquadrias: 0,
            esquadrias_max: this.form.esquadria
          }
        
          }).then(response => {
          post.save();
        }, response => {
          // error callback
        })
    },
    onReset(){
      
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