<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%
MultipartRequest m = new MultipartRequest(request, "C:\\temp\\");
out.print("successfully uploaded");

%>
