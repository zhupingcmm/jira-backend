create table `user` (
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    `name` varchar(255) NOT NULL,
    `token` varchar(255) NOT NULL,
    `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;