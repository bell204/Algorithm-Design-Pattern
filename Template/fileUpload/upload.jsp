<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- enctype 안 해주면 file의 이름만 전송되고 파일 객체가 서버로 전송되지 않음. -->
<form action="file.do" method="post" enctype="multipart/form-data">

<label>파일 첨부</label>
<input type="file" name="uploadFile">

<input type="submit" value="전송">
</form>

</body>
</html>