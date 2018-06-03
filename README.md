# database-migration-scripts
Holds migration scripts which are executed by jar (from project flyway-database-migration)


1) Build the project [flyway-database-migration](https://github.com/Vinni389/flyway-database-migration)
2) Execute the generated jar
* **java -Ddb.connection.url="jdbc:mariadb://localhost:3306/" -Ddb.connection.userName="root" -Ddb.connection.password="yourPassword" -jar ./flyway-database-migration-1.0.jar --migrationScriptsLocation="filesystem:W:/path/database-migration-scripts/" > RunLog.log**
