<template>
  <div id="homepage">
    <div class="header">
      <div class="left">微信（2）</div>
      <div class="right">
        <van-icon name="search" size="1.2rem"/>
        <van-icon name="add-o" size="1.2rem"/>
      </div>
    </div>
    <van-list
      v-model="loading"
      :finished="finished"
      finished-text="没有更多了"
      @load="onLoad"
    >
      <div class="one" v-for="item in list" @click="">
        <div class="header-photo">
          <img src="../../assets/imgs/header.jpg" alt=""/>
          <div class="content">
            <div class="top">帅气的布里茨</div>
            <div class="bottom">你好</div>
          </div>
        </div>
        <div class="time">
          <div class="year">2020-06-15</div>
          <div class="hour">17:09:17</div>
        </div>
      </div>
    </van-list>
  </div>
</template>

<script>
  import Vue from 'vue';
  import { List } from 'vant';

  Vue.use(List);
    export default {
        name: "Homepage",
      data() {
        return {
          list: [],
          loading: false,
          finished: false,
        };
      },
      methods: {
        onLoad() {
          // 异步更新数据
          // setTimeout 仅做示例，真实场景中一般为 ajax 请求
          setTimeout(() => {
            for (let i = 0; i < 10; i++) {
              this.list.push(this.list.length + 1);
            }

            // 加载状态结束
            this.loading = false;

            // 数据全部加载完成
            if (this.list.length >= 40) {
              this.finished = true;
            }
          }, 1000);
        },
      },
    }
</script>

<style scoped>
  .content .bottom{
    font-size: 0.8rem;
    color: #8a8a8a;
    padding-top: 0.4rem;
  }
  .time{
    /*flex: 2;*/
    font-size: 0.8rem;
    color: #8a8a8a;
  }
  .content{
    /*flex: 5;*/
    float: left;
    margin-left: 0.5rem;
  }
  .header-photo{
    height: 2.5rem;
    /*flex: 1;*/
  }
  .header-photo img{
    height: 2.5rem;
    float: left;
  }
  .one{
    background: #FFF;
    display: flex;
    justify-content: space-between;
    padding: 0.5rem 1rem;
    border-bottom: 1px solid #E6E6E6;
  }
  .van-list{
    padding: 3rem 0 50px 0;
  }
  .right{
    float: right;
    height: 2rem;
  }
  .left{
    float: left;
    height: 2rem;
  }
  .header{
    width: calc(100% - 2rem);
    padding: 1rem;
    background: #ECECEC;
    position: fixed;
    z-index: 999;
    height: 1rem;
  }
  #homepage{
  }
</style>
