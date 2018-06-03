package db.migration;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseMigrationScriptsApplication {

  public static void main(@NonNull final String[] args) {

    SpringApplication.run(DatabaseMigrationScriptsApplication.class, args);

  }
}
