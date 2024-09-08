package dev.johoerl.storytasks.session;

import java.time.LocalDateTime;

public record Session(
    Integer id,
    String topic,
    String notes,
    LocalDateTime time_stamp,
    Integer taskId
) {

}
