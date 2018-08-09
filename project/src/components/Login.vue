<template>
  <div class="login">
   <b-navbar toggleable="md" type="dark" variant="info" class="bg-gradient">

  <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

  <b-navbar-brand href="#/">iObras</b-navbar-brand>

  <b-collapse is-nav id="nav_collapse">


    <!-- Right aligned nav items -->
    <b-navbar-nav class="ml-auto">
       <b-nav-item href="#/Login">Login</b-nav-item>
      <b-nav-item href="#/cadastro">Cadastre-se</b-nav-item>
    </b-navbar-nav>

  </b-collapse>
</b-navbar>

<div class="py-5">
  <div class="container">
    <div class="row">
      <div class="col-md-3"> </div>
        <div class="col-md-6">
          <!--Alerta a ser inserido-->
          <b-alert
          variant="danger"
          dismissible
          :show="isDismissed"
          @dismissed="isDismissed = false"
          >
          {{msg}}
          </b-alert>
          <div class="card text-white p-5 bg-primary">
          <div class="card-body" >
            <h1 class="mb-4">Entrar</h1>
            <form><!--Campo action será implementado a posteriori-->
              <div class="form-group">
                <label for="email">Login</label>
                <input id="email" v-model="form.email" type="email" class="form-control" placeholder="Enter Login">
              </div>
              <div class="form-group">
                <label for="senha">Senha</label>
                <input id="senha" v-model="form.senha" type="password" class="form-control" placeholder="Senha">
              </div>
              <button type="submit" @click="onClickLogin" href="#/user" class="btn btn-primary">Login</button>
              <button type="button" @click="onCarregarCadastro" class="btn btn-danger">Cadastre-se</button>
              <br><br>
              <a href="#/redefinirSenha">Esqueci minha senha</a>
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
import { EventBus } from '../main.js'

export default {
  name: 'Login',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      isDismissed:false,
      form:{
        email:'fulanodetal@email.com',
        senha:'123'
      }
    }
  },
  methods:{
    onClickLogin(){
      if(this.form.email != '' && this.form.email != ''){
        this.$http.get('http://localhost:5000/user?email='+this.form.email).then(response =>{
            var resposta;
            resposta = response.body[0]
           // debugger
            if(resposta){
              if(this.form.senha == resposta.senha){
                //Emite o evento
                this.onLoginNoSite(resposta.id)
              }
              else{
                this.msg = "Senha incorreta!"
                this.isDismissed = true
              }
            } 
            else{
              this.msg = "Email incorreto!"
              this.isDismissed = true
            }            
        },response=>{
            this.msg = "Erro ao carregar dados"
            this.isDismissed = true
        })
      }
      else{
        this.msg = "Por favor, preencha todos os campos."
        this.isDismissed = true
      }      
    },
    onCarregarCadastro(){
      window.location.href ="#/cadastro"
    },
    onLoginNoSite(idPessoa){
      if(idPessoa){        
        this.$http.get('http://localhost:5000/user?id='+idPessoa).then(response =>{
          var dados_pessoa
          dados_pessoa = response.body[0]
          //Emite evento para os outros componente utilizarem
          EventBus.$emit('emitDadosPessoa',dados_pessoa)   
        }, response => {  
          this.msg = "Erro ao carregar dados."
          this.isDismissed = true
        })
        this.$router.push('user')
      } 
      else{
        this.msg = "Erro ao propagar o ID"
        this.isDismissed = true
      }    
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
