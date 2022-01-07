<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022-01-07
  Time: 오후 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%-- 웰컴 페이지인 web > index.jsp파일에 버튼태그 만들고 버튼누르면 localhost:8080/aaa 로 가도록 만듦--%>
  <%--AController 를 타고감--%>
  <button type="button" onclick="location.href='/aaa'" class="btn btn-primary">클릭시 /aaa로 </button>
  <%--내용 버튼을 누르시오 --%>
  <h1>버튼을 누르시오</h1>
  </body>
</html>
