<%--
  Created by IntelliJ IDEA.
  User: longdk
  Date: 11/29/18
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product discount calculator</title>
  </head>
  <body>
  <form method="post" action="/calculate">
    <h2>Product Discount Calculator</h2><br/>
    Product Description: <input type="text" name="description"><br/>
    List Price: <input type="text" name="price"><br/>
    Discount Percent: <input type="text" name="discount"><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
