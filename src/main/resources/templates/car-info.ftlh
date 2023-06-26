<!DOCTYPE html>
<html>
<head>
    <title>CARSHARING</title>
</head>
<body>
<H1>CARSHARING</H1><hr>
<h4>Подробная информация о машине</h4>
<b>Название машины: </b>${car.name}<br>
<b>Бренд машины: </b>${car.brand}<br>
<b>Количество мест: </b>${car.seat}<br>
<b>Год выпуска: </b>${car.productionYear}<br>
<b>Год покупки: </b>${car.purchaseDate}<br>
<b>Цена покупки: </b>${car.purchasePrice}<br>
<hr>

<form action="/car/delete/${car.id}" method="post">
    <input type="submit" value="Удалить машину"/>
</form>
</body>
</html>