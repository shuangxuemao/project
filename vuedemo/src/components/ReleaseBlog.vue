<script >
import axios from "axios";

export default {
  name: "ReleaseBlog",
  data(){
    return {
      blogTitle:"",
      blogBody:""
    }
  },
  methods:{
    releaseBlog(){
      axios.post("http://121.43.97.114:8080/blog/release",{
        blogTitle:this.blogTitle,
        blogBody:this.blogBody
      }).then(response=>{
        this.blog=response.data;
      })
      this.$message('发布成功！');
    }

  }

}
</script>

<template>
<div>
  <h1>发布博客</h1>
  <label>请输入标题</label><br>
  <p><input type="text" v-model="blogTitle" ></p>
  <p><label>请输入内容</label></p>
  <p><input type="text" v-model="blogBody"></p>
  <el-button type="primary" @click="releaseBlog">发布<i class="el-icon-upload el-icon--right"></i></el-button>
</div>
</template>

<style scoped>

</style>