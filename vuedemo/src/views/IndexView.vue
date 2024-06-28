<script>
import BlogTitle from "@/components/BlogTitle.vue";
import IndexHead from "@/components/IndexHead.vue";
export default{
  name:'indexView',
  components:{
    BlogTitle,
    IndexHead,
  }
}
</script>

<template>
<div>
  <IndexHead></IndexHead>
  <BlogTitle></BlogTitle>
</div>
</template>

<style scoped>

</style>