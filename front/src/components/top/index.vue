<template>
  <div>
      <div>这是Top组件内容</div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
@Component
export default class Top extends Vue {


}
</script>

<style lang="scss" scoped>
.article-content {
  //margin-left: 100px;
  width:3200px ;
  margin : 40px auto;
  border: 1px solid;
  height:1600px;
}

.solt-top{
  width:3000px;
  margin:40px auto;
  border:1px solid;
  height:200px;
}

</style>
