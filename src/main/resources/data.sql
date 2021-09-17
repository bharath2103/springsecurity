
INSERT into users(username,password,email,enabled) values ('siva','{noop}secret','siva@gmail.com',true);
INSERT into users(username,password,email,enabled) values ('vinod','{noop}secret','user@gmail.com',true);
INSERT into users(username,password,email,enabled) values ('bharath','{noop}secret','admin@gmail.com',true);
INSERT into authorities values ('vinod','ADMIN');
INSERT into authorities values ('bharath','USER');
INSERT into authorities values ('siva','USER');

