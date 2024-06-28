import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from "@/views/LoginView.vue";
import IndexView from "@/views/IndexView.vue";
import EnrollView from "@/views/EnrollView.vue";
import BlogConformity from "@/views/BlogConformity.vue";
import ReleaseView from "@/views/ReleaseView.vue";
Vue.use(VueRouter)

const routes = [

  {
    path: '/',
    name: 'Login',
    component: LoginView
  },
  {
    path: '/indexview',
    name: 'IndexView',
    component: IndexView
  },
  {
    path: "/enrollview",
    name: 'EnrollView',
    component: EnrollView
  },
  {
    path: '/blogconformity',
    name: 'BlogConformity',
    component: BlogConformity
  },
  {
    path: '/releaseview',
    name: 'ReleaseView',
    component: ReleaseView
  }


]

const router = new VueRouter({
  routes
})

export default router
