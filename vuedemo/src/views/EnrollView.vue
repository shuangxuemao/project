
<template>
  <div id="background">
      <div id="logo">博客注册</div>
      <div id="login">
        <el-card class="box-card">
          <div id="form">
            <el-input v-model="username" placeholder="请输入内容"></el-input>
            <el-input placeholder="请输入密码" v-model="password" show-password></el-input>
            <el-button type="primary" plain v-on:click="enroll">注册</el-button>
            <el-button type="primary" plain v-on:click="cancel">取消</el-button>
          </div>
        </el-card>
      </div>
    <div id="clock">
      <div id="time">{{time}}</div>
      <div id="date">{{date}}</div>
    </div>
  </div>
</template>

<style scoped>

#background{
  position: fixed;
  height: 100%;
  width: 100%;
  top: 0;
  left: 0;
  background-color: powderblue;
  background-size:400% ;
}

#logo{
  color: blue;
  font-size: 40px;
  font-weight: 1000;
  position: absolute;
  top: 15%;
  left: 15%;
}
#login{
  position: absolute;
  top: 30%;
  left: 40%;
}
.el-card {
  width: 370px;
  height: 210px;
  background-color: rgba(255,255,255,0.4);
}
#form{
  line-height: 50px;
  padding-left: 15px;
  padding-right: 15px;
}
#clock{
  position: absolute;
  top: 70%;
  left: 15%;
  text-align: left;
}
#time{
  font-size: 80px;
}
#date{
  font-size: 20px;
}
</style>
<script>
export default {
  name: "LoginView",
  data(){
    return{
      username:"",
      password:"",
      time:"",
      date:"",
    }
  },
  mounted() {
    this.$nextTick(()=>{
      setInterval(this.clock_update,1000);
    })
  },
  methods:{
    clock_update:function (){
      var dt = new Date();
      var year = dt.getFullYear();
      if(year<10){
        year="0"+year
      }
      var mon = dt.getMonth()+1;
      if(mon<10){
        mon="0"+mon
      }
      var day = dt.getDate();
      if(day<10){
        day="0"+day
      }
      var hour = dt.getHours();
      if(hour<10){
        hour="0"+hour
      }
      var minute = dt.getMinutes();
      if(minute<10){
        minute="0"+minute
      }
      this.time=hour+":"+minute
      this.date=year+"/"+mon+"/"+day

    },
    cancel(){
      this.$router.push("/")
    },
    enroll(){
      this.$axios({
        url:"http://121.43.97.114:8080/user/enroll",
        method:"post",
        data:{
          username:this.username,
          password:this.password,
        },
      })
          .then((res)=>{
            alert(res.data)
          })

    }

  }
}
</script>