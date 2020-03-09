<template>
  <div class='home'>
  
     <div class="classify">
      <ArtcileClassify></ArtcileClassify>
     </div>
     <div class='article-content'>
      <ArticleList></ArticleList>
     </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import 'muse-ui-loading/dist/muse-ui-loading.css'; // load css
import Top from "../components/top/index.vue";
import ArtcileClassify from "../components/article_classify/index.vue";
import ArticleList from '../components/article_list/index.vue';


import {
  postData
}from '@/service/api';


@Component({
  components: {
    Top,
    ArtcileClassify,
    ArticleList
  }
})
export default class Home extends Vue {

 
      
 postTest = postData('/test',{});
 

}
</script>

<style lang="scss" >
.article-content {
  //margin-left: 100px;
  width:3200px ;
  margin : 40px auto;
//border: 1px solid;
  height:1600px;
}

.classify{
  width:3000px;
  margin:40px auto;
  border:1px solid;
  height:200px;
}

.button-wrapper {
  text-align: center;
  .mu-button{
    margin: 8px;
  }
}

</style>
