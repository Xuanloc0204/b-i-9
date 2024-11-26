<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="display-discount" method="POST">
  <label for="description">Product Description:</label><br>
  <input type="text" id="description" name="description" required><br><br>

  <label for="listPrice">List Price:</label><br>
  <input type="number" id="listPrice" name="listPrice" step="0.01" required><br><br>

  <label for="discountPercent">Discount Percent:</label><br>
  <input type="number" id="discountPercent" name="discountPercent" step="0.01" required><br><br>

  <button type="submit">Calculate Discount</button>
</form>
</body>
</html>