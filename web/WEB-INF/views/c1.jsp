<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-01-07
  Time: 오후 3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <form action="/complete">
            <input type="text" name="aa">
            <input type="text" name="what">
            <input type="text" name="time">
            <input type="submit" value="제출!!!">
        </form>
    </body>
</html>
<%--폼태그 생성하여 액션에 complete경로 설정 하여 submit 버튼을 누르면 정보 제출--%>