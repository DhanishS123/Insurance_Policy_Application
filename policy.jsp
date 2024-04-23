<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dashboard" method="get">
<label for="policyId">Policy Id</label>
<input type="number" id="policyId" name="policyId">

 <label for="policyName">Select Policy:</label>
    <select id="policyName" name="policyName">
        <option value="lic">lic</option>
        <option value="car insurance">car insurance</option>
        <option value="Policy insurance">Policy insurance</option>
        
    </select>

<label for="insuranceTenure">Insurance Tenure in Yrs.:</label>
  <input type="number" id="insuranceTenure" name="insuranceTenure"  required>
  <br><br>

  <label for="premiumAmount">Premium Amount:</label>
  <input type="number" id="premiumAmount" name="premiumAmount" required>
  <br><br>

  <label for="sumInsured">Sum Insured:</label>
  <input type="number" id="sumInsured" name="sumInsured"  required>
  <br><br>
<button type="submit">submit</button>
</form>
</body>
</html>