-- INSERT INTO member
-- (id, addr, addr_details, email, gender, login_id, name, password, phone_num, recieving_mail, recieving_sms, point, regdate, zip_code)
-- VALUES (1, 'addr', 'addr_details', 'email', 'gender', 'login_id', 'name', 'password', 1234, true, true ,0, now(), 'zip_code')

INSERT INTO product(cutting, deleted,hit, nutrition, price, product_name, quantity, regdate, total_sales, update_date,point_rate )
VALUES (false , false, 0, 'nutrition', 10000, '롱패딩', 0, now(), 0, now(),10 );

INSERT INTO product(cutting, deleted, hit, nutrition, price, product_name, quantity, regdate, total_sales, update_date,point_rate )
VALUES (false , false, 0, 'nutrition2', 20000, '노스패딩', 0, now(), 0, now(),20 );

INSERT INTO product(cutting, deleted, hit, nutrition, price, product_name, quantity, regdate, total_sales, update_date,point_rate )
VALUES (false , false, 0, 'nutrition3', 20000, '네파', 0, now(), 0, now(),20 );

INSERT INTO product_option(extra_price, name, product_id)
VALUES (1000, '레드1', 1);
INSERT INTO product_option(extra_price, name, product_id)
VALUES (2222, '레드2', 1);
INSERT INTO product_option(extra_price, name, product_id)
VALUES (3333, '레드3', 1);

INSERT INTO product_option(extra_price, name, product_id)
VALUES (200, '블루', 1);

INSERT INTO product_option(extra_price, name, product_id)
VALUES (5000, '옐로우', 1);
INSERT INTO product_option(extra_price, name, product_id)
VALUES (5000, '그린', 1);
INSERT INTO product_option(extra_price, name, product_id)
VALUES (-5000, '블랙', 1);
INSERT INTO product_option(extra_price, name, product_id)
VALUES (12000, '분홍', 1);



INSERT INTO product_option(extra_price, name, product_id)
VALUES (-1000, '레드', 2);

INSERT INTO product_option(extra_price, name, product_id)
VALUES (4500, '블루', 2);

INSERT INTO product_option(extra_price, name, product_id)
VALUES (9000, '옐로우', 2);


--     create table product (
--        id bigint not null auto_increment,
--         cutting bit not null,
--         deleted bit,
--         hit integer,
--         nutrition varchar(255) not null,
--         point_rate integer not null,
--         price integer not null,
--         product_name varchar(255) not null,
--         quantity integer not null,
--         regdate datetime,
--         total_sales integer,
--         update_date datetime,
--         category_id bigint,
--         primary key (id)
--     ) engine=InnoDB
--
--
--
--     create table product_option (
--        id bigint not null auto_increment,
--         extra_price integer not null,
--         name varchar(255) not null,
--         product_id bigint,
--         primary key (id)
--     ) engine=InnoDB