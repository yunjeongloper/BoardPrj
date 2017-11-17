<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<body>

<h1> Hello </h1>

    <h2>윤정 게시판 'list'</h2>

    <table border="1" width="600px">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>이름</th>
        </tr>
        <c:forEach var="row" items="${contents}">
            <tr>
                <td>${row.idx}</td>
                <td>
                    <div style="cursor:pointer" onclick="window.location.href='view.do?idx=${row.idx}'">
                        ${row.title}
                    </div>
                </td>
                <td>${row.writer}</td>
            </tr>
        </c:forEach>
    </table>

    <button onclick="window.location.href='write.do'">글쓰기</button>

</body>
</html>
