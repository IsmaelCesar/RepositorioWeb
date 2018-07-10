import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import BoostrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'


Vue.use(Router)
Vue.use(BoostrapVue)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/login',
      name: 'Login',
      component: Login

    },
    {
      path: '/cadastro',
      name: 'Cadastro',
      component: Cadastro

    }
  ]
})
