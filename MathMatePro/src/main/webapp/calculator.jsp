<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >

body {
    font-family: Arial, sans-serif;
    text-align: center;
    margin: 50px;
}

h2 {
    color: #333;
}

form {
    margin-top: 20px;
}

input, select, button {
    padding: 10px;
    margin: 5px;
    font-size: 16px;
}

</style>
</head>
<body>
    <h2>MathMatePro Calculator</h2>
    <form action="/MathMatePro/CalculatorServlet" method="post">

        <input type="number" name="num1" placeholder="Enter number 1" required>
        <input type="number" name="num2" placeholder="Enter number 2" required>

        <select name="operation" required>
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
            <option value="modulus">Modulus</option>
            <option value="square">Square</option>
            <option value="sqrt">Square Root</option>
        </select>

        <button type="submit">Calculate</button>
    </form>
</body>
</html>