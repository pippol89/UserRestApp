Разработать WEB-приложения, реализующее REST API для работы с ресурсом «Пользователь». «Пользователь» должен содержать идентификатор и имя. Должны быть реализованы следующие методы: получение всех пользователей, поиск пользователя по идентификатору, создание нового пользователя, обновление существующего пользователя, удаление существующего пользователя. Реализовать фильтр, логгирующий в файл запросы, ответы и время обработки запроса.
Не использовать Spring Boot.
Приложение должно собираться в WAR-файл с использованием Maven.
Приложение должно запускаться на Jetty или Tomcat.
Для реализации REST API нужно использовать JAX-RS.
Не обязательно, но желательно использовать DI посредством Spring.
Хранение данных можно реализовать в оперативной памяти.
Реализовать модульные тесты.
Реализовать интеграционные тесты, проверяющие поведение запущенного приложения.
Приложение может быть реализовано на языке Kotlin.

Текущая реализация.
Варианты запуска:
1.Получение пользователей (GET):
http://localhost:8085/P19_Jersey_v2_war/api/users/

2.Получение пользователя по id (GET):
http://localhost:8085/P19_Jersey_v2_war/api/users/1

3.Добавление пользователей (POST):
http://localhost:8085/P19_Jersey_v2_war/api/users/Ирина
http://localhost:8085/P19_Jersey_v2_war/api/users/Оля
http://localhost:8085/P19_Jersey_v2_war/api/users/Галина

4.Обновление пользователя (PUT):
http://localhost:8085/P19_Jersey_v2_war/api/users/1?name=ИринаВасильевна

5.Удаление пользователя (DELETE):
http://localhost:8085/P19_Jersey_v2_war/api/users/1

!!!
1.Пока не получилось соеденить JAX-RS (использую Jersey) и Spring DI.
2.Не успел дойти до:
-Реализовать фильтр, логгирующий в файл запросы, ответы и время обработки запроса.
-Реализовать модульные тесты.
-Реализовать интеграционные тесты, проверяющие поведение запущенного приложения.
