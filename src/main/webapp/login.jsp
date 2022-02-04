<html>
<head>
    <title><%= "Please Login" %></title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if(user.equals("admin") && pass.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<div class="container">
    <form method="post" action="login.jsp">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>