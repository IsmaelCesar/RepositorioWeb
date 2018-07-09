import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'

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

    }
  ]
})
