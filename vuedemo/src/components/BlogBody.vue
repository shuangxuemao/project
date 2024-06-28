<script>


import axios from "axios";

export default {
  name: "BlogBody",
  data(){
    return{
      blog:"",
      blogComments:"",
      comments:""
    }
  },
  methods: {

    getBody() {
      this.blog=this.$store.state.blogbody;
      console.log(this.blog);
    },
    Commentsblog(){
      console.log(this.blog.blogID)
      axios.post("http://121.43.97.114:8080/blog/commentsblog",{
        blogId:this.blog.blogID,
        username:this.$store.state.username,
        commentsBody:this.blogComments
      }).then(()=>{
        location.reload()
      })
    },
    getComments(){
      axios.get("http://121.43.97.114:8080/blog/comments").then(response=>{
        console.log(response.data);
        this.comments=response.data;
      })
    }
  },

  mounted() {
    this.getBody();
    this.getComments();
  }
}
</script>

<template>
<div>
    <div style="width: 50%;margin: 0 auto">
      <h1>标题:{{blog.blogTitle}}</h1>
      <h2>内容</h2>
      <div>{{blog.blogBody}}</div>
      <h2>评论</h2>
      <div v-for="commentss in comments" :key="commentss.id" style="line-height: 40px">
        {{commentss.username}}:
        {{commentss.commentsBody}}
      </div>
      <div>
        <input type="text" v-model="blogComments" style="padding: 9px;">
        <el-button type="primary" icon="el-icon-edit" @click="Commentsblog">评论</el-button>
      </div>
    </div>




</div>

</template>

<style scoped>

</style>