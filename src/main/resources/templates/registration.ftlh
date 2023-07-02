<!DOCTYPE html>
<html>
<head>
    <title>CARSHARING</title>
</head>
<body>
<H1>CARSHARING</H1><hr>
<h4>Регистрация</h4>
<form action="/registration" method="post">
    Имя: <input type="text" name="name"><br><br>
    Фамилия: <input type="text" name="surname"><br><br>
    Отчество: <input type="text" name="lastName"><br><br>
    Номер телефона: <input type="text" name="phoneNimber"><br><br>
    Эл. почта: <input type="email" name="email"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Зарегистрироваться"/>
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
</body>
</html>