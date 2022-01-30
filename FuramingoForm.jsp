<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Furamingo Form</title>
</head>
<body>
	<p>平成フラミンゴへのお便り</p>
	<form action="/sample/FuramingoServlet" method="post">
		名前：<input type="text" name="name"><br>
		宛先：<select name="addres">
				<option value="unselected">選択してください</option>
				<option value="furamingo">平成フラミンゴ</option>
				<option value="nico">一宮にこ</option>
				<option value="riho">りんりん</option>
			</select><br>
		お便り内容：<br>
			<textarea name="message"></textarea><br>
		<input type="submit" value="送信">
	</form>
</body>
</html>