<script>
import axios from "axios";

export default{
  name:'blog-title',
  data(){
    return{
      blog:[]
    }
  },
  methods:{
    getTitle(){
      axios.get("http://121.43.97.114:8080/list/blog").then(response=>{
        this.blog=response.data;

      })
    },
    postList(item){
      this.$store.commit("setBlogbody",item)
      this.$router.push({
        name:'BlogConformity',

      })
    }
  },


  mounted() {
    this.getTitle();
  }

}
</script>

<template>
<div>
    <div v-for="item in blog" :key="item.id" class="blogdiv" @click="postList(item)">
        <h1>{{item.blogTitle}}</h1>
    </div>
</div>
</template>

<style scoped>
.blogdiv{
  background-color: darkorange;
  width: 50%;
  margin: 0 auto;
}
</style>