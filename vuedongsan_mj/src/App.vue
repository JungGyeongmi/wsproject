<template>

  <div class="black-bg" v-if="모달창열렸니 == true">
    <div class="white-bg">
      <h4>상세페이지</h4>
      <p>상세페이지 내용</p>
      <button @click="모달창열렸니 = false">닫기</button>
    </div>
  </div>



  <div class="menu">
    <a v-for="a in 메뉴들" :key="a">{{ a }}</a>
  </div>


  <div v-for="(d, i) in 6" :key="i" >
    <img :src="원룸들[i].image" class="room-img">
    <h4>{{ 원룸들[i].title }}</h4>
    <p>{{ 원룸들[i].price }}원</p>
  </div>
  
</template>

<script>
import oneroomData from './assets/oneroom.js';


export default {
  name: 'App',
  data() {
    return {
      // state
      원룸들: oneroomData, // import 해온 것
      모달창열렸니: false,
      신고수: [0, 0, 0],
      메뉴들: ['Home', 'Shop', 'About'],
      products: ['역삼동원룸', '천호동원룸', '마포구원룸']
    }
  },
  components: {
  }
}
</script>

<style>
/* 모달창디자인 */
body {
  margin: 0;
}
div {
  box-sizing: border-box;
}
.black-bg {
  width: 100%; height: 100%;
  background: rgba(0,0,0,0.5);
  position: fixed; padding: 20px;
}
.white-bg {
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}

.room-img {
  width: 100%;
  margin-top: 40px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
}

</style>
