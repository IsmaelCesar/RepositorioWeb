<template>
  <div class="home">
    <b-navbar class="align-middle" toggleable="md" type="dark" variant="info">
      <b-collapse is-nav class="ml-9" id="nav_collapse">
        
        <b-navbar>
          <b-navbar-nav class="mx-auto">
            <b-nav-item href="#/">Home</b-nav-item>
            <b-nav-item href="#">Obras</b-nav-item>
            <b-nav-item href="#">Quem Somos</b-nav-item>
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
      <div id="quem_somos">
      </div> 
  </div>
</template>

<script>
export default {
  name: 'home',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
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
</style>
