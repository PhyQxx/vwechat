<template>
  <div id="index">
    <router-view></router-view>
    <van-tabbar v-model="active" active-color="#07C160">
      <van-tabbar-item icon="chat-o">微信</van-tabbar-item>
      <van-tabbar-item icon="friends-o">通讯录</van-tabbar-item>
      <van-tabbar-item icon="underway-o">发现</van-tabbar-item>
      <van-tabbar-item icon="user-o">我</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
  import Vue from 'vue';
  import { Tabbar, TabbarItem } from 'vant';

  Vue.use(Tabbar);
  Vue.use(TabbarItem);
    export default {
        name: "Index",
      data() {
          return{
            active: '',

          }
      }
    }
</script>

<style scoped>
  .van-tabbar{
    background: #F6F6F6;
  }
</style>
