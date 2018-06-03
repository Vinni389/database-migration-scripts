package db.migration;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Example of a Spring Jdbc migration.
 */
public class V3__SampleJava_script implements SpringJdbcMigration {

  @Override
  public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
    jdbcTemplate.execute("INSERT INTO employee (emp_name, emp_age) VALUES ('emp3', '23');");
  }
}
