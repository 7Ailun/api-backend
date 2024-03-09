

use weiapi;

-- 接口信息表
create table if not exists `interface_info`
(
    `id` bigint not null auto_increment primary key,
    `name` varchar(256) not null comment '名称',
    `description` varchar(256) not null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestHeader` text null comment '请求头',
    `userRequestParams` text null comment '请求参数',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭，1-开启）',
    `method` varchar(256) not null comment '请求类型',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` int default 0 not null comment '是否删除（0-未删，1-已删除）'
) comment '接口信息表';

insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (5904029295, '段文博', 'iOmdt', 'www.hipolito-mitchell.io', '段思源', '高明杰', 0, '唐立果', 890494, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (32684, '王潇然', 'sls', 'www.christa-cruickshank.io', '孟烨霖', '丁鸿涛', 0, '侯凯瑞', 638367, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (37528569, '覃文博', 'LVu8', 'www.rashad-zboncak.net', '高聪健', '杨炎彬', 0, '韩楷瑞', 10792, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (698705, '方明哲', 'H2s', 'www.krista-schuppe.org', '傅文', '于耀杰', 0, '熊思源', 43183106, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (15731144, '覃驰', 'SF', 'www.elsie-sporer.info', '杜立诚', '林煜城', 0, '黎浩宇', 53881557, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (5640644, '梁伟宸', 'kU', 'www.shakira-haag.info', '徐哲瀚', '苏文博', 0, '钱思源', 776978445, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (6549, '林彬', 'muT0', 'www.wilber-emard.com', '沈弘文', '萧鑫鹏', 0, '谭子骞', 64, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (788612727, '雷靖琪', 'hGej9', 'www.marcelo-halvorson.org', '吕昊天', '许思聪', 0, '卢立轩', 447, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (4784, '唐天翊', '5G', 'www.sherryl-fritsch.io', '谢立诚', '黄煜城', 0, '叶立轩', 219, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (1375, '段煜祺', 'CiiFX', 'www.dan-adams.biz', '严熠彤', '马浩宇', 0, '钟子涵', 45, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (37614, '郑子涵', 'PO0Ba', 'www.rufus-brekke.co', '蒋昊天', '邓君浩', 0, '邵越彬', 385409, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (48904304, '钱哲瀚', 'BR', 'www.verda-lang.biz', '魏文轩', '谭建辉', 0, '黄烨华', 125, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (16461629, '黄涛', 'WQmg', 'www.charlette-willms.info', '郑绍齐', '林振家', 0, '邵苑博', 990495, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (0, '史锦程', 'Vcw', 'www.zelda-kemmer.com', '钟雨泽', '丁明辉', 0, '丁靖琪', 61, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (95789, '卢越彬', 'Rye', 'www.kassandra-quitzon.name', '白煜城', '袁语堂', 0, '卢涛', 11, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (947281453, '龚思淼', 'Sk4', 'www.lachelle-schroeder.name', '夏浩宇', '邹鹤轩', 0, '吴建辉', 681, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (959904451, '钱振家', 'k8t0A', 'www.allen-goyette.biz', '徐皓轩', '孟文轩', 0, '余黎昕', 7891341244, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (7410, '曾胤祥', 'Yya', 'www.florencio-marks.org', '尹昊焱', '张峻熙', 0, '邵弘文', 98, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (4841170, '孔烨霖', 'Gn', 'www.leon-kerluke.net', '杜果', '高建辉', 0, '杜致远', 61603, 0);
insert into weiapi.`interface_info` (`id`, name, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `isDelete`) values (612, '白聪健', 'eZuX', 'www.antonia-borer.org', '夏浩然', '钱鹏涛', 0, '朱子涵', 25852061, 0);