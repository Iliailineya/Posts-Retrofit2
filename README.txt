
REST-приложение для чтения
ресурса с сервера.

Retrofit2
------------
https://square.github.io/retrofit/
Типобезопасный REST-клиент для Android и Java.
Retrofit превращает ваш HTTP API в интерфейс Java.

OkHttp
--------
https://square.github.io/okhttp/
Эффективный HTTP и HTTP/2 клиент для приложений
Android и Java.

Gson
------
https://github.com/google/gson
Библиотека сериализации/десериализации Java для
преобразования объектов Java в JSON и обратно.

REQRES
-----------------
https://reqres.in/
Бесплатный поддельный API для тестирования и
прототипирования.


1) Создаем Maven-проект.

2) В pom.xml добавляем зависимости

Retrofit
https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit
https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit/2.9.0

Конвертер Retrofit, который использует Gson для сериализации
https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson
https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson/2.9.0

OkHttp
https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp/4.10.0


3) Создаем необходимые пакеты, классы в app/.

4) Проверим работу приложения

GET https://reqres.in/api/users
GET https://reqres.in/api/users/4

5) Можем посмотреть зависимости
View > Tool Windows > Maven
