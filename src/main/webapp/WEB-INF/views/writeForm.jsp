<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한 줄 게시판 글쓰기</title>
</head>
<body>
	<h2>한 줄 게시판 글쓰기</h2>
	<hr>
	<table border="1" cellpadding="0" cellspacing="0" width="1000">
		<form action="write">
			<tr height="40">
				<th>글쓴이</th>
		 		<td><input type="text" name="mwriter" size="60"></td>
			</tr>
			<tr height="50">
				<th>한줄쓰기</th>
		 		<td><input type="text" name="mcontent" size="60"></td>
			</tr>
			<tr>
		 		<td colspan="2" align="right">
		 		<input type="submit" value="한줄입력">
		 		<input type="button" value="목록보기" onclick="javascript:window.location='list'">
		 		</td>
			</tr>	
		</form>	
	</table>
</body>
</html>