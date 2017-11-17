<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>

<html>
<body>


<h2>'write'</h2>

<form name-="form" method="post" action="insert.do">

    <table border="1" width="600px">
        <tr>
            <th>제목</th>
            <th style="text-align: left">
                <input type="text" name="title">
            </th>
        </tr>
        <tr>
            <th>작성자</th>
            <th style="text-align: left">
                <input type="text" name="writer">
            </th>
        </tr>
        <tr>
            <th>비밀번호</th>
            <th style="text-align: left">
                <input type="password" name="password">
            </th>
        </tr>
        <tr>
            <th>내용</th>
            <th style="text-align: left">
                <textarea cols="50" rows="5" name="content"></textarea>
            </th>
        </tr>
    </table>
    <input type="submit" value="등록하기">
</form>


</body>
</html>
