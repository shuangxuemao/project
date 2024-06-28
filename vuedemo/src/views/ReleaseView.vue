<script>
import IndexHead from "@/components/IndexHead.vue";
import ReleaseBlog from "@/components/ReleaseBlog.vue";
export default {
  name:"ReleaseView",
  components: {
    ReleaseBlog,
    IndexHead,
  }
}

</script>

<template>
  <div>
    <IndexHead></IndexHead>
    <ReleaseBlog></ReleaseBlog>
  </div>
</template>

<style scoped>

</style>