<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<html>
<body>

<h2>YJKB 게시판</h2>

<table border="1">
    <tr>
        <td>
            글번호
        </td>
        <td>
            글제목
        </td>
        <td>
            작성자
        </td>
    </tr>
</table>

<button>글 작성하기</button>

<%
    response.sendRedirect("./main.do");
%>

</body>
</html>
