
set names utf8;
set foreign_key_checks = 0;

drop database if exists miamiburger;

create database if not exists miamiburger;
use miamiburger;


drop table if exists user_info;

create table user_info(
id int not null primary key auto_increment,
user_id varchar(16) unique not null,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0 not null,
email varchar(32) not null,
secret_question varchar(2) not null,
secret_answer varchar(32) not null,
status tinyint default 0 not null,
logined tinyint default 0 not null,
regist_date datetime not null,
update_date datetime
);



drop table if exists product_info;

create table product_info(
id int not null primary key auto_increment,
product_id int unique not null,
product_name varchar(100) unique not null,
product_name_kana varchar(100) unique not null,
product_description varchar(255) not null,
category_id int not null,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime not null,
status tinyint default 0 not null,
regist_date datetime not null,
update_date datetime,
foreign key(category_id) references m_category(category_id)

);

drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16),
temp_user_id varchar(128) not null,
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);


drop table if exists purchase_history_info;

create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);



drop table if exists destination_info;

create table destination_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32) not null,
tel_number varchar(13) not null,
user_address varchar(50) not null,
regist_date datetime not null,
update_date datetime
);



drop table if exists m_category;

create table m_category(
id int not null primary key auto_increment,
category_id int unique not null,
category_name varchar(20) unique not null,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);

drop table if exists create_burger;

create table create_burger (
	id int not null primary key auto_increment,
	createUser_id varchar(16),
	price int,
	option1 int,
	option2 int,
	option3 int,
	option4 int,
	option5 int,
	option6 int,
	option7 int,
	option8 int,
	option9 int,
	option10 int,
	regist_date datetime
);

drop table if exists burger_options;

create table burger_options (
	id int not null primary key auto_increment,
	optionName varchar(50),
	optionPrice int,
	imgUrl varchar(255),
	comment varchar(1000)
);

INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(0,"全検索","全検索","2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(1,"バーガー","バーガー単品","2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(2,"飲み物","飲み物単品","2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(3,"サイドメニュー","サイドメニュー単品","2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(4,"セット","セット","2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO m_category(category_id, category_name, category_description, insert_date, update_date) VALUES(5,"クリエイトバーガー","欠番","2018-05-01 00:00:00","2018-05-01 00:00:00");

INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(1,"マイアミバーガー","まいあみばーがー","マイアミに来たら迷わずこれを食うべし、名物マイアミバーガー",1,790,"./images/miamiburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(2,"チーズバーガー","ちーずばーがー","芳醇なチーズと肉汁溢れるパティのハーモニー♪",1,690,"./images/cheeseburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(3,"フィッシュバーガー","ふぃっしゅばーがー","ホクホクの白身はバンズによく合う！",1,690,"./images/fishburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(4,"ステーキバーガー","すてーきばーがー","スタミナ満点！",1,990,"./images/steakburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(5,"テリヤキバーガー","てりやきばーがー","甘辛い照り焼きソースに中毒者続出！",1,690,"./images/teriyakiburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(6,"チキンバーガー","ちきんばーがー","チキンの味わい",1,690,"./images/chickenburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(7,"スパムバーガー","すぱむばーがー","根強い人気に支えられた隠れ名物バーガー",1,790,"./images/spamburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(8,"クラシックバーガー","くらしっくばーがー","組み合わせはまさに黄金比",1,890,"./images/classic.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(9,"ベーコンレタスバーガー","べーこんれたすばーがー","スモーキーなベーコンとシャキシャキレタスのハンバーガー",1,690,"./images/beconlettuce.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(10,"油淋鶏バーガー","ゆーりんちーばーがー","みんな大好き油淋鶏がハンバーガーになりました。",1,890,"./images/youlinjiburger.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(11,"オニオンリング","おにおんりんぐ","バーガーのお供に",3,380,"./images/onionring.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(12,"エッグスープ","えっぐすーぷ","栄養満点のスープ",3,280,"./images/eggsoup.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(13,"季節のサラダ","きせつのさらだ","旬の野菜で作りました",3,380,"./images/seasonsalad.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(14,"皮付きフライドポテト","かわつきふらいどぽてと","マイアミ産のポテトを使用",3,280,"./images/frenchfries.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(15,"チキンナゲット","ちきんなげっと","みんなで食べようチキンナゲット",3,280,"./images/nagget.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(16,"マイアミコーラ","まいあみこーら","乾いた喉にマイアミコーラ！",2,150,"./images/miamicoke.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(17,"メロンソーダ","めろんそーだ","メロンソーダってホント美味しいよね",2,150,"./images/melonsoda.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(18,"カフェラテ","かふぇらて","ホッとする味",2,150,"./images/cafe.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(19,"自家製レモネード","じかせいれもねーど","丁寧に仕上げました",2,180,"./images/lemon.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(20,"ビール","びーる","飲み会の定番",2,250,"./images/beer.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(21,"BBQセット","ばーべきゅーせっと","BBQ気分を味わえる！",4,1350,"./images/bbqset.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(22,"チキン三昧セット","ちきんざんまいせっと","今日はチキンな気分のあなたに",4,1150,"./images/chickenset.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(23,"オーガニックセット","おーがにっくせっと","オーガニックを意識したセットです",4,1350,"./images/organicset.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(24,"スタンダードマイアミセット","すたんだーどまいあみせっと","定番中の定番",4,1150,"./images/standardmiamiburgerset.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");
INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, price,image_file_path  ,release_date ,status ,regist_date) VALUES(25,"中華風セット","ちゅうかふうせっと","新感覚のセットです",4,1150,"./images/chineseset.jpg","2018-05-01 00:00:00",1,"2018-05-01 00:00:00");

INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("バンズ上",30,"./images/buns_top.png","普通のバンズ。パサパサしている。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("バンズ下",30,"./images/buns_bottom.png","普通のバンズ。パサパサしている。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("バンズ中",30,"./images/buns_middle.png","普通のバンズ。パサパサしている。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("パティ",100,"./images/paty.png","牛肉100％のパティ。肉汁が出てこない。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("ベーコン",80,"./images/Bacon.png","焼いたベーコン。カリッカリ。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("ピクルス",20,"./images/pickle.png","ピクルス。好き嫌いが分かれる");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("チーズ",90,"./images/cheese.png","チェダーチーズ。固まっている。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("トマト",100,"./images/tomato.png","トマト。みずみずしい。");
INSERT INTO burger_options (optionName,optionPrice,imgUrl,comment) VALUES ("レタス",120,"./images/lettuce.png","レタス。みずみずしい。");

INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("admin","admin","管理者","ユーザー","かんりしゃ","ゆーざー",0,"kanrisya@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest","guest","一般","ユーザー","いっぱん","ゆーざー",0,"user@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest1","guest1","山田","太郎","やまだ","たろう",0,"user1@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest2","guest2","山田","次郎","やまだ","じろう",0,"user2@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest3","guest3","山田","花子","やまだ","はなこ",0,"user3@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest4","guest4","鈴木","太郎","すずき","たろう",0,"user4@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest5","guest5","鈴木","次郎","すずき","じろう",0,"user5@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest6","guest6","鈴木","花子","すずき","はなこ",0,"user6@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest7","guest7","佐藤","太郎","さとう","たろう",0,"user7@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest8","guest8","佐藤","次郎","さとう","じろう",0,"user8@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest9","guest9","佐藤","花子","さとう","はなこ",0,"user9@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, secret_question, secret_answer, status, logined, regist_date, update_date) VALUES("guest10","guest10","佐藤","三郎","さとう","さぶろう",0,"user10@yahoo.com","1","いちご",0,0,"2018-05-01 00:00:00","2018-05-01 00:00:00");
