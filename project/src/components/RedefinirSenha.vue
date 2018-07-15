<template>
  <div class="login">
  <!--   
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
      <b-nav-item href="#">Obras</b-nav-item>
       <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
       <b-nav-item href="#">Quem Somos</b-nav-item>
        <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
         <b-nav-item href="#"></b-nav-item>
        <b-nav-item href="#">Contate-nos</b-nav-item>
    </b-navbar-nav>

    </b-collapse>
  </b-navbar>   
-->

<div class="py-5">
  <div class="container">
    <div class="row">
      <div class="col-md-3"> </div>
        <div class="col-md-6">
          <div class="card text-white p-5 bg-primary">
          <div class="card-body" >
            <h1 class="mb-4">Redefinir senha</h1>
            <form method="PUT">
              <div class="form-group">
                <label for="email">Email</label>
                <input id="email" v-model="form.email" type="email" class="form-control" placeholder="Enter Login" required>
              </div>
              <div class="form-group">
                <label for="senha">Nova senha</label>
                <input id="senha" v-model="form.senha" type="password" class="form-control" placeholder="Nova senha" required>
              </div>
              <div class="form-group">
                <label for="senha">Confirmar senha</label>
                <input id="senha" v-model="form.confirmar_senha" type="password" class="form-control" placeholder="Nova senha" required>
              </div>
                <button type="submit" @click="onConfirmar" class="btn btn-primary">Confirmar</button>
                <button type="button" @click="onClickLimpar" class="btn btn-danger">Limpar</button>
            </form>
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
  name: 'RedefinirSenha',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
     form:{
       email:'',
       senha:'',
       confirmar_senha:''
     }
    }
  },
  methods:{
    onConfirmar(){
      if(this.form.senha == this.form.confirmar_senha){
        alert("Do something")
      }
      else{
        alert("entradas se senha não batem")
      }
    },
    onClickLimpar(){
      //limpando campos do formulario
      this.form.email=''
      this.form.senha=''
      this.form.confirmar_senha = ''
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
  color:#cc0000;
  text-decoration: none;
}

a:hover{
  text-decoration: underline;
}



.bg-primary{
  background-color: #17a2b8 !important;
}
.login{
   background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
}
</style>
