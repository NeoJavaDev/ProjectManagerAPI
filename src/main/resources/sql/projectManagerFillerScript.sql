INSERT INTO user(surname,name,username,password,email,nationality) 
VALUES
("admin1","admin1","admin1","admin1","admin1@admin.fr","admin1"),
("admin2","admin2","admin2","admin2","admin2@admin.fr","admin2");

INSERT INTO project(name,start_date,end_date,logo_url,user_id_fk)
VALUES
("project1","2022/12/01", "2022/12/01", "http://localhost:81/images/project1",1),
("project2","2022/01/01", "2022/01/31", "http://localhost:81/images/project2",1),
("project3","2022/02/01", "2022/02/28", "http://localhost:81/images/project3",1),
("project4","2022/03/01", "2022/03/31", "http://localhost:81/images/project4",2),
("project5","2022/04/01", "2022/04/30", "http://localhost:81/images/project5",2),
("project6","2022/05/01", "2022/05/31", "http://localhost:81/images/project6",2);

INSERT INTO task(name,management,developer,software,hardware,premises,furniture,sourcing,distribution,revenue,logo_url,project_id_fk)
VALUES
("task1",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task1",1),
("task2",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task2",1),
("task3",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task3",1),
("task4",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task4",1),

("task5",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task5",2),
("task6",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task6",2),
("task7",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task7",2),
("task8",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task8",2),

("task9",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task9",3),
("task10",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task10",3),
("task11",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task11",3),
("task12",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task12",3),

("task13",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task13",4),
("task14",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task14",4),
("task15",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task15",4),
("task16",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task16",4),

("task17",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task17",5),
("task18",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task18",5),
("task19",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task19",5),
("task20",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task20",5),

("task21",15000,58000,5000,7000,6000,700,500,400,8000,"http://localhost:81/images/task21",6),
("task22",12000,20000,9000,9000,7000,700,900,700,9000,"http://localhost:81/images/task22",6),
("task23",9000,24000,4000,6000,1000,600,700,600,2500,"http://localhost:81/images/task23",6),
("task24",30000,15000,7000,2000,8000,500,200,300,7000,"http://localhost:81/images/task24",6);


