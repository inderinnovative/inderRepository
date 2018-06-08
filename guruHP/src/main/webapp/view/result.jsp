<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 
 <table class="table table-hover" border="2" style="width:80%;" >
   <thead>
   <tr class="table-primary">
   <th>Medicine Name</th><th>Symptoms</th><th>Stock</th>
   </tr>
   </thead>
   
<c:forEach items="${result}" var="md">
<tr class="table-secondary"><td>${md.name}</td><td>${md.uses}</td><td>${md.stock}</td></tr>
</c:forEach>

</table>