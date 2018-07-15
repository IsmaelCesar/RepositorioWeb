import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import Cadastro_Obra from '@/components/Cadastro_Obra'
import RedefinirSenha from '@/components/RedefinirSenha'
import User from '@/components/User'

Vue.use(Router)

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

    },
     {
      path: '/cadastroObra',
      name: 'Cadastro_Obra',
      component: Cadastro_Obra
    },
    {
      path:'/redefinirSenha',
      name:'RedefinirSenha',
      component:RedefinirSenha
    },
    {
      path:'/user',
      name:'User',
      component:User
    }
  ]
})
