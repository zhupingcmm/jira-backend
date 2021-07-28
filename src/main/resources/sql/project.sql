create table `project` (
                        `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                        `name` varchar(255) NOT NULL,
                        `person_id` INT NOT NULL,
                        `organization` varchar(40) NOT NULL,
                        `created` DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;