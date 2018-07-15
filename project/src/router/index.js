import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import Cadastro_Obra from '@/components/Cadastro_Obra'
import User from '@/components/User'
import Cadastro_Edificio from '@/components/Cadastro_Edificio'
import Cadastro_Andar from '@/components/Cadastro_Andar'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
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
     path: '/user',
     name: 'User',
     component: User

   },
   {
    path: '/cadastroEdificio',
    name: 'Cadastro_Edificio',
    component: Cadastro_Edificio

  },
  {
   path: '/cadastroAndar',
   name: 'Cadastro_Andar',
   component: Cadastro_Andar

 }
  ]
})
