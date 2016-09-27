<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<frameset rows="110,*" noresize="noresize" >
   <frame name="top" src="${pageContext.request.contextPath }/top.html" scrolling="No">
   <frameset cols="160,*" id="main" noresize="noresize" >
      <frame name="left" src="left.do" scrolling="No"> 
      <frame name="right" src="#" scrolling="No">
   </frameset>
</frameset>
</html>