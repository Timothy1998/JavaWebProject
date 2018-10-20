<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
</head>
<body>
<p>${titlePage}</p>

<form:form id="userInscription"
           method="post"
           action="/firstSpring/inscription/send"
           modelAttribute="currentUser" >
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <p></p>
    <form:label path="age">age</form:label>
    <form:input path="age"/>
    <p></p>
    <form:label path="male">Boy</form:label>
    <form:radiobutton path="male" value="true"/>

    <form:label path="male">Girl</form:label>
    <form:radiobutton path="male" value="false"/>
    <p></p>
    <form:select path="hobby">
        <form:options items="${hobbies}" itemValue="id" itemLabel="name"/>
        What's your preferred hobby ?
    </form:select>
    <p></p>
    <form:button>Send</form:button>

</form:form>

</body>
</html>