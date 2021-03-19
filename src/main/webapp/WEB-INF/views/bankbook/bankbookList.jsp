<%@page import="com.ee.y1.bankbook.BankBookDTO"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
	List<BankBookDTO> ar = (List<BankBookDTO>)request.getAttribute("list");
%>     
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<h1>BankBook List Page</h1>
	
	<table>
			<thead>				
				<tr>
					<th>Num</th>
					<th>Name</th>
					<th>Rate</th>
					<th>Sale</th>
				</tr>				
			</thead>
			
			<tbody>
			<% for(int i=0;i<ar.size(); i++) { %>				
				<tr>
					<td><%=ar.get(i).getBookNumber() %>></td>				
					<td><%=ar.get(i).getBookName() %></td>
					<td><%=ar.get(i).getBookRate() %></td>
					<td><%=ar.get(i).getBookSale() %></td>					
				</tr>
			<%} %>
			</tbody>
						
		</table>

</body>
</html>