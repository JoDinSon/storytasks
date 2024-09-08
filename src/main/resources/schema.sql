CREATE TABLE Task (
   id INT NOT NULL,
   title varchar(250) NOT NULL,
   points INT NOT NULL,
   PRIMARY KEY (id)
);

CREATE TABLE Session (
   id INT,
   topic varchar(255) NOT NULL,
   notes varchar(255),
   time_stamp timestamp NOT NULL,
   taskId INT,
   PRIMARY KEY (id),
   FOREIGN KEY(taskId) REFERENCES Task(id)
);