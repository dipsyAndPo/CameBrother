<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>行业详情</title>
<link rel="stylesheet" href="layui/css/layui.css" media="all">
<script src="js/jquery-1.7.2.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
	$(function() {

		/* 1.修改 */
		$("input.mname").keyup(function() {
			var mname = $(this).val();
			var page = "updateByPrimaryKeySelectiveaa";
			var mid = $(this).attr("mid");
			var parentSpan = $(this);
			parentSpan.css("border", "1px solid green");
			$.post(page, {
				"mname" : mname,
				"mid" : mid
			}, function(result) {
				if ("success" == result)
					parentSpan.css("border", "1px solid green");
				else
					parentSpan.css("border", "1px solid red");
			});

		});
		/* 2.修改 */
		$("input.label").keyup(function() {
			var label = $(this).val();
			var page = "updateByPrimaryKeySelective2";
			var mid = $(this).attr("mid");
			var parentSpan = $(this);
			parentSpan.css("border", "1px solid green");
			$.post(page, {
				"label" : label,
				"mid" : mid
			}, function(result) {
				if ("success" == result)
					parentSpan.css("border", "1px solid green");
				else
					parentSpan.css("border", "1px solid red");
			});
		});
		/* 3.修改 */

		$("input.praise").keyup(function() {
			var praise = $(this).val();
			var page = "updateByPrimaryKeySelective3";
			var mid = $(this).attr("mid");
			var parentSpan = $(this);
			parentSpan.css("border", "1px solid green");
			$.post(page, {
				"praise" : praise,
				"mid" : mid
			}, function(result) {
				if ("success" == result)
					parentSpan.css("border", "1px solid green");
				else
					parentSpan.css("border", "1px solid red");
			});
		});
		/* 4.修改 */

		$("input.preview").keyup(function() {
			var preview = $(this).val();
			var page = "updateByPrimaryKeySelective4";
			var mid = $(this).attr("mid");
			var parentSpan = $(this);
			parentSpan.css("border", "1px solid green");
			$.post(page, {
				"preview" : preview,
				"mid" : mid
			}, function(result) {
				if ("success" == result)
					parentSpan.css("border", "1px solid green");
				else
					parentSpan.css("border", "1px solid red");
			});
		});
		/* 5.修改 */

		$("input.download").keyup(function() {
			var download = $(this).val();
			var page = "updateByPrimaryKeySelective5";
			var mid = $(this).attr("mid");
			var parentSpan = $(this);
			parentSpan.css("border", "1px solid green");
			$.post(page, {
				"download" : download,
				"mid" : mid
			}, function(result) {
				if ("success" == result)
					parentSpan.css("border", "1px solid green");
				else
					parentSpan.css("border", "1px solid red");
			});
		});

		/* 删除 */

		$(".delete").click(function() {
			var mid = $(this).attr("mid");
			var page = "deleteByPrimaryKeyMould";
			$.post(page, {
				"mid" : mid
			}, function() {
				window.location.reload();
			});
		})

		$(".page1").click(function() {
			if ($("#name1").val() == "") {
				alert("行业详情为空");
				return false;
			} else {
				return true;
			}
		});

	});
</script>
<body>
	<!--引入头部文件 -->
	<%@include file="admin_head.jsp"%>
	<div style="margin-left: 335px">
		<%-- <form
		style="width: 550px; height: 45px; margin-left: 25px; margin-top: 17px;"
		action="${pageContext.request.contextPath }/insert.action">
		行业详情:
		<div class="layui-inline" style="margin-right: 15px;">
			<input class="layui-input" id="name1" type="text" name="tname"
				placeholder="添加的行业类型" autocomplete="off">
		</div>
		<input type="submit" class="layui-btn" style="margin-left: 10px;"
			value="操作" />
	</form>  --%>
	</div>

	<div align="center">
		<table class="layui-table" lay-skin="row" lay-even=""
			style="width: 1600px; text-align: center;">

			<thead>
				<tr>
					<th style="text-align: center;">ID</th>
					<th style="text-align: center;">行业分类</th>
					<th style="text-align: center;">标签(😲)</th>
					<th style="text-align: center;">点赞数(👍👍)</th>
					<th style="text-align: center;">踩数量(👎👎)</th>
					<th style="text-align: center;">网页主图</th>
					<th style="text-align: center;">LOGO</th>
					<th style="text-align: center;">在线预览地址</th>
					<th style="text-align: center;">下载地址</th>
					<th style="text-align: center;">删除(🗑)</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${moulds}" var="m">
					<tr>
						<td>${m.mid}</td>
						<td><input class="mname" type="text" mid="${m.mid}"
							name="mname" value="${m.mname}"></td>
						<td><input class="label" type="text" mid="${m.mid}"
							name="label" value="${m.label}"></td>
						<%--  <td><input  class="praise" type="text" mid="${m.mid}"  name="praise" value="${m.praise}"></td> --%>
						<td>${m.praise}</td>
						<td>${m.tread}</td>
						<td><img src="${m.img}" /></td>
						<td><img src="${m.logo}" /></td>
						<td><input class="preview" type="text" mid="${m.mid}"
							name="preview" value="${m.preview}"></td>
						<td><input class="download" type="text" mid="${m.mid}"
							name="download" value="${m.download}"></td>
						<%--  <td><input  class="tname" type="text" tid="${u.tid}"  name="tname" value="${u.tname}"></td> --%>
						<%-- <td><a href="selectByPrimaryKey?tid=${u.tid}">▥</a></td> --%>
						<td><a href="javascript:void(0)" mid="${m.mid}"
							class="delete">✘</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<ul class="pagination pagination-lg">
			<li><a href="?start=0">首页</a></li>
			<li><a href="?start=${page.start-page.count}">👈</a></li>
			<li><a href="?start=${page.start+page.count}">👉</a></li>
			<li><a href="?start=${page.last}">尾页</a></li>
		</ul>
	</div>

</body>
</html>