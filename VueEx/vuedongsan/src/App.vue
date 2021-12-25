<template>
  <div id="app">
    <div class="menu">
      <a href="" v-for="(item, idx) in menu" :key="idx">{{item}}</a>
    </div>  
    
    <!-- 모달창 -->
    <div class="black-bg" v-if="modal">
      <div class="white-bg">
        <h4>상세 페이지</h4>
        <p>상세 페이지 내용</p>
        <input type="button" 
          value="닫기" 
          class="modal-btn"
          @click="moodal=modal?modal=false:modal=true"
        >
      </div>
    </div>

    <!-- 원래 이거 따로 받아야하는거 아닌가 return하면 -->
    <div>
      <img src="./assets/room0.jpg" class="room-img">
      <h4
      @click="moodal=modal?modal=false:modal=true"
      >{{products[0]}}</h4>
      <p>{{price[0]}} 만원</p>
      <button @click="count[0]++">허위매물신고</button>
      <span>신고수 : {{ count[0] }}</span>
    </div>
    <div>
      <img src="./assets/room1.jpg" class="room-img">
      <h4>{{products[1]}}</h4>
      <p>{{price[1]}} 만원</p> 
      <button @click="count[1] += 2">허위매물신고</button>
      <span>신고수 : {{ count[1] }}</span>
    </div>
    <div>
      <img src="./assets/room2.jpg" class="room-img">
      <h4>{{products[2]}}</h4>
      <p>{{price[2]}} 만원</p>
      <button @click="count[2]++">허위매물신고</button>
      <span>신고수 : {{ count[2] }}</span>
    </div>

  </div>
</template>

<script>

// 경로는 무조건 ./로 시작한다고 생각
import {apple, apple2} from './oneroom.js'
    // 작명

export default {
  name: 'App',
  data () {
    return {
      test: [apple, apple2],
      modal: false,
      products: ['역삼동원룸', '천호동원룸', '마포구원룸'],
      menu: ['Home', 'Shop', 'About'],
      price: [50, 100, 70],
      count: [1, 0, 3]
    }
  },
  components: {
  },
  methods: {
    increase : function (){
      //let id = e.target.nextElementSibling.id;
      //console.log(this.count[id]++)
      //console.log(id);
    }
  }
}
</script>

// 동적 UI만드는 법:
// 0 HTML CSS로 디자인 해두기
// 1 UI의 현재의 상태를 데이터로 저장
// 2 데이터에 따라 UI가 어떻게 보일지 작성

<style>
/* 모달창 디자인 */
body{
  margin: 0;
}

div{
  box-sizing: border-box;
}
.black-bg{
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.5);
  position:fixed;
  padding:20px;
}
.white-bg{
  width:100%;
  background:white;
  border-radius:8px;
  padding:20px;
}
.modal-btn{
  border-radius: 8px;
  padding:5px 20;
  background: skyblue;
  color: white;
  font-weight: bold;
  border: none;
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

.h4 {
  color: blue;
}
.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
  text-decoration: none;
}
</style>