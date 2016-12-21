select * from tag;

select * from FAVORITE;
delete FAVORITE where  f_label = '4399'

insert into TAG values(seq_t_id.nextval,'java',2);
insert into TAG values(seq_t_id.nextval,'输入法',1);
insert into TAG values(seq_t_id.nextval,'购物',1);
insert into TAG values(seq_t_id.nextval,'浏览器',1);
insert into TAG values(seq_t_id.nextval,'新闻',1);
insert into TAG values(seq_t_id.nextval,'门户',1);

insert into FAVORITE values(seq_f_id.nextval,'Apache Struts','http://www.apache.org/struts/','java','Struts官方站点');
insert into FAVORITE values(seq_f_id.nextval,'搜狗输入法','http://www.sougou.com','输入法','搜狗输入法官方站点');
insert into FAVORITE values(seq_f_id.nextval,'新浪','http://www.sina.com','浏览器','著名门户网站');
insert into FAVORITE values(seq_f_id.nextval,'淘宝','http://www.taobao.com','购物','著名购物网站');
insert into FAVORITE values(seq_f_id.nextval,'Oracle','https://www.oracle.com/','java','Oracle官方站点');

select * from FAVORITE where f_tags like '%java%'

update TAG set t_count=t_count+1 where t_name='门户'

select seq_t_id.nextval currval from dual

select count(1) num from TAG