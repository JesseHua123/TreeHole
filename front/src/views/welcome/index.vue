<template>
    <div class="welcome">
       
       
        <div class="container"> 
             <div class="title"> <h1>我要学习网</h1></div>
            <div class="art-list">
               <p>Ant Design vue的使用</p>
               <p>剪贴板操作 Clipboard API 教程</p>
               <p>vue的使用和介绍</p>
               <p>git的使用</p>
                <p>vue的使用和介绍</p>
               <p>git的使用</p>
                <p>vue的使用和介绍</p>
               <p>git的使用</p>
                <p>vue的使用和介绍</p>
               <p>git的使用</p>
                <p>git的使用</p>
                <p>vue的使用和介绍</p>
               <p>git的使用</p>
                <p>git的使用</p>
                <p>vue的使用和介绍</p>
               <p>git的使用</p>
            </div>
               
        </div>
          <footer class="footer"><span v-on:click="beian">Copyright © 2020-2025 我要学习网  runoob.com All Rights Reserved. 备案号：闽ICP备18021806号-2</span></footer>
    </div>
</template>

<script lang="ts">
import Vue from 'vue'
export default class Welcome extends Vue{




}
</script>
<style lang="scss">
.welcome{

    background-image: url(../../assets/welcome.jpg);
    background-size: cover;
    width: 100%;
    height:100%;
    opacity: 90%;
    
}
.container{
    width:90%;
    height: 80%;
    // opacity: 40%;
    // border-radius: 50px;
    // margin: 80px auto;
    // border: thin  black solid;
    // background-color: black;
    background-color: rgba(0,0,0,0.3);
    border-radius: 1.5em;
    color: #fefefe;
    overflow: auto;
    position: absolute;
    left: 50%;
    top: 50%;
    width: auto;
    height: auto;
    max-height: 80%;
    min-width: 90%;
    -webkit-transform: translate(-50%, -50%);
    -moz-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    -o-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
    transition: height 1s ease;
    transition: top 1s ease;

}
.title{
    color:white;
    margin:20px auto;
    width: 1000px;
    font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    text-align: center;
    font-size: large;
     //text-shadow: 5px -5px rgb(255, 230, 0), 4px -4px white;
}

.art-list{
  margin-left:200px ;
  color: white;
  font-size: large;
  p{

  }
}

  .footer{
    width: 100%;
    height: 40px;
    line-height: 40px;
    position: fixed;
    bottom: 0;
    width: 100%;
    text-align: center;
    background: #000;
    color: #fff;
    font-family: Arial;
    font-size: 12px;
    letter-spacing: 1px;
}


</style>