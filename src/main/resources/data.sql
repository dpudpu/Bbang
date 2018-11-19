-- 상품관련 샘플 데이터

INSERT INTO category(name, parent_id, ordering)
VALUES ('빵',1,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('샌드위치',2,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('케이크',3,3);
INSERT INTO category(name, parent_id, ordering)
VALUES ('디저트',4,4);
INSERT INTO category(name, parent_id, ordering)
VALUES ('호밀빵',1,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('밀빵',1,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('간식용',1,3);
INSERT INTO category(name, parent_id, ordering)
VALUES ('일반',2,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('다이어트용',2,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('쿠키',4,1);
INSERT INTO category(name, parent_id, ordering)
VALUES ('전통과자',4,2);
INSERT INTO category(name, parent_id, ordering)
VALUES ('떡',4,3);


INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 2000, '우유식빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 3000, '크로아상', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 1000, '단팥빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 3000, '통호밀빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 1000, '슈크림빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 2000, '랜덤빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '죽빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '먹물크림빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '토요빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '크림빵', 100, 5, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '야채고로케', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '치킨고로케', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '소고기고로케', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '추억의고로케', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '모카번', 100, 6, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '화이트번', 100, 6, 0, 2);

INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '참치샌드위치', 100, 2, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '소고기샌드위치', 100, 2, 0, 2);

INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '약과', 100, 11, 0, 2);
INSERT INTO product(nutrition, price, product_name, quantity, category_id, cutting, point_rate)
VALUES ('nutrition3', 100, '뻥튀기', 100, 11, 0, 2);


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


-- 회원관련 샘플데이터
INSERT INTO member(email, nickname, name, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('dpudpu@naver.com','배대준','배대준', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, nickname, name, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('hong@naver.com','홍길동','정시윤', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('yoon@naver.com','정시윤','정시윤', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('chul@naver.com','신윤철','신윤철', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('sun@naver.com','주미선','주미선', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('min@naver.com','김규민','김규민', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('hyung@naver.com','김준형','김준형', 1,'1234','1234',true ,true ,'부천시','도당동','123');
INSERT INTO member(email, name, nickname, gender, password, phone_num, recieve_mail, recieve_sms,addr, addr_details, zip_code )
VALUES ('jang@naver.com','장태희','장태희', 1,'1234','1234',true ,true ,'부천시','도당동','123');


