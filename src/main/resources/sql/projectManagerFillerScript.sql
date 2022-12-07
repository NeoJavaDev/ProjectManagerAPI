INSERT INTO user(surname,name,username,password,email,nationality) 
VALUES
("admin1","admin1","admin1","admin1","admin1@admin.fr","admin1"),
("admin2","admin2","admin2","admin2","admin2@admin.fr","admin2");

INSERT INTO project(name,start_date,end_date,logo,user_id_fk)
VALUES
("project1","2022/12/01","2022/12/31","http://localhost:81/images/project1",1),
("project2","2022/01/01","2022/01/31","http://localhost:81/images/project2",1),
("project3","2022/02/01","2022/02/28","http://localhost:81/images/project3",1),
("project4","2022/03/01","2022/03/31","http://localhost:81/images/project4",2),
("project5","2022/04/01","2022/04/30","http://localhost:81/images/project5",2),
("project6","2022/05/01","2022/05/31","http://localhost:81/images/project6",2);

INSERT INTO task(name,logo,management,developer,software,hardware,premises,furniture,sourcing,distribution,revenue,project_id_fk)
VALUES
("task1","http://localhost:81/images/task1",15000,58000,5000,7000,6000,700,500,400,8000,1),
("task2","http://localhost:81/images/task2",12000,20000,9000,9000,7000,700,900,700,9000,1),
("task3","http://localhost:81/images/task3",9000,24000,4000,6000,1000,600,700,600,2500,1),
("task4","http://localhost:81/images/task4",30000,15000,7000,2000,8000,500,200,300,7000,1),

("task5","http://localhost:81/images/task5",15000,58000,5000,7000,6000,700,500,400,8000,2),
("task6","http://localhost:81/images/task6",12000,20000,9000,9000,7000,700,900,700,9000,2),
("task7","http://localhost:81/images/task7",9000,24000,4000,6000,1000,600,700,600,2500,2),
("task8","http://localhost:81/images/task8",30000,15000,7000,2000,8000,500,200,300,7000,2),

("task9","http://localhost:81/images/task9",15000,58000,5000,7000,6000,700,500,400,8000,3),
("task10","http://localhost:81/images/task10",12000,20000,9000,9000,7000,700,900,700,9000,3),
("task11","http://localhost:81/images/task11",9000,24000,4000,6000,1000,600,700,600,2500,3),
("task12","http://localhost:81/images/task12",30000,15000,7000,2000,8000,500,200,300,7000,3),

("task13","http://localhost:81/images/task13",15000,58000,5000,7000,6000,700,500,400,8000,4),
("task14","http://localhost:81/images/task14",12000,20000,9000,9000,7000,700,900,700,9000,4),
("task15","http://localhost:81/images/task15",9000,24000,4000,6000,1000,600,700,600,2500,4),
("task16","http://localhost:81/images/task16",30000,15000,7000,2000,8000,500,200,300,7000,4),

("task17","http://localhost:81/images/task17",15000,58000,5000,7000,6000,700,500,400,8000,5),
("task18","http://localhost:81/images/task18",12000,20000,9000,9000,7000,700,900,700,9000,5),
("task19","http://localhost:81/images/task19",9000,24000,4000,6000,1000,600,700,600,2500,5),
("task20","http://localhost:81/images/task20",30000,15000,7000,2000,8000,500,200,300,7000,5),

("task21","http://localhost:81/images/task21",15000,58000,5000,7000,6000,700,500,400,8000,6),
("task22","http://localhost:81/images/task22",12000,20000,9000,9000,7000,700,900,700,9000,6),
("task23","http://localhost:81/images/task23",9000,24000,4000,6000,1000,600,700,600,2500,6),
("task24","http://localhost:81/images/task24",30000,15000,7000,2000,8000,500,200,300,7000,6);


