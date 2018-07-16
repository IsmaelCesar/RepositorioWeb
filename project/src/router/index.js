import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Login from '@/components/Login'
import Cadastro from '@/components/Cadastro'
import Cadastro_Obra from '@/components/Cadastro_Obra'
import RedefinirSenha from '@/components/RedefinirSenha'
import User from '@/components/User'
import Cadastro_Andar from '@/components/Cadastro_Andar'
import Cadastro_Edificio from '@/components/Cadastro_Edificio'
import Atualiza_Andar from '@/components/Atualiza_Andar'
import Atualiza_Edificio from '@/components/Atualiza_Edificio'
import Atualiza_Obra from '@/components/Atualiza_Obra'
import Consulta from '@/components/Consulta'
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
    },
     {
      path: '/cadastroAndar',
      name: 'Cadastro_Andar',
      component: Cadastro_Andar
    },
    ,
     {
      path: '/cadastroEdificio',
      name: 'Cadastro_Edificio',
      component: Cadastro_Edificio
    },
    ,
     {
      path: '/atualizaObra',
      name: 'Atualiza_Obra',
      component: Atualiza_Obra
    },
    ,
     {
      path: '/atualizaAndar',
      name: 'Atualiza_Andar',
      component: Atualiza_Andar
    },
    ,
     {
      path: '/atualizaEdificio',
      name: 'Atualiza_Edificio',
      component: Atualiza_Edificio
    },
    {
      path: '/consulta',
      name: 'Consulta',
      component: Consulta
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
