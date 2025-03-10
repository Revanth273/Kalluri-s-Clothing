<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kalluri's Clothing</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .promo-banner {
            background-color: blue;
            color: white;
            text-align: center;
            padding: 10px;
            font-size: 18px;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
        }
        .container {
            padding: 80px 20px;
            text-align: center;
        }
        .shop-button {
            background-color: blue;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            font-size: 20px;
            border-radius: 5px;
            display: inline-block;
            margin-top: 20px;
            cursor: pointer;
        }
        .product-gallery {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 20px;
            padding: 20px;
        }
        .product {
            width: 250px;
            text-align: center;
        }
        .product img {
            width: 100%;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <div class="promo-banner" id="promo-banner">
        Limited Offer! Get 10% OFF on all products – Use Code: <strong>BUY100</strong> (Only for the first 100 buyers!)
        <button onclick="hideBanner()" style="margin-left: 10px; background: red; color: white; border: none; padding: 5px 10px; cursor: pointer;">X</button>
    </div>
    
    <div class="container">
        <h1>Welcome to Kalluri's Clothing</h1>
        <p>Shop the latest fashion trends at the best prices.</p>
        <button class="shop-button" onclick="showAlert()">Shop Now</button>
    </div>

    <div class="product-gallery" id="shop">
        <div class="product">
            <img src="https://via.placeholder.com/250" alt="Clothing Item 1">
            <p>Trendy Jacket - $49.99</p>
        </div>
        <div class="product">
            <img src="https://via.placeholder.com/250" alt="Clothing Item 2">
            <p>Casual T-Shirt - $19.99</p>
        </div>
        <div class="product">
            <img src="https://via.placeholder.com/250" alt="Clothing Item 3">
            <p>Stylish Jeans - $39.99</p>
        </div>
        <div class="product">
            <img src="https://via.placeholder.com/250" alt="Clothing Item 4">
            <p>Elegant Dress - $59.99</p>
        </div>
    </div>

    <script>
        function showAlert() {
            alert("Welcome to Kalluri's Clothing! Enjoy 10% OFF with code BUY100.");
        }
        
        function hideBanner() {
            document.getElementById("promo-banner").style.display = "none";
        }
    </script>
</body>
</html>
