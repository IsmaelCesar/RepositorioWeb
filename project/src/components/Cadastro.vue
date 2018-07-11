<template>
  <div class="cadastro">
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

<div class="py-5">
<div class="container">
      <div class="row">
  <!--div class="col-md-1"> </div-->
        <div class="col-md-12">
<div class="card text-white p-5 bg-primary">
  <div class="card-body" >
    <b-form @submit="onSubmit" @reset="onReset" v-if="show">
    <fieldset><h2>Cadastro</h2></fieldset>
    <br>
      <b-form-group id="exampleInputGroup1"
                    label="Email:"
                    label-for="exampleInput1"
                    description="We'll never share your email with anyone else.">
        <b-form-input id="exampleInput1"
                      type="email"
                      v-model="form.email"
                      required
                      placeholder="Enter email">
        </b-form-input>
      </b-form-group>

      <b-form-group id="exampleInputGroup2"
                    label="Nome:"
                    label-for="exampleInput2">
        <b-form-input id="exampleInput2"
                      type="text"
                      v-model="form.name"
                      required
                      placeholder="Enter nome">
        </b-form-input>
      </b-form-group>

     <b-form-group id="exampleInputGroup3"
                    label="Endereço:"
                    label-for="exampleInput3">
        <b-form-input id="exampleInput3"
                      type="text"
                      v-model="form.endereco"
                      required
                      placeholder="Enter endereco">
        </b-form-input>
      </b-form-group>

       <b-form-group id="exampleInputGroup4"
                    label="Telefone:"
                    label-for="exampleInput4">
        <b-form-input id="exampleInput4"
                      type="number"
                      v-model="form.telefone"
                      required
                      placeholder="Enter nnumber">
        </b-form-input>
      </b-form-group>

      <b-form-group id="exampleInputGroup5"
                    label="Cargo:"
                    label-for="exampleInput5">
        <b-form-select id="exampleInput5"
                      :options="cargos"
                      required
                      v-model="form.cargo">
        </b-form-select>
      </b-form-group>

         <b-form-group id="exampleInputGroup6"
                    label="Numero CREA:"
                    label-for="exampleInput6">
        <b-form-input id="exampleInput6"
                      type="number"
                      v-model="form.crea"
                      required
                      placeholder="Enter crea">
        </b-form-input>
      </b-form-group>

         <b-form-group id="exampleInputGroup7"
                    label="Senha:"
                    label-for="exampleInput7">
        <b-form-input id="exampleInput7"
                      type="password"
                      v-model="form.senha"
                      required
                      placeholder="Enter senha">
        </b-form-input>
      </b-form-group>

      <b-form-group id="exampleInputGroup8"
                    label="Senha:"
                    label-for="exampleInput8">
        <b-form-input id="exampleInput8"
                      type="password"
                      v-model="form.confsenha"
                      required
                      placeholder="Digite a senha novamente">
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
  name: 'cadastro',
  data () {

    return {
      form: {
        email: '',
        name: '',
        telefone:'',
        endereco:'',
        cargo: null,
        crea:'',
        senha:'',
        confsenha:'',
        checked: []
      },
        cargos: [
        { text: 'Select One', value: null },
        'Engenheiro', 'Tecnico'
      ],
      show: true
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
.bg-primary{
  background-color: #17a2b8 !important;
}
.cadastro{
   background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
}
</style>
