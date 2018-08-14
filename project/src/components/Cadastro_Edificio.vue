<template>
  <div class="cadastroEdificio">
    
    

<div class="py-5">
<div class="container">
      <div class="row">
  <!--div class="col-md-1"> </div-->
        <div class="col-md-12">
<div class="card text-white p-5 bg-primary">
  <div class="card-body" >

    
    <b-form @submit="onSubmit" @reset="onReset">
    <fieldset><h2>Cadastro Edificação </h2></fieldset>
    
    <br>
     <br>

    <template>
      <b-table striped hover  :items="obras">
      </b-table>
      </template>
     
     <b-form-group id="exampleInputGroup1"
                    label=" Id da Obra:"
                    label-for="exampleInput1">
                      <b-form-input id="exampleInput2"
                      type="text"
                      v-model="form.idObra"
                      required
                      placeholder="Id da Obra">
        </b-form-input>
      </b-form-group>

      <b-form-group id="exampleInputGroup2"
                    label="Nome da Edificação:"
                    label-for="exampleInput2">
        <b-form-input id="exampleInput2"
                      type="text"
                      v-model="form.name"
                      required
                      placeholder="Nome da Edificação">
        </b-form-input>
      </b-form-group>

 <b-form-group id="exampleInputGroup3"
                    label="Status:"
                    label-for="exampleInput3">
        <b-form-select id="exampleInput3"
                      :options="Status"
                      required
                      v-model="form.status">
        </b-form-select>
      </b-form-group>

      <b-form-group id="exampleInputGroup4"
                    label="Tipo da Fundação:"
                    label-for="exampleInput4">
        <b-form-input id="exampleInput4"
                      type="text"
                      v-model="form.fundacao"
                      required
                      placeholder="Tipo da Edificação">
        </b-form-input>
      </b-form-group>

      <b-form-group id="exampleInputGroup5"
                    label="Status da Fundação:"
                    label-for="exampleInput5">
        <b-form-select id="exampleInput5"
                      :options="StatusFund"
                      required
                      v-model="form.statusFund">
        </b-form-select>
      </b-form-group>


    <b-form-group id="exampleInputGroup6"
                    label="Empresa Responsável:"
                    label-for="exampleInput6">
        <b-form-input id="exampleInput6"
                      type="text"
                      v-model="form.empresa"
                      required
                      placeholder="Digite o nome da Empresa">
        </b-form-input>
      </b-form-group>

 <br>
     <fieldset><h4>Alvenaria </h4></fieldset>
     <br>

         <b-form-group id="exampleInputGroup7"
                    label="Alvenaria (m²):"
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
  name: 'cadastroEdificio',
  created (){
       this.$http.get('http://localhost:5000/user/1/listaObras').then(response => {
      this.obras = response.body
   alert(" servidor okay")
    }, response => {
      // error callback
    alert("erro no servidor")
    })
  },
  data () {

    return {
      mensagem:"",
      idEdificio: "",
      form: {
        edficios:[],
        name: '',
        crea:'',
        fundacao:'',
        idObra: 0,
        status: null,
        statusFund: null,
        empresa:'',
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
      },
        obras: [],
      show: true,
      selected: '',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ],
       Status: [
        { text: 'Select One', value: null },
        { text: 'ativo', value: 'ativo' },
        { text: 'desativada', value: 'desativada' },
         
      ],
       StatusFund: [
        { text: 'Select One', value: null },
        { text: 'Irá iniciar', value: 'Irá iniciar' },
        { text: 'Em andamento', value: 'Em andamento' },
        { text: 'Concluida', value: 'Concluida' },
        
      ],
    }
    

  },
  methods:{
     onSubmit(evt) {
    
      
       //'+ this.form.idObra +'
    this.$http.post('http://localhost:5000/Obra/1/edificio',{
       
      nome:this.form.name,
      status: this.form.status,
      tipoFundacao:this.form.fundacao,
      statusFundacao: this.form.statusFund,
	   empresaFundaao:this.form.empresa

      }).then(response => {
         this.idEdificio = response.body
    }, response => {
      // error callback
    })

     this.$http.post('http://localhost:5000/edf/'+this.idEdificio+'/alvenaria',{

       vigasTotal: this.form.vigas,
      vigasParcial:0,
      pilaresParcial:0,
      pilaresTotal:this.form.pilares,
      mQuadradosParcial:0,
      mQuadradosTotal:this.form.alvenaria
           
         }).then(response => {
         
     
    }, response => {
      // error callback
    })

     this.$http.post('http://localhost:5000/edf/'+this.idEdificio+'/eletrica',{
        
          pontosEletricosTotal: this.form.PontEletrica,
          pontosEletricosParcial:0 ,
          tubulacoesTotal: this.form.TubEletrica,
          tubulacoesParcial:0
         }).then(response => {
     
    }, response => {
      // error callback
    })

    this.$http.post('http://localhost:5000/edf/'+this.idEdificio+'/hidraulica',{

        pontosHidraulicosTotal: this.form.TubHidra,
        pontosHidraulicosParcial: 0,
        tubulacoesTotal: this.form.TubHidra,
        tubulacoesParcial:0,
        tubulacoes_hidraulicas: 0,
           
         }).then(response => {
     
    }, response => {
      // error callback
    })
    this.$http.post('http://localhost:5000/edf/'+ this.idEdificio+'/revestimento',{

      esquadriasTotal:this.form.esquadria,
      esquadriasParcial:0,
      pisoTotal:this.form.piso,
      pisoParcial:0,
      pinturaTotal:this.form.pintura ,
      pinturaParcial:0

         }).then(response => {
     
    }, response => {
      // error callback
    })

     evt.preventDefault();
      alert(JSON.stringify(this.form));
    
},
  onReset(evt){
     evt.preventDefault();
        this.form.name='',
        this.form.status='',
        this.form.fundacao='',
        this.form.statusFund='',
        this.form.empresa='',
        this.form.vigas='',
        this.form.pilares='',
        this.form.alvenaria='',
        this.form.PontEletrica='',
        this.form.TubEletrica='',
        this.form.TubHidra='',
        this.form.TubHidra='',
        this.form.esquadria='',
        this.form.piso='',
        this.form.pintura='';

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
.cadastroEdificio{
   background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
}
</style>