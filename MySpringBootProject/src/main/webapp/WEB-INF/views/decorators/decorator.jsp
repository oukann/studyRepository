<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>
	gggg:<sitemesh:write property='title'> </sitemesh:write>
</title>
	<sitemesh:write property='head' ></sitemesh:write>
	<style type="text/css">
	body{
		background-color: #ffffcc;
	}
	
	</style>
</head>
<body>
	
    <hr />
    <!-- demo.html的title将被填充到这儿： -->
    aaaaaaa<sitemesh:write property='title' /><br />
   <!--  demo.html的body将被填充到这儿： -->
    bbbbbbb<sitemesh:write property='body' />
    <hr />
   <!-- <sitemesh:write property="myStyle">new</sitemesh:write> -->
</body>
</html>