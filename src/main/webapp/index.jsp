<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var webPath='${pageContext.request.contextPath}';
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/EditUser.js"></script>
</head>
<body>
	姓名:<input id="userName"  >
	<button id="addUser">增加</button>
	<br>
	<table>
		<thead>
			<tr>
				<td>编号</td>
				<td>姓名</td>
			</tr>
		</thead>
		<tbody id="usertable">
			
		</tbody>
	</table>
	</br>
	<button id="first">首  页</button>
	<button id="up">上一页</button>
	<button id="next">下一页</button>
	<button id="last">尾  页</button>
</body>
</html>