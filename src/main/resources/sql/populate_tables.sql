create database rolesandpermissions;

insert into user values ("1", "admin", "admin");

insert into role values ("1", "Super Admin");
insert into role values ("2", "Admin");	

insert into user_role values ("1", "1");
insert into user_role values ("1", "2");

insert into permission (ID, PERMISSION_NAME) values ("1", "CREATE_USER");
insert into permission (ID, PERMISSION_NAME) values ("2", "CREATE_RESOURCE");
insert into permission (ID, PERMISSION_NAME) values ("3", "CREATE_ROLE");
insert into permission (ID, PERMISSION_NAME) values ("4", "ASSIGN_ROLE");

insert into role_permission values ("1", "1");
insert into role_permission values ("1", "2");
insert into role_permission values ("1", "3");
insert into role_permission values ("1", "4");
insert into role_permission values ("2", "2");