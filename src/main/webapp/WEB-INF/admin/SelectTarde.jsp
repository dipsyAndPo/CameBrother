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
		
	
		$("input.tname").keyup(function(){
	        var tname = $(this).val();
	        var page = "updateByPrimaryKeySelective";
	        var tid = $(this).attr("tid");
	        var parentSpan = $(this);
	        parentSpan.css("border","1px solid green");
	        $.post(
	                page,
	                {"tname":tname,"tid":tid},
	                function(result){
	                    if("success"==result)
	                        parentSpan.css("border","1px solid green");
	                    else
	                        parentSpan.css("border","1px solid red");
	                });
	   });
		
		$("#submitBtn").click(function() {
			   if($("#name1").val()==""){
				   alert("行业详情为空");
					return false;
			   }else{
					return true;
				}
		});
		
	});
		
		</script>
<body>
 <!--引入头部文件 -->
<%@include file="admin_head.jsp"%> 
<div style="margin-left: 335px">
	  <form
		style="width: 550px; height: 45px; margin-left: 25px; margin-top: 17px;"
		action="${pageContext.request.contextPath }/insert.action">
		行业详情:
		<div class="layui-inline" style="margin-right: 15px;">
			<input class="layui-input" id="name1" type="text" name="tname"
				placeholder="添加的行业类型" autocomplete="off"/>
		</div>
		<input type="submit" class="layui-btn" style="margin-left: 10px;"
			value="操作" />
	</form> 
	</div>
	
	<div align="center">
		<table class="layui-table" lay-skin="row" lay-even=""
			style="width: 1200px">
			<colgroup>
				<col width="300">
				<col width="300">
				<col width="300">
				<col>
			</colgroup>
			<thead>
				<tr>
					<th>ID</th>
					<th>行业分类</th>
					<th>行业分类下的详情</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tardes}" var="u">
					<tr>
						<td>${u.tid}</td>
						<td><input  class="tname" type="text" tid="${u.tid}"  name="tname" value="${u.tname}"></td>
                        <td><a href="selectMouldlist?tid=${u.tid}">▥</a></td>
						<td><a href="deleteByPrimaryKey?tid=${u.tid}">✘</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>