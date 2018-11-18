
INSERT INTO category(name, parent_id, ordering)
VALUES ('통밀빵',0,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('호밀빵',0,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('비스킷',0,3);
INSERT INTO category(name, parent_id, ordering)
VALUES ('100%',1,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('60%%',1,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('30%',1,3);
INSERT INTO category(name, parent_id, ordering)
VALUES ('100%',2,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('60%%',2,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('30%',2,3);


INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 2000, '우유식빵', 100, 4, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 3000, '크로아상', 100, 4, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 1000, '단팥빵', 100, 4, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 3000, '호밀빵', 100, 4, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 1000, '슈크림빵', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 2000, '랜덤빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '죽빵', 100, 5, 0, 2);

INSERT INTO product_option(price, name, product_id, quantity)
VALUES (5000, '파스퇴르', 1,100);
INSERT INTO product_option(price, name, product_id, quantity)
VALUES (4000, '서울우유', 1,100);
INSERT INTO product_option(price, name, product_id, quantity)
VALUES (2000, '중국산우유', 1,100);

INSERT INTO product_option(price, name, product_id, quantity)
VALUES (5000, '파스퇴르', 2,100);
INSERT INTO product_option(price, name, product_id, quantity)
VALUES (4000, '서울우유', 2,100);
INSERT INTO product_option(price, name, product_id, quantity)
VALUES (2000, '중국산우유', 2,100);

