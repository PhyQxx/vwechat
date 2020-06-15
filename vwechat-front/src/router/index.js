import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component:() => import('@/view/Login')
    },
    {
      path: 'index',
      name: 'index',
      component:() => import('@/view/Index'),
      children: [
        {
          path: 'homepage',
          name: 'homepage',
          component:() => import('@/view/index/Homepage'),
        }
      ]
    }
  ]
})
