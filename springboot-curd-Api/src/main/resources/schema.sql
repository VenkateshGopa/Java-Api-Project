create table contacts (
name varchar(255),
country_code integer not null, 
mobile_number bigint not null,
country_name varchar(255), 
emailid varchar(255), 
primary key (mobile_number));