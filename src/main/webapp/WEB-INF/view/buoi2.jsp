<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table>
<%--    <form action="search-sinh-vien" method="get" modelAttribute="ten">--%>
<%--        <input placeholder="nhập " id="ten" name="ten" >--%>
<%--        <button type="submit">tìm kiếm</button>--%>
<%--    </form>--%>

    <thead>
    <tr>
        <th>ID</th>
        <th>Fullname</th>
        <th>Username</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sinhViens}" var="acc">
        <tr>
            <td>${acc.ma}</td>
            <td>${acc.ten}</td>
            <td>${acc.tuoi}</td>
            <td><button><a href="/detail-sinh-vien/${acc.ma}"
                           class="btn btn-danger"> detail </a></button>
<%--            <button><a href="/delete-sinh-vien/${acc.ma}"--%>
<%--                           class="btn btn-danger"> delete </a></button>--%>
<%--                <button><a href="/view-update-sinh-vien/${acc.ma}"--%>
<%--                           class="btn btn-danger"> update </a></button></td>--%>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>