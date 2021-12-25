<template>
  <div id="app">
    <div class="menu">
      <a href="" v-for="(item, idx) in menu" :key="idx">{{item}}</a>
    </div>
       
    <div v-for="(item, idx) in products" :key="idx">
      <h4>{{item}}</h4>
      <p>{{(idx+1)*30}} 만원</p>
      <button @click="increase" :id="idx">허위매물신고</button>
      <span >신고수 : {{ count[idx] }}</span>
    </div>

  </div>
</template>

<script>

export default {
  name: 'App',
  data () {
    return {
      products: ['역삼동원룸', '천호동원룸', '마포구원룸'],
      menu: ['Home', 'Shop', 'About'],
      count: [0, 0, 0],
    }
  },
  components: {
  },
  methods: {
    increase : function (e){
      var id = e.target.id;
      console.log(this.count[id])
      this.count[id] = this.count[id] +1 ;
    }
  }
}
</script>

// 동적 UI만드는 법:
// 0 HTML CSS로 디자인 해두기
// 1 UI의 현재의 상태를 데이터로 저장
// 2 데이터에 따라 UI가 어떻게 보일지 작성

<style>
body{
  margin:0'
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


#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
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
