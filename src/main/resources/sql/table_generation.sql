CREATE SCHEMA FAQ_DB;
USE FAQ_DB;
CREATE TABLE `topics` (
	`topic_id` int(5) NOT NULL,
    `topic_name` varchar(20) NOT NULL,
    PRIMARY KEY (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE`faq` (
	`topic_id` int(5) NOT NULL,
    `question_id` int(3) NOT NULL,
    `question` varchar(50) NOT NULL,
    `answer` varchar(100) NOT NULL,
    PRIMARY KEY (`topic_id`,`question_id`),
    CONSTRAINT  `topic_fk`  
    FOREIGN  KEY  (`topic_id`)  
    REFERENCES  `topics` (`topic_id`) 
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;