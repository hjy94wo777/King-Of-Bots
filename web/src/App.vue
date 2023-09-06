<template>
  <NavBar />
  <router-view/>
</template>

<script>
// import jquery from 'jquery';
  import NavBar from './components/NavBar.vue'
  import "bootstrap/dist/css/bootstrap.min.css"
  import "bootstrap/dist/js/bootstrap"
  // import $ from 'jquery'

  export default {
    components: {
      NavBar
    },
    setup() {
  //     $.ajax({
  //       url: "http://127.0.0.1:3000/user/account/token/",
  //       type: "post",
  //       data: {
  //         username: 'hjy',
  //         password: "HJY94wo",
  //       },
  //       success(resp) {
  //         console.log(resp);
  //       },
  //       error(resp) {
  //         console.log(resp);
  //       }
  //     });

  //     $.ajax({
  //       url: "http://127.0.0.1:3000/user/account/info/",
  //       type: "get",
  //       headers: {
  //         Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1YTZkNTYyODU1YjY0ZWNiOTk2MzdjMzc0NDNjZjAwZSIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY5MzgxMDAwNiwiZXhwIjoxNjk1MDE5NjA2fQ.QEEJo4XRiEnrw_0b8rfZF1caAcpeLxYQ-BwBoyosv8o",
  //       },
  //       success(resp) {
  //         console.log(resp);
  //       },
  //       error(resp) {
  //         console.log(resp);
  //       }
  //     });

  //     $.ajax({
  //       url: "http://127.0.0.1:3000/user/account/register/",
  //       type: "post",
  //       data: {
  //         username: 'hjy2',
  //         password: '123',
  //         confirmedPassword: '123'
  //       },
  //       success(resp) {
  //         console.log(resp);
  //       },
  //       error(resp) {
  //         console.log(resp);
  //       }

  //     })
     }
  }
</script>

<style>
body {
  background-image: url("./assets/images/background.png");
  background-size: cover;
}
</style>