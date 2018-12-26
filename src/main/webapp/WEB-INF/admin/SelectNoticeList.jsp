<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>行业详情</title>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<script src="js/jquery-1.7.2.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
	$(function() {
		
	    /* 修改1 */
		$("input.title").keyup(function(){
	        var title = $(this).val();
	        var page = "updateNotice1";
	        var nid = $(this).attr("nid");
	        var parentSpan = $(this);
	        parentSpan.css("border","1px solid green");
	        $.post(
	                page,
	                {"title":title,"nid":nid},
	                function(result){
	                    if("success"==result)
	                        parentSpan.css("border","1px solid green");
	                    else
	                        parentSpan.css("border","1px solid red");
	                });
	   });

	    /* 修改2 */
		$("input.context").keyup(function(){
	        var context = $(this).val();
	        var page = "updateNotice2";
	        var nid = $(this).attr("nid");
	        var parentSpan = $(this);
	        parentSpan.css("border","1px solid green");
	        $.post(
	                page,
	                {"context":context,"nid":nid},
	                function(result){
	                    if("success"==result)
	                        parentSpan.css("border","1px solid green");
	                    else
	                        parentSpan.css("border","1px solid red");
	                });
	   });
	 });
		
		
		</script>
<body>
 <!--引入头部文件 -->
<%@include file="admin_head.jsp"%> 
	<div align="center" style="margin-top: 50px">
		<table class="layui-table" lay-skin="row" lay-even=""
			style="width: 1200px">
			
			<thead>
				<tr>
					<th>ID</th>
					<th>公告标题</th>
					<th>公告内容</th>
					<th>发布时间</th>
					<th>首图</th>
					<th>LOGO</th>
					<th>删除(🗑)</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${notices}" var="n">
					<tr>
						<td>${n.nid}</td>
						<td><input  class="title" type="text" nid="${n.nid}"  name="title" value="${n.title}"></td>
						<td><input  class="context" type="text" nid="${n.nid}"  name="context" value="${n.context}"></td>
						<td>${n.dateline}</td>
						<td><img src="${n.img}"/></td>
						<td><img src="${n.logoimg}"/></td>
						<td><a href="deleteNotice?nid=${n.nid}">✘</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	  <form
	  class="layui-form layui-form-pane" enctype="multipart/form-data"
		style="width: 550px; height: 45px; margin-top: 50px; margin-left: 810px"
		action="${pageContext.request.contextPath }/insertNotice.action" method="post">
		 <div class="layui-form-item">
    <label class="layui-form-label">公告标题</label>
    <div class="layui-input-inline">
      <input name="title" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required">
    </div>
    </div>
     <div class="layui-form-item" >
    <label class="layui-form-label" style="margin-top: 15px" >公告内容</label>
    <div class="layui-input-inline" style="margin-top: 15px" >
      <input name="context" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required">
    </div>
	</div>	
	 <div class="layui-form-item" >
    <label class="layui-form-label" style="margin-top: 15px" >上传图片</label>
    <div class="layui-upload-drag">
    <input type="file"name="file"/>
    <input type="file"name="file1"/>
    </div>
	</div>	
	
	<div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn layui-btn-primary" type="reset">重置</button>
       <button class="layui-btn" lay-filter="demo1" lay-submit="">立即提交</button>
    </div>
  </div>
  
	
	</form> 

</body>
</html>