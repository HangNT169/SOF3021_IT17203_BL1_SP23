<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Category Code</th>
        <th>Category Name</th>
    </tr>
    <c:forEach items="${categories}" var="acc">
        <tr>
            <td>${acc.id}</td>
            <td>${acc.categoryCode}</td>
            <td>${acc.categoryName}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>