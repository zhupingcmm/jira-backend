create table `project` (
                        `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                        `name` varchar(255) NOT NULL,
                        `personId` varchar(40) NOT NULL,
                        `organization` varchar(40) NOT NULL,
                        `create` DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;