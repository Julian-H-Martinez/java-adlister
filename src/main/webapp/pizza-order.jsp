<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="">
    <h3>Choose your Crust Type</h3>
    <label for="crustType">Crust Type</label>
    <select name="crustType" id="crustType">
        <option value="" selected disabled>Select One:</option>
        <option value="thin">Thin</option>
        <option value="pan">Pan</option>
        <option value="deep_dish">Deep Dish</option>
        <option value="flat_bread">Flat Bread</option>
    </select>
    <hr>
    <h3>Choose your Sauce Type</h3>
    <label for="sauceType">Sauce Type</label>
    <select name="sauceType" id="sauceType">
        <option value="" selected disabled>Select One:</option>
        <option value="marinara">Marinara Sauce</option>
        <option value="white">Creamy White Sauce</option>
        <option value="garlic_herb">Garlic and Herb Sauce</option>
    </select>
    <hr>
    <h3>Choose your Pizza Size</h3>
    <label for="size">Pizza Size</label>
    <select name="size" id="size">
        <option value="" selected disabled>Select One:</option>
        <option value="personal">Personal (8")</option>
        <option value="sm">Small (10")</option>
        <option value="md">Medium (14")</option>
        <option value="lg">Large (16")</option>
        <option value="xl">Extra Large (18")</option>
    </select>
    <hr>
    <h3>Choose your Toppings</h3>
    <br>
    <h5>Meats</h5>
    <input type="checkbox" name="pepperoni" id="pepperoni">
    <label for="pepperoni">Pepperoni</label>

    <input type="checkbox" name="italian_sausage" id="italian_sausage">
    <label for="italian_sausage">Italian Sausage</label>

    <input type="checkbox" name="chicken" id="chicken">
    <label for="chicken">Chicken</label>

    <input type="checkbox" name="bacon" id="bacon">
    <label for="bacon">Bacon</label>
    <br>
    <h5>Veggies</h5>
    <input type="checkbox" name="jalepenos" id="jalepenos">
    <label for="jalepenos">Jalepenos</label>

    <input type="checkbox" name="spinach" id="spinach">
    <label for="spinach">Spinach</label>

    <input type="checkbox" name="bell_pepper" id="bell_pepper">
    <label for="bell_pepper">Bell Peppers</label>

    <input type="checkbox" name="mushrooms" id="mushrooms">
    <label for="mushrooms">Mushrooms</label>

    <input type="checkbox" name="black_olives" id="black_olives">
    <label for="black_olives">Black Olives</label>
    <hr>
    <h5>Deliver To:</h5>
    <label for="street">Street:</label>
    <input type="text" name="street" id="street">
    <label for="city">City:</label>
    <input type="text" name="city" id="city">
    <label for="zip">Zip:</label>
    <input type="text" name="zip" id="zip">
</form>
</body>
</html>

<%--A user goes to /pizza-order and sees a pizza order form.
Use System.out.println to output the values submitted by the user.

use a POST request on the form
use one JSP and one servlet
don't worry about styling
--%>