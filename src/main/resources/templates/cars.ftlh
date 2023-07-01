<!DOCTYPE html>
<html>
<head>
    <title>CARSHARING</title>
</head>
<body>
<H1>CARSHARING</H1><hr>
<h4>Доступные машины</h4>
<form action="/" method="get">
    Поиск по транспорта по марке: <input type="text" name="brand"><br>
    <input type="submit" value="Поиск">
</form>
<#list cars as car>
    <div>
        <p><b>${car.brand} - ${car.name}</b> ${car.purchasePrice} руб. | <a href="/car/${car.id}">Подробнее...</a> </p>
    </div>
</#list>
<hr>
<h3>Добавить новую машину</h3>
<form action="/car/create" method="post">
    Название машины: <input type="text" name="name"/><br><br>
    Бренд машины: <input type="text" name="brand"/><br><br>
    Номер в реестре <input type="text" name="stateNumber"/><br><br>
    Количество мест: <input type="number" name="seat"/><br><br>
    Год выпуска: <input type="text" name="productionYear"/><br><br>
    Год покупки: <input type="date" name="purchaseDate"/><br><br>
    Цена покупки: <input type="number" name="purchasePrice"/><br><br>
    Статус: <input type="text" name="status"/><br><br>
    <input type="submit" value="Добавить машину"/>
</form>
</body>
</html>