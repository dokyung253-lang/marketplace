drop database if exists useditem;
create database useditem;
use useditem;

create table user(
    mNum int auto_increment primary key,
    mname varchar(20) not null  ,
    pw varchar(100) not null,
    phoneNum varchar(13) not null
);

create table product(
	orderNum int auto_increment primary key ,
    mNum int not null  ,
    pname varchar(20) not null ,
    price int not null,
    content varchar(200) not null ,
    orderdate datetime default now() not null  ,
    sold bool default false,
    foreign key (mNum) references user(mNum)
);

insert into user (mname, pw, phoneNum) values
('도경', '1234', '010-1111-1111'),
('연지', 'abcd', '010-2222-2222'),
('태현', 'pass1', '010-3333-3333'),
('소영', 'hello', '010-4444-4444'),
('현수교수님', 'qwer', '010-5555-5555');

insert into product (mNum, pname, price, content, sold) values
(1, '아이폰13', 700000, '깨끗하게 사용했습니다', false),
(1, '맥북에어 M1', 900000, '생활기스 약간 있음', false),
(2, '갤럭시 S22', 500000, '박스 포함 풀세트', true),
(2, '에어팟 프로', 150000, '노이즈캔슬링 정상작동', false),
(3, '닌텐도 스위치', 300000, '조이콘 포함', false),
(3, '플스5', 650000, '거의 새상품', true),
(4, '자전거', 120000, '출퇴근용으로 사용', false),
(4, '아이패드 9세대', 400000, '케이스 포함', false),
(5, '모니터 27인치', 180000, 'FHD 144hz', false),
(5, '기계식 키보드', 80000, '청축 키보드', true);

select * from user;
select * from product;
