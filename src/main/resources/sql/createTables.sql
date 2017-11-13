use events; 

create table organizer
(
  ID int  not null auto_increment,NAME varchar(20)  not null, 
  CREATED timestamp default current_timestamp,  
  primary key (ID)
);


create table venue
(
  ID         int not null auto_increment,
  CREATED    timestamp default current_timestamp,
  NAME       varchar(256),
  STREET_ADDRESS    varchar(256),
  STREET_ADDRESS2   varchar(256),
  CITY              varchar(256),
  STATE             varchar(256),
  COUNTRY           varchar(256),
  POSTAL_CODE       varchar(256),
  primary key (ID)
);


create table event
(
  ID              int	not null auto_increment,
  CREATED         timestamp    default current_timestamp,
  NAME            varchar(256),
  DESCRIPTION     varchar(2048),
  START_TIME      timestamp default current_timestamp,
  END_TIME        timestamp default current_timestamp,
  ZONE_ID         blob,
  STARTED       int,
  ORGANIZER_ID    int                          not null,
  VENUE_ID        int,
  primary key (ID),
   foreign key (ORGANIZER_ID) references organizer(ID) on delete cascade,
  foreign key (VENUE_ID) references venue(ID)
);


CREATE TABLE participant (
    ID INT NOT NULL AUTO_INCREMENT,
    CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    NAME VARCHAR(256) NOT NULL,
    EMAIL VARCHAR(256) NOT NULL,
    CHECKED_IN INT,
    EVENT_ID INT NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (EVENT_ID)
        REFERENCES event (ID),
    UNIQUE (EVENT_ID , EMAIL)
);