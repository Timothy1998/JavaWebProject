<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">

    <link rel="stylesheet" href="<spring:url value='/css/first.css' />" type="text/css">
    <title>${title}</title>
</head>
<body>
    <h1>Bonjour</h1>
    <h2>Ca va ?</h2>
    <div>
        <img class="small" src='<spring:url value="/images/Small-mario.png"/>'/>
        <img class="small" src='<spring:url value="/images/The_death.png"/>'/>
        <div>
            <tiles:insertAttribute name = "main-content" />
        </div>
    </div>
    <footer>
        <p>
            Copyright Henallux 2018
        </p>
    </footer>
</body>
</html>