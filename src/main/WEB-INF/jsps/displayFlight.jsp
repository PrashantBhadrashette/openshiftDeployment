<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login</title>
</head>
<body>
<h2>Available Flights:</h2>


<table>
<tr> 
<th> From </th>
<th> To </th>
<th> Departure Date </th>
</tr>

<c:forEach items="${findFlight}" var="flight">
<tr>
<td> ${flight.OPERATING_AIRLINES }</td>
<td> ${flight.DEPARTURE_CITY }</td>
<td> ${flight.ARRIVAL_CITY }</td>
<td> ${flight.DATE_OF_DEPARTURE }</td>
<td><a href="showCompleteReservation?FLIGHT_ID=${flight.ID}">Select</a></td>
</tr>
</c:forEach>
</table>

</form>
</body>
</html>