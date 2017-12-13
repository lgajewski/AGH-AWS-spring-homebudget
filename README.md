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

## How to develop?

Make changes anywhere you want, and when you decide like to commit them all..
```
./scripts/git_commit_all.sh -am \"Excellent commit\"
./scripts/git_push_all.sh
```

Above commands executes on every submodule and add all files into git index, commit them with a certain message and then push it into server consecutively.