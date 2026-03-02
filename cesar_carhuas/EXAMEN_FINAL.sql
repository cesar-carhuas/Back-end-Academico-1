create database play_store;

use play_store;

describe tp_play_store;

select * from tp_play_store;


create database notificaciones;
drop table notificacion;
use notificaciones;

select * from notificacion;

describe notificacion;

ALTER TABLE notificacion MODIFY COLUMN fecha_hora_evento DATETIME;
