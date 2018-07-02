<template>
  <div class="home">
    <link rel="text/css" type="stylesheet" href="../iobras-own-css/home.css"/>
        <nav class="navbar navbar-light navbar-expand-lg bg-light">
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
          </button>

          <a class="navbar-brand ">iObras</a>
          
          <div class="colapse navbar-collapse">
            <ul id="menu" class="navbar-nav">
              <li><a class="nav-item nav-link active" href="#" >Home</a></li>
              <li><a class="nav-item nav-link" href="#" >Obras</a></li>
              <li><a class="nav-item nav-link" href="#" >Quem somos</a></li>
              <li><a class="nav-item nav-link" href="#" >Contate-nos</a></li>
            </ul>
          </div>
        </nav>  
  </div>
</template>

<script>
export default {
  name: 'home',
  data () {
    return {
      msg: 'Welcome to Your Vue.js PWA'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
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

.menu{
    font-family: Arial, Helvetica, sans-serif;
    font-weight:bold;
    border: 2px solid #ffe6cc;
    text-decoration:none;
    padding:2%;
    margin:2%;
    border-radius: 10%;
    background-color:#ffbf80;
    color: #000;    
}

.menu:hover{
    background-color:white;
    color: #000;
    text-decoration:none;    
}
/*
#name{
  float: left;
  font-size:25px;
  font-weight:bold;
}

#menu{
  float:left;
  margin-left: 15%;
}

#delimiter{
  clear:both;
}
*/

</style>
