<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
    <script>

        function clickUpdate() {

            if(confirm("비밀번호 일치 시 수정이 가능합니다. 진행하시겠습니까?")) {
                document.form.submit();
            } else {
                return false;
            }
        }

        function clickDelete() {

            if(confirm("삭제가 그냥 가능합니다. 진행하시겠습니까?")){
                window.location.href="delete.do?idx=${content.idx}&password=${content.password}";
            } else {
                return false;
            }
        }

    </script>
</head>
<body>

<h2>'view'</h2>

<form name="form" method="post" action="/update.do">

    <table border="1" width="600px">
        <tr>
            <th>제목</th>
            <th style="text-align: left">
                <input type="text" name="title" value="${content.title}">
            </th>
        </tr>
        <tr>
            <th>작성자</th>
            <th style="text-align: left">
                <input type="text" name="writer" value="${content.writer}">
            </th>
        </tr>
        <tr>
            <th>비밀번호</th>
            <th style="text-align: left">
                <input type="password" name="password" id="password">
            </th>
        </tr>
        <tr>
            <th>날짜</th>
            <th style="text-align: left">
                ${content.date}
            </th>
        </tr>
        <tr>
            <th>내용</th>
            <th style="text-align: left">
                <textarea cols="50" rows="5" name="content">${content.content} </textarea>
            </th>
        </tr>
    </table>

    <input type="button" value="수정" onclick="clickUpdate()">
    <input type="button" value="삭제" onClick="clickDelete()">

    <br>

    <button type="button" onclick="window.location.href='main.do'">돌아가기</button>

</form>


</body>
</html>
