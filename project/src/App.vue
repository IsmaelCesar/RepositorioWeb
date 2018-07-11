<template>
  <div id="app">
      <b-navbar toggleable="md" type="dark" variant="info">

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
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 6px;
 
}
</style>
