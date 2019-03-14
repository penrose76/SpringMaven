<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019-03-13
  Time: 06:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Dodanie uzytkownika</title>
</head>
<body>

<f:form commandName="person" action="./save" method="POST">

    <f:input path="firstname"  /><f:errors path="firstname" /><br>
    <f:input path="lastname"  /><f:errors path="lastname" /><br>

    <f:button>Zapisz</f:button>



</f:form>


</body>
</html>
