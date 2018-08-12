<template>
  <div class="teste">
<template>
  <b-table striped hover :items="obras"></b-table>
</template>
<h1>{{mensagem}}</h1>

   </div>
</template>

<script>
export default {
  name: 'teste',
  created (){
    //1/listaObras
       this.$http.get('http://localhost:5000/user/1/listaObras').then(response => {
      this.obras = response.body
    this.mensagem=" servdor okay"
    }, response => {
      // error callback
      this.mensagem="erro no servdor"
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
        obra: null,
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
    
       //this.form.obra.id +
    this.$http.post('http://localhost:5000/1/edificio',{
       
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

     this.$http.post('http://localhost:5000/'+ this.idEdificio +'/alvenaria',{

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

     this.$http.post('http://localhost:5000/'+ this.idEdificio +'/eletrica',{
        
          pontosEletricosTotal: this.form.PontEletrica,
          pontosEletricosParcial:0 ,
          tubulacoesTotal: this.form.TubEletrica,
          tubulacoesParcial:0
         }).then(response => {
     
    }, response => {
      // error callback
    })

    this.$http.post('http://localhost:5000/'+ this.idEdificio +'/hidraulica',{

        pontosHidraulicosTotal: this.form.TubHidra,
        pontosHidraulicosParcial: 0,
        tubulacoesTotal: this.form.TubHidra,
        tubulacoesParcial:0,
        tubulacoes_hidraulicas: 0,
           
         }).then(response => {
     
    }, response => {
      // error callback
    })
    this.$http.post('http://localhost:5000/'+ this.idEdificio +'/revestimento',{

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