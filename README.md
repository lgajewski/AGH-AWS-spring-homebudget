# spring-homebudget

## Prepare your repository

```
git clone https://github.com/lgajewski/spring-homebudget.git
git submodule update --init
```

## How to run?

```
docker run --name homebudget-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql
```

With MySQL server running, import open project in IntelliJ, import every Maven module and run all microservices one after another.