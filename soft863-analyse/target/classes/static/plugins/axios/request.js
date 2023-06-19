
/*axios.defaults.headers['Content-Type'] = 'application/json;charset=utf-8'*/
const service = axios.create({
  // axios中请求配置有baseURL选项，表示请求URL公共部分
  baseURL: '/',
  // 超时
  timeout: 100000
})

/*const request = axios.create({
  url:'http://localhost:8080',
})

module.exports = request*/

window.$axios = service
