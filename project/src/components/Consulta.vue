<template>
  <div class="consulta">

  <nav class="navbar navbar-expand-md navbar-dark bg-secondary my-3" >
    <div class="container">
      <a class="navbar-brand" href="#">
        <b>iObra</b>
      </a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSecondarySupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse text-center justify-content-end" id="navbarSecondarySupportedContent">
        <ul class="navbar-nav">
          <li class="nav-item mx-2">
            <a class="nav-link" href="#">
              <i class="fa d-inline fa-lg fa-bookmark-o"></i>
            </a>
          </li>
        </ul>
        <a class="btn navbar-btn ml-2 text-white " href="#">
         <img width="30px" height="30px"  src="data:image/png;base64,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"/></a>
       <b>{{user}}</b>
      </div>
    </div>
  </nav>

    <b-navbar toggleable="md" type="dark" variant="info">
  <b-collapse is-nav id="nav_collapse">
      <b-navbar-nav>
      
         <b-nav-item href="#"></b-nav-item>
      <b-nav-item-dropdown text="Cadastrar" right>
        <b-dropdown-item href="#/cadastroObra">Obra</b-dropdown-item>
        <b-dropdown-item href="#/cadastroEdificio">Edificaçao</b-dropdown-item>
        <b-dropdown-item href="#/cadastroAndar">Andar</b-dropdown-item>
      </b-nav-item-dropdown>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
     <b-nav-item-dropdown text="Atualizar" right>
        <b-dropdown-item href="#/atualizaObra">Obra</b-dropdown-item>
        <b-dropdown-item href="#/atualizaEdificio">Edificaçao</b-dropdown-item>
        <b-dropdown-item href="#/atualizaAndar">Andar</b-dropdown-item>
      </b-nav-item-dropdown>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
       <b-nav-item href="#/select">Consultar</b-nav-item>
         <b-nav-item href="#"></b-nav-item>
          <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#/remover">Remover</b-nav-item>
         <b-nav-item href="#"></b-nav-item>
          <b-nav-item href="#"></b-nav-item>
           <b-nav-item href="#">Pendencias</b-nav-item>
            <b-nav-item href="#"></b-nav-item>

            <b-nav-form>
        <b-form-input size="sm" class="mr-sm-2" type="text" placeholder="Search"/>
        <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
      </b-nav-form>
      
    </b-navbar-nav>


  </b-collapse>

</b-navbar>
     
<br>
<div class="container">
      <div class="row">
<div class="col-md-6">
  <b-card-group deck
                  class="mb-3">
   <b-card img-src="https://picsum.photos/1024/480?image=1031"
                img-alt="Card image"
                img-top>
            <p class="card-text">
               
            </p>
        </b-card>
 </b-card-group>
  </div>
  <div class="col-md-6">

  <h4>Obra: {{obra}}</h4> 
   <h4>Nome da Edificacao:{{edificacao}} </h4> 
    <h4>Tipo da Fundaçao: {{Tfundacao}}</h4> 
     <h4>Status da Fundaçao: {{statusF}}</h4> 
      <h4>Empresa Responsável:{{empresa}}</h4> 
      </div>
</div>
 </div>


<div class="col-md-3">
 </div>
 <div class="container">
      <div class="row">
  <div class="col-md-9">
      <br>
      <h4>Alvenaria </h4>
       <br>
   <h5>Alvenaria (m²)</h5>
    <b-progress :value="valueAlv" :max="maxAlv" :precision="2" show-value class="mb-3"></b-progress>
    <h5>Vigas(un)</h5>
    <b-progress :value="valueVg" :max="maxVg" :precision="2" show-value class="mb-3"></b-progress>
   <h5>Pilares (un)</h5>
    <b-progress :value="valueP" :max="maxP" :precision="2" show-value class="mb-3"></b-progress>
  <br>
  <h4>Eletríca </h4>
   <br>
<h5>Tubulações Eletrícas (m)</h5>
    <b-progress :value="valueTEl" :max="maxTEl" :precision="2" show-value class="mb-3"></b-progress>
  <h5>Pontos Eletricos (un)</h5>
   
   <b-progress :value="valuePEl" :max="maxPEl" :precision="2" show-value class="mb-3"></b-progress>
  <br>
  <h4>Hidraulica</h4>
   <br>
  <h5>Tubulações Hidraulicas (m)</h5>
    <b-progress :value="valueTEh" :max="maxTEh" :precision="2" show-value class="mb-3"></b-progress>
  <h5>Pontos Hidraulicos (un)</h5>
    <b-progress :value="valuePEh" :max="maxPEh" :precision="2" show-value class="mb-3"></b-progress>
  <br>
  <h4>Revestimento </h4>
   <br>
  <h5>Piso (m²)</h5>
    <b-progress :value="valuePs" :max="maxPs" :precision="2" show-value class="mb-3"></b-progress>
  <h5>Pintura (m²)</h5>
    <b-progress :value="valuePt" :max="maxPt" :precision="2" show-value class="mb-3"></b-progress>
  <h5>Esquadria (un)</h5>
    <b-progress :value="valueEsq" :max="maxEsq" :precision="2" show-value class="mb-3"></b-progress>
  
</div>
 </div>
  </div>
 
       
  
    

     </div>
     
</template>

<script>
export default {
  name: 'consulta',
  data () {
    return {
     user:'Engenheiro',
     obra:'',
     edificacao:'',
      Tfundacao:'',
      statusF:'',
      empresa:'',
      maxAlv: 50,
      valueAlv: 33.33,
      maxVg:60,
      valueVg:30,
      maxP:100,
      valueP:20,
      maxPEl:150,
      valuePEl:50,
      maxTEl:200,
      valueTEl:100,
       maxPEh:150,
      valuePEh:50,
      maxTEh:200,
      valueTEh:100,
      maxPs:400,
      valuePs:200,
      maxPt:380,
      valuePt:200,
      maxEsq:360,
      valueEsq:20

      
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2, h3,h4, h5 {
  font-weight: bold;
  color:#17a2b8;
  text-align: left;
  
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
