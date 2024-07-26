<!DOCTYPE html>
<html>
<head>
    <title>Enter Bill Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 20px;
            width: 300px;
            margin: 50px auto;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #333;
        }

        input[type="text"] {
            width: calc(100% - 12px);
            padding: 6px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Enter Bill Details</h2>
    <form action="/calculateSalary" method="post">
        <label for="employeeName">Employee Name:</label>
        <input type="text" id="employeeName" name="employeeName"><br>
        
        <label for="basicSalary">Basic Salary:</label>
        <input type="text" id="basicSalary" name="basicSalary"><br>
        
        <label for="otHours">OT Hours:</label>
        <input type="text" id="otHours" name="otHours"><br>
               
        <input type="submit" value="Calculate Bill">
    </form>
</body>
</html>
