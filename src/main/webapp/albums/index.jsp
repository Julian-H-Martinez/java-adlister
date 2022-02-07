<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: julianmartinez
  Date: 2/7/22
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show All Albums</title>
</head>
<body>
  <h1>Here are all the albums!</h1>
<%--  itterating through each album--%>
  <c:forEach var="album" items="${albums}">
    <div class="album">
      <h2>${album.name}</h2>
      <h4>By: ${album.artist}</h4>
      <p>Year: ${album.releaseDate}; Sales in millions: ${album.sales}</p>
    </div>
  </c:forEach>
</body>
</html>
