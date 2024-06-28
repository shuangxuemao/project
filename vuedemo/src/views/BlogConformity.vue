<script>
import IndexHead from "@/components/IndexHead.vue"
import BlogBody from "@/components/BlogBody.vue";
export default {
  name:"BlogConformity",
  components: {
    BlogBody,
    IndexHead,
  }
}
</script>

<template>
<div>
  <IndexHead></IndexHead>
  <BlogBody></BlogBody>
</div>
</template>

<style scoped>

</style>