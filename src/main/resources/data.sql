INSERT INTO Task (id, title, points) VALUES
(1, 'Task A', 9),
(2, 'Task B', 8),
(3, 'Task C', 7),
(4, 'Task D', 6),
(5, 'Task E', 5);

INSERT INTO Session (id, topic, notes, time_stamp, taskId) VALUES
(1, 'Session 1 ', 'notes', '2022-01-01T12:00:00.000', 1),
(2, 'Session 2', 'notes', '2023-06-15T08:45:30.500', 1),
(3, 'Session 1', 'notes', '2020-12-31T23:59:59.999', 2),
(4, 'Session 2', 'notes','2019-03-20T09:15:00.000', 3);