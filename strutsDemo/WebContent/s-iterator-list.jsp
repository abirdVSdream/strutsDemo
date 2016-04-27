<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="200">
<s:iterator value="{'java','php','c'}" id="name" status="st">
<tr>
	<td>
	<s:property value="#st.count"/>
		<s:property value="name"/>
	</td>
</tr>
</s:iterator>
</table>
<s:append var="newList">
<s:param value="{'疯狂java','java','php'}"/>
<s:param value="{'https://www.baidu.com','https://www.badi.com'}"/>
</s:append>
<s:append var="newList2">
<s:param value="#{'疯狂java':'cai','java':'cai','php':'cai'}"/>
<s:param value="#{'https://www.baidu.com','https://www.badi.com'}"/>
</s:append>

<table border="1" width="200">
<s:iterator value="#newList" id="ele" status="st">
<tr>
	<td>
	<s:property value="#st.count"/>
		<s:property value="ele"/>
	</td>
</tr>
</s:iterator>
</table>
<table border="1" width="200">
<s:iterator value="#newList2" id="el" status="st">
<tr>
	<td><s:property value="#st.count"/></td>
	<td><s:property value="key"/></td>
	<td><s:property value="value"/></td>
</tr>
</s:iterator>
</table>

<table border="1" width="200">
<s:generator val="'la,lala,lalala,lala'" var="say" separator=",">
<s:iterator value="#say" status="st">
<tr>
	<td>
	<s:property value="#st.count"/>
		<s:property />
	</td>
</tr>
</s:iterator>
</s:generator>
</table>

</body>
</html>