drop database if exists useditem;
create database useditem;
use useditem;

create table user(
    mno int auto_increment primary key,
    mname varchar(20) not null  ,
    pw varchar(100) not null,
    phoneNum varchar(13) not null
);

drop table if exists product;

CREATE TABLE product(
    orderNum INT AUTO_INCREMENT PRIMARY KEY,
    mno INT DEFAULT 1,                      
    mname VARCHAR(20) NOT NULL,            
    pname VARCHAR(20) NOT NULL,          
    price INT NOT NULL,                      
    content VARCHAR(200) NOT NULL,          
    pw VARCHAR(100) NOT NULL,            
    phoneNum VARCHAR(13) NOT NULL,          
    orderdate DATETIME DEFAULT NOW() NOT NULL,
    sold BOOL DEFAULT FALSE,
    FOREIGN KEY (mno) REFERENCES user(mno)
);


SELECT p.orderNum, p.mno, p.pname, p.price, p.orderdate, p.sold, p.content, u.mname, u.phoneNum
FROM product p
INNER JOIN user u ON p.mno = u.mno
ORDER BY p.orderdate DESC;

insert into user (mno, mname, pw, phoneNum) values
(1, '도경', '1234', '010-1111-1111'),
(2, '연지', 'abcd', '010-2222-2222'),
(3, '태현', 'pass1', '010-3333-3333'),
(4, '소영', 'hello', '010-4444-4444'),
(5, '현수교수님', 'qwer', '010-5555-5555');

-- product 테이블에 샘플 데이터 넣기 (mname과 pw 추가 버전)
insert into product (mno, mname, pname, price, content, pw, sold, phoneNum) values
(1, '도경', '아이폰13', 700000, '깨끗하게 사용했습니다', '1234', false, '010-1111-1111'),
(1, '도경', '맥북에어 M1', 900000, '생활기스 약간 있음', '1234', false, '010-1111-1111'),
(2, '연지', '갤럭시 S22', 500000, '박스 포함 풀세트', 'abcd', true, '010-2222-2222'),
(2, '연지', '에어팟 프로', 150000, '노이즈캔슬링 정상작동', 'abcd', false, '010-2222-2222'),
(3, '태현', '닌텐도 스위치', 300000, '조이콘 포함', 'pass1', false, '010-3333-3333'),
(3, '태현', '플스5', 650000, '거의 새상품', 'pass1', true, '010-3333-3333'),
(4, '소영', '자전거', 120000, '출퇴근용으로 사용', 'hello', false, '010-4444-4444'),
(4, '소영', '아이패드 9세대', 400000, '케이스 포함', 'hello', false, '010-4444-4444'),
(5, '현수교수님', '모니터 27인치', 180000, 'FHD 144hz', 'qwer', false, '010-5555-5555'),
(5, '현수교수님', '기계식 키보드', 80000, '청축 키보드', 'qwer', true, '010-5555-5555');

select * from user;
select * from product;

