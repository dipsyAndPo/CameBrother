<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>head</title>
  <link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
<div align="center">
<div class="layui-layout layui-layout-admin" >

  <div class="layui-header">
    <div class="layui-logo">后台管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">行业详情</a></li>
      <li class="layui-nav-item"><a href="">素材管理</a></li>
      <li class="layui-nav-item"><a href="">公告管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <!-- <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> -->
          贤心
        </a>
       <!--  <dl class="layui-nav-child">
          <dd><a href="">收藏</a></dd>
          <dd><a href="">修改密码</a></dd>
        </dl> -->
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
    
  </div>
  </div>
  </div>
<script src="layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>

</body>
</html>