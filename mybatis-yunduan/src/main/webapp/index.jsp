<%@  page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<base href="/mybatis-yunduan/">
<meta charset="UTF-8">
<title>搜藏</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<form name="favForm" method="post"
		action="/cang/fav.do;jsessionid=FF8C0487A99814B144B07E5633524A0F">
		<input type="hidden" name="op" value="toList" />

		<div class="banner" valign="top">搜藏</div>

		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<td style="text-align: right;" valign="top">
					<!-- 左边Tag列表 -->
					<div class="left_labels">
						<table class="labels_table" cellspacing="0" cellpadding="0"
							border="0">
							<tr>
								<td><a href="#" onclick="add();" style="font-weight: bold;">添加书签</a></td>
							</tr>
							<tr>
								<td class="selected_label"><a href="javascript:void(0)"
									onclick="show(0)">全部</a></td>
							</tr>
							<tr>
								<td><a href="javascript:void(0)" onclick="show(-1)"
									class="name">未分类</a></td>
							</tr>
						</table>
					</div>
				</td>
				<td>
					<!-- 右边fav内容 -->
					<div class="content_links">
					</div>
				</td>
			</tr>
		</table>

	</form>
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>