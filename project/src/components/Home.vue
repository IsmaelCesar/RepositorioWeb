<template>
  <div class="hello">

     <b-navbar toggleable="md" type="dark" variant="info" class="bg-gradient2">

  <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

  <b-navbar-brand href="#/">iObras</b-navbar-brand>

  <b-collapse is-nav id="nav_collapse">


    <!-- Right aligned nav items -->
    <b-navbar-nav class="ml-auto">
       <b-nav-item href="#/login">Login</b-nav-item>
      <b-nav-item href="#/cadastro">Cadastre-se</b-nav-item>
    </b-navbar-nav>

  </b-collapse>
</b-navbar>
    <b-navbar toggleable="md" type="dark" variant="info" class="bg-gradient2">

  <b-collapse is-nav id="nav_collapse">


     <b-navbar-nav>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
      <b-nav-item href="#/">Home</b-nav-item>
       <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
      <b-nav-item href="#obra">Obras</b-nav-item>
       <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
       <b-nav-item href="#quemsomos">Quem Somos</b-nav-item>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#contato">Contate-nos</b-nav-item>
    </b-navbar-nav>

  </b-collapse>

</b-navbar>


      <div class=" py-5 text-center " id="obra" style="background-image: url('https://www.aarquiteta.com.br/blog/wp-content/uploads/2017/02/planta-baixa-o-que-e-para-que-serve.png');background-position:center center;background-size:cover; " >
    <div class="container py-5">
      <div class="row">
        <div class="col-md-12">
           <h2 class="text-left ml-3" style = "color:white">Obras</h2>

           <b-carousel id="carousel1"
                style="text-shadow: 1px 1px 2px #333;"
                controls
                indicators
                background="#ababab"
                :interval="4000"
                img-width="1024"
                img-height="480"
                v-model="slide"
                @sliding-start="onSlideStart"
                @sliding-end="onSlideEnd"
    >

      <!-- Text slides with image -->
      <b-carousel-slide 
        caption="Obras inovadoras"
        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
        img-src="https://picsum.photos/1024/480?image=1031"
      ></b-carousel-slide>

      <!-- Slides with custom text -->
      <b-carousel-slide
        caption="Melhor ferramenta"
        text="Melhor ferramenta de gerenciamento para as suas empreitadas"
        img-src="https://picsum.photos/1024/480?image=1033">        
      </b-carousel-slide>

      <!-- Slides with image only -->
      <b-carousel-slide 
        caption="Tabalhe conosto"
        text="Trabalhe desenvolvendo as ferramentas necessárias para auxiliar os profissionais de construção"
        img-src="https://picsum.photos/1024/480?image=1047">
      </b-carousel-slide>


      <b-carousel-slide 
        caption="Tabalhe conosco"
        text="Trabalhe desenvolvendo as ferramentas necessárias para auxiliar os profissionais de construção"
        img-src="https://picsum.photos/1024/480?image=1054">
      </b-carousel-slide>
    </b-carousel>
        </div>
      </div>
    </div>
  </div>

<div class="py-5 text-center swing "  id="quemsomos" style="background-image: url('https://mmarketing.net.br/wp-content/uploads/2018/04/predio2.jpg');background-position:center center;background-size:cover;  opacity: 0.6; ">
     <div class="container py-5">
      <div class="row">
        <div class="col-md-12">
          
          
          <h2 class="text-left ml-3 mt-2 w-25 h-25">Quem somos</h2>
        <hr>
        <div class="_img_campo_home position-relative float-left" fluid>
          <b-img src="./assets/obras.png" fluid alt="responsive image"/>
        </div>
        <div class="_txt_campo_home position-relative _txt_quem_somos" >sus dui sollicitudin metus, id hendrerit sem ante in mi. 
          Sedrhoncus, velit non mollis consequat, justo nisi viverra magna, vitae mollis lacus ligula vel leo. 
          Etiam pellentesque odio in tempus elementum. Donec rhoncus, enim veleuismod tempus, arcu sem scelerisque metus,
          et hendrerit magna tellus ac sem. Vivamus quis pulvinar dui, a vulputate sapien. Mauris viverra magna ac venenatis scelerisque.
          Nam scelerisque id dolor a mattis. Proin quis tortor nibh. Aliquam cursus sollicitudin nunc,
          vitae tincidunt nisl porta eu. Nunc scelerisque lectus ac arcu viverra commodo.
          Aenean mattis eros sit amet nulla hendrerit laoreet. 
          Phasellus justo purus, mollis et quam ac, accumsan dignissim magna. 
          Duis sapien ante, dapibus aliquet tincidunt non, dignissim vel arcu.
           Vestibulum arcu augue, dapibus a egestas at, finibus sit amet magna.
            Quisque eros risus, tempor vel eleifend et, bibendum nec urna.
        </div>
        </div>
      </div>
    </div>
  </div>

<div id="contato" class="py-5 text-center bg-gradient swing " >
    <div class="container py-5">
      <div class="row">
        <div class="col-md-12">
          <h2 class="display-1">Contate-nos</h2>
        <hr>
        <div class="_txt_campo_home position-relative ">
            <b-form @submit="onsubmit" method="POST" class="inline">
              <b-form-group>            
                  
                  <label for="nome">Nome:</label>
                  <b-input id="nome" v-model="form.nome" type="text" required placeholder="seu nome"/>
                  <br>
                  <label for="email">E-mail</label>
                  <b-input id="email" v-model="form.email" type="email" required placeholder="seu email aqui para resposta"/>                
                  <br>
                  <label>Descrição</label>

                  <b-form-textarea v-model="form.texto" rows="6" max-rows="10" required placeholder="seu texto aqui">
                  </b-form-textarea>   
                  <br>
                  <b-button type="submit" class="btn btn-danger mr-2"> Submeter </b-button>
                  <b-button class="btn btn-info mr-2" @click="onreset"> Limpar </b-button>
              </b-form-group> 
            </b-form>  
              </div>
        </div>
      </div>
    </div>
  </div>
  </div>
</template>

<script>
export default {
  name: 'home',
  data () {
    return {
      form:{
        nome:'',
        email:'',
        texto:''
      },
      slide:0,
      sliding:null
    }
  },
  methods:{
    onsubmit (evt) {
        
    },
    onreset () {
      this.form.nome = ''
      this.form.email = ''
      this.form.texto = ''
    },
    onSlideStart(slide){
      this.sliding = true
    },
    onSlideEnd(slide){
      this.sliding = false
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
.filter-light {
  overflow: hidden;
  position: relative;
   opacity: 0.6;
  
  }
  .text-left{
    color:black;
    font-style:italic;

  }
  ._txt_campo_home{    
    font-size: 16;
    font-weight: bold;
  }

._txt_quem_somos{
    color: white;
    background-color: rgba(0,0,0,0.9);
    padding: 5%;
    border-radius: 10px;
}

 div {
   
    -webkit-transition-property: width; /* Safari */
    -webkit-transition-duration: 2s; /* Safari */
    transition-property: width;
    transition-duration: 5s;
}
.bg-gradient {
  overflow: hidden;
   background: linear-gradient(#80bfff, #93dfdf);
}
.bg-gradient2 {
  overflow: hidden;
   background: linear-gradient( #70d9e9,#17a2b8);
}
.fade
{
        opacity:0.5;
}
.fade:hover
{
        opacity:1;
}
.grow:hover
{
        -webkit-transform: scale(1.3);
        -ms-transform: scale(1.3);
        transform: scale(1.3);
}

.swing:hover
{
        -webkit-animation: swing 1s ease;
        animation: swing 1s ease;
        -webkit-animation-iteration-count: 1;
    
    }
    
    .threed:hover
{
        box-shadow:
                1px 1px #53a7ea,
                2px 2px #53a7ea,
                3px 3px #53a7ea;
        -webkit-transform: translateX(-4px);
        transform: translateX(-4px);
}

@-webkit-keyframes swing
{
    15%
    {
        -webkit-transform: translateX(5px);
        transform: translateX(5px);
    }
    30%
    {
        -webkit-transform: translateX(-5px);
       transform: translateX(-5px);
    } 
    50%
    {
        -webkit-transform: translateX(3px);
        transform: translateX(3px);
    }
    65%
    {
        -webkit-transform: translateX(-3px);
        transform: translateX(-3px);
    }
    80%
    {
        -webkit-transform: translateX(2px);
        transform: translateX(2px);
    }
    100%
    {
        -webkit-transform: translateX(0);
        transform: translateX(0);
    }
}

.circle:hover
{
        border-radius:50%;
}
</style>
