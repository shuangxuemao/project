import Vue from 'vue'
import Vuex from 'vuex'
import createPersistedState from 'vuex-persistedstate'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    username:"",
    blogbody:""
  },
  getters: {
  },
  mutations: {
    setUsername (state, username) {
      state.username = username
    },
    setBlogbody (state, blogbody) {
      state.blogbody = blogbody
    }
  },
  actions: {
  },
  modules: {
  },
  plugins: [
    // veux持久化配置
    createPersistedState({

    })
  ]

})
