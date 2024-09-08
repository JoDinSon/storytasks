package dev.johoerl.storytasks.task;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {
    
    private final JdbcClient jdbcClient;

    public TaskRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Task> findAll() {
        return jdbcClient.sql("select * from Task").query(Task.class).list();
    }

    public Optional<Task> findById(Integer id) {
        return jdbcClient.sql("select * from Task where id = :id").param("id", id).query(Task.class).optional();
    }
}
