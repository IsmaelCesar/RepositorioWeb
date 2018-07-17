import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import RedefinirSenha from '@/components/RedefinirSenha'
import User from '@/components/User'
import Remover from '@/components/Remover'
import SelectConsulta from '@/components/SelectConsulta'

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
      path: '/remover',
      name: 'Remover',
      component: Remover
    },
    {
      path: '/select',
      name: 'SelectConsulta',
      component: SelectConsulta
    }
  ]
})
