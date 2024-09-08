package dev.johoerl.storytasks.session;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    private final SessionRepository sessionRepository;

    SessionController(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @GetMapping("/Sessions")
    List<Session> findAll() {
        return sessionRepository.findAll();
    }
}
