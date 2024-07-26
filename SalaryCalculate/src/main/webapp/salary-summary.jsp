<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary Summary</title>
</head>
<body>
    <h2>Employee Salary Summary</h2>
    <table border="1">
        <tr>
            <th>Employee Name</th>
            <th>Gross Salary</th>
            <th>Tax Amount</th>
            <th>Net Salary</th>
        </tr>
        <tr>
            <td>${employeeName}</td>
            <td>${grossSalary}</td>
            <td>${taxAmount}</td>
            <td>${netSalary}</td>
        </tr>
    </table>
</body>
</html>