<template>
    <div><!--Container Mestre -->
        <!--Navegação -->
        <b-navbar toggleable="md" type="light" variant="dark"> 
                <b-collapse is-nav id="nav_dropdown_collapse">
                <b-navbar-brand>       
                    iObras
                </b-navbar-brand>            
                <b-navbar-nav>
                    <b-nav-item href="#quem_somos" @click="scrollIntoView"> <p class="nav_button"> Quem somos </p></b-nav-item>
                    <b-nav-item href="#contate_nos" @click="scrollIntoView"> <p class="nav_button"> Contate-nos </p></b-nav-item>
                    <b-nav-item href="#cadastre_se" @click="scrollIntoView"> <p class="nav_button"> Cadastre-se </p></b-nav-item>       
                </b-navbar-nav>
                </b-collapse>    
            </b-navbar>
        <b-container fluid>  <!--Container De navegacao -->           
            <h2 id="quem_somos">Quem somos</h2>
            <hr>        
            <div> <!--Container quem somos-->
                <img class="flutuacao_imagen_home posicao_elemento" width="350px" height="250px" src="../assets/home/Obras.png">
                <div class="posicao_elemento"><!--Container Dizeres quem somos-->   
                    <p>Lorem ipsum dolor sit amet, sapien urna vehicula non pede, sed amet quam vestibulum. 
                    Ullamcorper est sit vivamus ultrices, corporis pellentesque, vestibulum ut orci mauris in hac,
                    magna rutrum est, sem pede cursus vestibulum mi. Eum ornare condimentum quis in. Elit sit placerat justo euismod.
                    Quisque id interdum mi, rutrum nunc tincidunt sit velit elit, in justo sit tellus eros donec a, anim cursus quam neque sit nullam hac.
                    Ligula quam, aliquam in vel, mattis vivamus ultricies egestas urna, vivamus ultrices. 
                    Lacus esse vestibulum quam wisi, aliquam nam nulla.
                        Tempor sit vel egestas sapien, voluptates orci duis ut inceptos dolor, diam eget at fusce non erat lectus.
                    </p>
                </div>
                <div class="cancel_folating"></div>
            </div>
            <h2 id="contate_nos">Contate-nos</h2>
            <hr>
            <div class="posicao_elemento"> <!--Container quem somos-->
                <img class="flutuacao_imagen_home posicao_elemento" width="150px" height="150" src="../assets/home/phone_png.png">
                <div class="posicao_elemento"><!--Container Dizeres quem somos-->   
                    <h6>Se deseja nos contactar mande-nos um e-mail ou ligue para nós</h6>
                    <table>
                        <tr>
                            <td><p>Fone:</p></td>
                            <td><p>+55 081 91111-2222</p></td>
                        </tr>
                        <tr>
                            <td><p>Email:</p></td>
                            <td><p>contato_iobras@email.com</p></td>                            
                        </tr>
                    </table>
                </div>
                <div class="cancel_floating"></div>
            </div>

            <h2 id="cadastre_se">Cadastre-se</h2>
            <hr>   
            <b-form @submit="onSubmit" @reset="onReset"> 
                <b-form-group>
                    Seu Nome:
                    <b-form-input type="text" placeholder="Nome usuario" v-model="form.usuario"></b-form-input>
                    Numero do Crea:
                    <b-form-input type="number" placeholder="Numero Crea" v-model="form.usuario"></b-form-input>
                    Digite sua senha:
                    <b-form-input type="password" placeholder="Digite sua senha" v-model="form.senha"></b-form-input>
                    Digite sua senha novamente:
                    <b-form-input type="password" placeholder="Confirme sua senha"></b-form-input>
                    <b-button type="submit" @click="validarDados" v-model="form.val_senha" variant="danger">Submit</b-button>
                    <b-button type="button" @click="onReset" variant="primary">Reset</b-button>
                </b-form-group>
            </b-form>            
        </b-container>     
    </div>        
</template>

<script>

export default {
    name:'Home',
    data(){
       return {
           form:{
               usuario:'',
                senha:'',
                val_senha:''
           },
           msg:'Testando valores'
       }
   },
   methods:{
       onSubmit(evt){
            alert('Submeteu');
       },
       validarDados(evt){
           alert('Validar dados?')
       },
       scrollIntoView(evt){
          evt.preventDefault()
          const href = evt.target.getAttribute('href')
          const el = href ? document.querySelector(href) : null
          if (el) {     
             this.$refs.content.scrollTop = el.offsetTop
          }
        },
        onReset() {
              alert('resetou?')
        }

   }
}

</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

p.nav_button:hover{
    background-color: #35495E;
    padding:5px;
    border-radius: 5px;
    color:#fff;
    transition: background-color 1s;
}
/*Texto e flutuacao Imagens*/
.flutuacao_imagen_home {
    float: left;
}

.flutuacao_texto_home {
    float: right;
}

.posicao_elemento{
    position: relative;
}

.cancel_folating{
    clear: both;
}
/*=============================*/

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
  color: #35495E;
}
</style>