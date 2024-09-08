package dev.johoerl.storytasks.session;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class SessionRepository {
    private final JdbcClient  jdbcClient;

    public SessionRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Session> findAll() {
        return jdbcClient.sql("select * from Session").query(Session.class).list();
    }
}
