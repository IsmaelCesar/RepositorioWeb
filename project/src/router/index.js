import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import Cadastro_Obra from '@/components/Cadastro_Obra'
import RedefinirSenha from '@/components/RedefinirSenha'
import User from '@/components/User'
import teste from '@/components/teste'



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
      path:'/redefinirSenha',
      name:'RedefinirSenha',
      component:RedefinirSenha
    },
    {
      path:'/user',
      name:'User',
      component:User
    },
    {
      path: '/cadastroObra',
      name: 'CadastroObra',
      component: Cadastro_Obra

    },
    {
      path: '/teste',
      name: 'Teste',
      component: teste
    }
  ]
})
