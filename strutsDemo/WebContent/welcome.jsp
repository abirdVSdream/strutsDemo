<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="succPage"/></title>
</head>
<body>
	<!--<s:text name="succTip">
	本站访问次数为：${applicationScope.counter}<br/>
	<s:param>${sessionScope.user}</s:param>
	${requestScope.tip}<br/>
	</s:text><br/>-->
	本站访问次数为：${applicationScope.counter}<br/>
	${sessionScope.user}<br/>
	${requestScope.tip}<br/>
	${cookie.user.value}<br/>
</body>
</html>