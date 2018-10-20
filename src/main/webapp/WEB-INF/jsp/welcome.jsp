<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
</head>
<body>
    <p>${titlePage}</p>

    <form:form id="magicKey"
               method="post"
               action="/firstSpring/hello/formMagic"
               modelAttribute="magicKeyForm" >
        <form:label path="magicKey">Magic Key</form:label>
        <form:input path="magicKey"/>
        <form:button>Send</form:button>

    </form:form>

</body>
</html>