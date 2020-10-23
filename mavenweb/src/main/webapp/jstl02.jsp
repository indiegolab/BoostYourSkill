<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.*" %>

<%  request.setAttribute("n", 10); %>

<%	request.setAttribute("score", 83); %>

<%
	List<String> list =new ArrayList<>();
	list.add("hello");
	list.add("world");
	list.add("!!");
	request.setAttribute("list", list);
%>

<c:import url="http://localhost:8080/webapp/jstlValue.jsp" 
var="urlValue" scope="request">
</c:import>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--if 태그 활용하기!  -->

<c:if test="${n == 0 }">
n은 0과 같습니다.
</c:if>

<c:if test="${n == 10 }">
n은 10과 같습니다.
</c:if>

<br>

<!--switch활용  
choose - when -->


<c:choose>
	<c:when test="$score >=90}">
	A학점
	</c:when>
	<c:when test="$score >=80}">
	B학점
	</c:when>
	<c:when test="$score >=70}">
	C학점
	</c:when>
	<c:when test="$score >=60}">
	D학점
	</c:when>
	<c:otherwise>
	F학점
	</c:otherwise>
</c:choose>
<br>

<!--forEach  -->

<c:forEach items="${list}" var ="item">
아이템 출력: ${item} <br>
</c:forEach>
<br>

<!--import의 활용  -->
읽어들인 값: ${urlValue}


</body>
</html>