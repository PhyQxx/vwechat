<template>
  <div id="login">
    <div class="title">
      微信号/QQ号/邮箱登录
    </div>
    <van-cell-group>
      <van-field v-model="username" label="账号" placeholder="请填写微信号/QQ号/邮箱" />
      <van-field v-model="password" label="密码" placeholder="请填写密码" />
    </van-cell-group>
    <van-button @click="login" :disabled="username === '' || password === ''" type="primary" block>登录</van-button>
  </div>
</template>

<script>
  import Vue from 'vue';
  import { Cell, CellGroup } from 'vant';
  import { Field } from 'vant';

  Vue.use(Field);
    export default {
        name: "Login",
      data() {
          return{
            username: '',
            password: '',
          }
      },
      methods: {
        login() {
          // if (this.username === 'phy' && this.password === '123') {
            this.$router.push({
              name: 'homepage'
            })
          // }
        }
      }
    }
</script>

<style scoped>
  .van-button--primary{
    margin-top: 2rem;
  }
  .title{
    margin: 2rem 1rem 1rem;
    font-size: 1.2rem;
  }
  #login{
    padding: 1rem;
  }
</style>
