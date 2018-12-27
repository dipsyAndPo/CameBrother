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
      <li class="layui-nav-item"><a href="selectByExample">行业详情</a></li>
      <li class="layui-nav-item"><a href="Pagelist">素材管理</a></li>
      <li class="layui-nav-item"><a href="selectNotice">公告管理</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <!-- <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> -->
          ${uname}
        </a>
        <dl class="layui-nav-child">
          <!-- <dd><a href="">收藏</a></dd> -->
          <dd><a href="login.html">退出</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">前台首页</a></li>
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