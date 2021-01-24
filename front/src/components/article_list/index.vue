<template>
  <div class="article-list-page">
    <div class="article-list" v-for="(item,index) in articleList" :key="index">
      <div class="article-title"><h3>{{item.title}}</h3></div>
      <div class="article-brief-content">
        <div class="article-brief">{{item.brief}}</div>
        <div class="article-time">{{item.time}}</div>
        
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";

@Component
export default class ArticleList extends Vue {
  private articleList: object[] = [
    { title: "第一篇", time: "2020-03-07", brief: "这是第一篇" },
    { title: "第二篇", time: "2020-03-07", brief: "这是第二篇" },
    { title: "第三篇", time: "2020-03-07", brief: "这是第三篇" },
    { title: "第四篇", time: "2020-03-07", brief: "这是第四篇" },
    { title: "第五篇", time: "2020-03-07", brief: "这是第五篇" },
    { title: "第六篇", time: "2020-03-07", brief: "这是第六篇" }
  ];
}
</script>

<style lang="scss" scoped>
.article-list-page {
  border: solid thin;
}

.article-list {
  border-bottom: solid thin red;
  clear: both;
  height: 400px;
  padding: 20px 40px;
  margin-top: 0px;
}

.article-title {
  font-family: "Microsoft YaHei"

}

.article-brief-content {
  .article-brief {
    float: left;
  }
  .article-time {
    float: right;
  }
}
</style>