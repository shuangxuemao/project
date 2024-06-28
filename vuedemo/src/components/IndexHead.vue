<script>
export default {
  data() {
    return {
      activeIndex: '1',
      activeIndex2: '1'
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    exitlogin(){
      this.$store.commit("setUsername","");
      this.$store.commit("setBlogbody","");
      this.$router.push('/');
    }
  }
}
</script>
<template>
<div>
  <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect"
  background-color="skyblue" :router="true" >

    <el-menu-item index="/indexview">首页</el-menu-item>
    <el-menu-item index="/releaseview">发布博客</el-menu-item>
    <el-menu-item @click="exitlogin">退出登录</el-menu-item>
  </el-menu>
</div>
</template>
<style>

</style>