<template>
  <div class="home">
    <b-navbar class="align-middle" toggleable="md" type="dark" variant="info">
      <b-collapse is-nav class="ml-9" id="nav_collapse">
        
        <b-navbar>
          <b-navbar-nav class="mx-auto">
            <b-nav-item href="#/">Home</b-nav-item>
            <b-nav-item href="#">Obras</b-nav-item>
            <b-nav-item href="#quem_somos">Quem Somos</b-nav-item>
            <b-nav-item href="#">Contate-nos</b-nav-item>
          </b-navbar-nav>
        </b-navbar>  


        <b-navbar class="ml-9">
          <b-navbar-nav  class="bg-secondary">
            <b-nav-item href="#/login">Login</b-nav-item>
            <b-nav-item href="#/cadastro">Cadastre-se</b-nav-item>
          </b-navbar-nav>      
        </b-navbar> 

      </b-collapse>

  </b-navbar> 
    
  <br>

      <b-card-group deck>
          <b-card title="Title"
                  img-src="https://2.bp.blogspot.com/-Q7WZDQx4j7o/VeUO3tVlWHI/AAAAAAAAAUI/XYd9dStlZEc/s1600/predio-inteiro-2.jpg"
                  img-alt="Img"
                  img-top>
              <p class="card-text">
                  This is a wider card with supporting text below as a
                  natural lead-in to additional content. This content
                  is a little bit longer.
              </p>
              <div slot="footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
              </div>
          </b-card>
          <b-card title="Title"
                  img-src="http://www.atitudessustentaveis.com.br/wp-content/uploads/2008/11/300x211xpredios-sustentaveis-300x211.jpg.pagespeed.ic.5gd8Ieqqqs.jpg"
                  img-alt="Img"
                  img-top>
              <p class="card-text">
                  This card has supporting text below as a natural lead-in
                  to additional content.
              </p>
              <div slot="footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
              </div>
          </b-card>
          <b-card title="Title"
                  img-src="http://www.karpat.adv.br/wp-content/uploads/2016/11/fachadas-de-predios-3.jpg"
                  img-alt="Img"
                  img-top>
              <p class="card-text">
                  This is a wider card with supporting text below as a natural
                  lead-in to additional content. This card has even longer content
                  than the first to show that equal height action.
              </p>
              <div slot="footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
              </div>
          </b-card>
      </b-card-group>

      <!-- Quem somos-->
      <div id="quem_somos" class="my-5 bg-secondary _campo_home">
        <p class="text-left ml-3 mt-2">Quem somos</p>
        <hr>
        <div class="_img_campo_home position-relative float-left" fluid>
          <b-img src="./assets/obras.png" fluid alt="responsive image"/>
        </div>
        <div class="_txt_campo_home position-relative ">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse congue, libero in cursus hendrerit, purus dui sollicitudin metus, id hendrerit sem ante in mi. 
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
      <div id="contate-nos" class="bg-secondary my-5 _campo_home">
        <p class="text-left ml-3  mt-2">Contate-nos</p>
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
                  <b-button class="btn btn-primary mr-2" @click="onreset"> Limpar </b-button>
              </b-form-group> 
            </b-form>  
        </div>
      </div>

  </div>
</template>

<script>
export default {
  name: 'home',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
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

._campo_home{
  color:white;
}
</style>
