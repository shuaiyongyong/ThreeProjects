<%@  page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<base href="/mybatis-yunduan/">
<meta charset="UTF-8">
<title>添加书签</title>
<link rel="stylesheet" type="text/css" href="css/toAdd.css">
</head>

<body>
	<form id="addForm" method="post">
		<table style="text-align: left;">
			<tr >
				<td colspan="2"  id="sou">搜藏</td>
			</tr>
			<tr >
				<td>名称：</td>
				<td><input name="label" type="text" style="height:20px" size="40" value="新浪网" /></td>
			</tr>
			<tr >
				<td>连接：</td>
				<td><input name="url" type="text" style="height:20px" size="40" value="http://www.sina.com" /></td>
			</tr>
			<tr >
				<td>tag：</td>
				<td><input name="tags" type="text"  style="height:20px" size="40" value="新闻，门户" /></td>
			</tr>
			<tr >
				<td></td>
				<td  id="li">可以多个，用“，”隔开</td>
			</tr>
			<tr >
				<td>描述：</td>
				<td><textarea name="desc" rows="5" cols="40" id="contents">一个好网站</textarea></td>
			</tr>
			<tr >
				<td colspan="2" style="text-align: right;"><button onclick="cancel()">取消</button> &nbsp;&nbsp;&nbsp;
					<input  type="button"  onclick="add()" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/toAdd.js"></script>

</body>

</html>
