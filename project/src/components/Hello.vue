<template>
  <div class="hello">
    <b-navbar toggleable="md" type="dark" variant="info">

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

   
  



     <div class="py-5 text-center bg-gradient2 " id="obra"  >
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
      <b-carousel-slide caption="First slide"
                        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
                        img-src="https://2.bp.blogspot.com/-Q7WZDQx4j7o/VeUO3tVlWHI/AAAAAAAAAUI/XYd9dStlZEc/s1600/predio-inteiro-2.jpg"
      ></b-carousel-slide>

      <!-- Slides with custom text -->
      <b-carousel-slide img-src="http://www.atitudessustentaveis.com.br/wp-content/uploads/2008/11/300x211xpredios-sustentaveis-300x211.jpg.pagespeed.ic.5gd8Ieqqqs.jpg">
        <h1>Hello world!</h1>
      </b-carousel-slide>

      <!-- Slides with image only -->
      <b-carousel-slide img-src="http://www.karpat.adv.br/wp-content/uploads/2016/11/fachadas-de-predios-3.jpg">
      </b-carousel-slide>

      <!-- Slides with img slot -->
      <!-- Note the classes .d-block and .img-fluid to prevent browser default image alignment -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100" width="1024" height="480"
             src="https://picsum.photos/1024/480/?image=55" alt="image slot">
      </b-carousel-slide>

      <!-- Slide with blank fluid image to maintain slide aspect ratio -->
      <b-carousel-slide caption="Blank Image" img-blank img-alt="Blank image">
        <p >
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
          eros felis, tincidunt a tincidunt eget, convallis vel est. Ut pellentesque
          ut lacus vel interdum.
        </p>
      </b-carousel-slide>
    </b-carousel>
        </div>
      </div>
    </div>
  </div>

<div class="py-5 text-center"  id="quemsomos" style="background-image: url('https://mmarketing.net.br/wp-content/uploads/2018/04/predio2.jpg');background-position:center center;background-size:cover;  opacity: 0.6; ">
     <div class="container py-5">
      <div class="row">
        <div class="col-md-12">
          
          
          <h4 class="text-left ml-3 mt-2 w-25 h-25">Quem somos</h4>
        <hr>
        <div class="_img_campo_home position-relative float-left" fluid>
          <b-img src="./assets/obras.png" fluid alt="responsive image"/>
        </div>
        <div class="_txt_campo_home position-relative" >sus dui sollicitudin metus, id hendrerit sem ante in mi. 
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

<div id="contato" class="py-5 text-center bg-gradient" >
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
  name: 'hello',
  data () {
    return {
      form:{
        nome:'',
        email:'',
        texto:''
      }
    }
  },
  methods:{
    onsubmit (evt) {
        
    },
    onreset () {
      this.form.nome = ''
      this.form.email = ''
      this.form.texto = ''
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

.bg-gradient {
  overflow: hidden;
   background: linear-gradient(#80bfff, #b3b3ff);
}

.bg-gradient2 {
  overflow: hidden;
   background: linear-gradient( #70d9e9,#17a2b8);
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
    color: black;
    font-size: 16;
    font-weight: bold;
  }
 div {
   
    -webkit-transition-property: width; /* Safari */
    -webkit-transition-duration: 2s; /* Safari */
    transition-property: width;
    transition-duration: 5s;
}




</style>
