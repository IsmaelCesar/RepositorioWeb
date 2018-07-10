<template>
  <div id="app">
      <b-navbar toggleable="md" type="dark" variant="info">
        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
        <b-navbar-brand href="#/" class="ml-5">iObras</b-navbar-brand>
      </b-navbar>
    <main>
      <router-view></router-view>
    </main>  
    <footer>
      <b-card bg-variant="light" class="mb-3 bg-dark " title="iObras">
        <p>Alunos:</p>
        Viviane Araujo <br>
        Ismael Cesar 
      </b-card>
    </footer>

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
  background-image: url("https://st2.depositphotos.com/3319333/7991/v/950/depositphotos_79918192-stock-illustration-architectural-linear-sketch-multistory-apartment.jpg");
  background-attachment: fixed;
}
</style>
