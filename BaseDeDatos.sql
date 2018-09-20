/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     20/09/2018 11:59:39                          */
/*==============================================================*/


drop index todo1.CATEGORIA_PK;

drop table todo1.CATEGORIA;

drop index todo1.DETTRAN_TRAN_FK;

drop index todo1.PRO_DET_VEN_FK;

drop index todo1.DETALLE_TRANSACCION_PK;

drop table todo1.DETALLE_TRANSACCION;

drop index todo1.DETTRA_MOV_FK;

drop index todo1.PRO_MOV_FK;

drop index todo1.MOVIMIENTO_PK;

drop table todo1.MOVIMIENTO;

drop index todo1.TRAN_OPER_FK;

drop index todo1.OPERACION_PK;

drop table todo1.OPERACION;

drop index todo1.CAT_PRO_FK;

drop index todo1.PRODUCTO_PK;

drop table todo1.PRODUCTO;

drop index todo1.TIPO_USUARIO_PK;

drop table todo1.TIPO_USUARIO;

drop index todo1.CLI_VEN_FK;

drop index todo1.TRANS_VEND_FK;

drop index todo1.TRANSACCION_PK;

drop table todo1.TRANSACCION;

drop index todo1.USUARIO_PK;

drop table todo1.USUARIO;

drop index todo1.USU_TIP_USU_FK;

drop index todo1.TIP_USU_USU_FK;

drop index todo1.USUARIO_TIPO_USUARIO_PK;

drop table todo1.USUARIO_TIPO_USUARIO;

drop index todo1.VENDEDOR_PK;

drop table todo1.VENDEDOR;

drop sequence todo1.S_CATEGORIA;

drop sequence todo1.S_DETALLE_TRANSACCION;

drop sequence todo1.S_MOVIMIENTO;

drop sequence todo1.S_OPERACION;

drop sequence todo1.S_PRODUCTO;

drop sequence todo1.S_TIPO_USUARIO;

drop sequence todo1.S_TRANSACCION;

drop sequence todo1.S_USUARIO;

drop sequence todo1.S_USUARIO_TIPO_USUARIO;

drop sequence todo1.S_VENDEDOR;

create sequence todo1.S_CATEGORIA;

create sequence todo1.S_DETALLE_TRANSACCION;

create sequence todo1.S_MOVIMIENTO;

create sequence todo1.S_OPERACION;

create sequence todo1.S_PRODUCTO;

create sequence todo1.S_TIPO_USUARIO;

create sequence todo1.S_TRANSACCION;

create sequence todo1.S_USUARIO;

create sequence todo1.S_USUARIO_TIPO_USUARIO;

create sequence todo1.S_VENDEDOR;

/*==============================================================*/
/* Table: CATEGORIA                                             */
/*==============================================================*/
create table todo1.CATEGORIA (
   ID_CATEGORIA         SERIAL not null,
   NOMBR                VARCHAR(50)          null,
   DESCRIPCION_CATEGORIA VARCHAR(100)         null,
   ESTADO_CATEGORIA     INT2                 null,
   constraint PK_CATEGORIA primary key (ID_CATEGORIA)
);

/*==============================================================*/
/* Index: CATEGORIA_PK                                          */
/*==============================================================*/
create unique index CATEGORIA_PK on todo1.CATEGORIA (
ID_CATEGORIA
);

/*==============================================================*/
/* Table: DETALLE_TRANSACCION                                   */
/*==============================================================*/
create table todo1.DETALLE_TRANSACCION (
   ID_DETALLE_TRANSACCION SERIAL not null,
   ID_PRODUCTO          INT4                 null,
   ID_TRANSACCION       INT4                 null,
   CANTIDAD_DETALLE_TRANSACCION INT4                 null,
   PRECIOU_DETALLE_TRANSACCION NUMERIC(10)          null,
   MONTO_DETALLE_TRANSACCION NUMERIC(10,2)        null,
   constraint PK_DETALLE_TRANSACCION primary key (ID_DETALLE_TRANSACCION)
);

/*==============================================================*/
/* Index: DETALLE_TRANSACCION_PK                                */
/*==============================================================*/
create unique index DETALLE_TRANSACCION_PK on todo1.DETALLE_TRANSACCION (
ID_DETALLE_TRANSACCION
);

/*==============================================================*/
/* Index: PRO_DET_VEN_FK                                        */
/*==============================================================*/
create  index PRO_DET_VEN_FK on todo1.DETALLE_TRANSACCION (
ID_PRODUCTO
);

/*==============================================================*/
/* Index: DETTRAN_TRAN_FK                                       */
/*==============================================================*/
create  index DETTRAN_TRAN_FK on todo1.DETALLE_TRANSACCION (
ID_TRANSACCION
);

/*==============================================================*/
/* Table: MOVIMIENTO                                            */
/*==============================================================*/
create table todo1.MOVIMIENTO (
   ID_MOVIMIENTO        SERIAL not null,
   ID_PRODUCTO          INT4                 null,
   ID_DETALLE_TRANSACCION INT4                 null,
   STOCK_ANTERIOR       INT4                 null,
   STOCK_ACTUAL         INT4                 null,
   CANTIDAD             INT4                 null,
   VALOR_UNITARIO       NUMERIC(10,2)        null,
   VALOR_TOTAL          NUMERIC(10,2)        null,
   constraint PK_MOVIMIENTO primary key (ID_MOVIMIENTO)
);

/*==============================================================*/
/* Index: MOVIMIENTO_PK                                         */
/*==============================================================*/
create unique index MOVIMIENTO_PK on todo1.MOVIMIENTO (
ID_MOVIMIENTO
);

/*==============================================================*/
/* Index: PRO_MOV_FK                                            */
/*==============================================================*/
create  index PRO_MOV_FK on todo1.MOVIMIENTO (
ID_PRODUCTO
);

/*==============================================================*/
/* Index: DETTRA_MOV_FK                                         */
/*==============================================================*/
create  index DETTRA_MOV_FK on todo1.MOVIMIENTO (
ID_DETALLE_TRANSACCION
);

/*==============================================================*/
/* Table: OPERACION                                             */
/*==============================================================*/
create table todo1.OPERACION (
   ID_OPERACION         SERIAL not null,
   ID_TRANSACCION       INT4                 null,
   DESCRIPCION_OPERACION VARCHAR(100)         null,
   ESTADO_OPERACION     INT2                 null,
   constraint PK_OPERACION primary key (ID_OPERACION)
);

/*==============================================================*/
/* Index: OPERACION_PK                                          */
/*==============================================================*/
create unique index OPERACION_PK on todo1.OPERACION (
ID_OPERACION
);

/*==============================================================*/
/* Index: TRAN_OPER_FK                                          */
/*==============================================================*/
create  index TRAN_OPER_FK on todo1.OPERACION (
ID_TRANSACCION
);

/*==============================================================*/
/* Table: PRODUCTO                                              */
/*==============================================================*/
create table todo1.PRODUCTO (
   ID_PRODUCTO          SERIAL not null,
   ID_CATEGORIA         INT4                 null,
   NOMBRE_PRODUCTO      VARCHAR(100)         null,
   PRECIOU_PRODUCTO     NUMERIC(10,2)        null,
   PRECIOC_PRODUCTO     NUMERIC(10,2)        null,
   ESTADO_PRODUCTI      INT2                 null,
   constraint PK_PRODUCTO primary key (ID_PRODUCTO)
);

/*==============================================================*/
/* Index: PRODUCTO_PK                                           */
/*==============================================================*/
create unique index PRODUCTO_PK on todo1.PRODUCTO (
ID_PRODUCTO
);

/*==============================================================*/
/* Index: CAT_PRO_FK                                            */
/*==============================================================*/
create  index CAT_PRO_FK on todo1.PRODUCTO (
ID_CATEGORIA
);

/*==============================================================*/
/* Table: TIPO_USUARIO                                          */
/*==============================================================*/
create table todo1.TIPO_USUARIO (
   ID_TIPO_USUARIO      SERIAL not null,
   DESCRIPCION_TIPO_USUARIO VARCHAR(100)         null,
   ESTADO_TIPO_USUARIO  INT2                 null,
   constraint PK_TIPO_USUARIO primary key (ID_TIPO_USUARIO)
);

/*==============================================================*/
/* Index: TIPO_USUARIO_PK                                       */
/*==============================================================*/
create unique index TIPO_USUARIO_PK on todo1.TIPO_USUARIO (
ID_TIPO_USUARIO
);

/*==============================================================*/
/* Table: TRANSACCION                                           */
/*==============================================================*/
create table todo1.TRANSACCION (
   ID_TRANSACCION       SERIAL not null,
   ID_VENDEDOR          INT4                 null,
   ID_USUARIO           INT4                 null,
   FECHA_TRANSACCION    DATE                 null,
   constraint PK_TRANSACCION primary key (ID_TRANSACCION)
);

/*==============================================================*/
/* Index: TRANSACCION_PK                                        */
/*==============================================================*/
create unique index TRANSACCION_PK on todo1.TRANSACCION (
ID_TRANSACCION
);

/*==============================================================*/
/* Index: TRANS_VEND_FK                                         */
/*==============================================================*/
create  index TRANS_VEND_FK on todo1.TRANSACCION (
ID_VENDEDOR
);

/*==============================================================*/
/* Index: CLI_VEN_FK                                            */
/*==============================================================*/
create  index CLI_VEN_FK on todo1.TRANSACCION (
ID_USUARIO
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table todo1.USUARIO (
   ID_USUARIO           SERIAL not null,
   TIPO_DOC_USUARIO     INT4                 null,
   NUM_DOC_USUARIO      VARCHAR(13)          null,
   NOMBRE_USUARIO       VARCHAR(200)         null,
   DIRECCION_USUARIO    VARCHAR(200)         null,
   TELEFONO_USUARIO     VARCHAR(10)          null,
   MAIL_USUARIO         VARCHAR(50)          null,
   RAZONS_USUARIO       VARCHAR(200)         null,
   DIRECCION_RS_USUARIO VARCHAR(200)         null,
   FONO_RS_USUARIO      VARCHAR(10)          null,
   MAIL_RS_USUARIO      VARCHAR(100)         null,
   ESTADO_RS_USUARIO    INT2                 null,
   constraint PK_USUARIO primary key (ID_USUARIO)
);

/*==============================================================*/
/* Index: USUARIO_PK                                            */
/*==============================================================*/
create unique index USUARIO_PK on todo1.USUARIO (
ID_USUARIO
);

/*==============================================================*/
/* Table: USUARIO_TIPO_USUARIO                                  */
/*==============================================================*/
create table todo1.USUARIO_TIPO_USUARIO (
   ID_USU_TIP_USUARIO   SERIAL not null,
   ID_TIPO_USUARIO      INT4                 null,
   ID_USUARIO           INT4                 null,
   constraint PK_USUARIO_TIPO_USUARIO primary key (ID_USU_TIP_USUARIO)
);

/*==============================================================*/
/* Index: USUARIO_TIPO_USUARIO_PK                               */
/*==============================================================*/
create unique index USUARIO_TIPO_USUARIO_PK on todo1.USUARIO_TIPO_USUARIO (
ID_USU_TIP_USUARIO
);

/*==============================================================*/
/* Index: TIP_USU_USU_FK                                        */
/*==============================================================*/
create  index TIP_USU_USU_FK on todo1.USUARIO_TIPO_USUARIO (
ID_TIPO_USUARIO
);

/*==============================================================*/
/* Index: USU_TIP_USU_FK                                        */
/*==============================================================*/
create  index USU_TIP_USU_FK on todo1.USUARIO_TIPO_USUARIO (
ID_USUARIO
);

/*==============================================================*/
/* Table: VENDEDOR                                              */
/*==============================================================*/
create table todo1.VENDEDOR (
   ID_VENDEDOR          SERIAL not null,
   CEDULA_VENDEDOR      VARCHAR(10)          null,
   NOMBRE_VENDEDOR      VARCHAR(200)         null,
   DIRECCION_VENDEDOR   VARCHAR(100)         null,
   CELULAR_VENDEDOR     VARCHAR(10)          null,
   ESTADO_VENDEDOR      INT2                 null,
   constraint PK_VENDEDOR primary key (ID_VENDEDOR)
);

/*==============================================================*/
/* Index: VENDEDOR_PK                                           */
/*==============================================================*/
create unique index VENDEDOR_PK on todo1.VENDEDOR (
ID_VENDEDOR
);

alter table todo1.DETALLE_TRANSACCION
   add constraint FK_DETALLE__DETTRAN_T_TRANSACC foreign key (ID_TRANSACCION)
      references todo1.TRANSACCION (ID_TRANSACCION)
      on delete restrict on update restrict;

alter table todo1.DETALLE_TRANSACCION
   add constraint FK_DETALLE__PRO_DET_V_PRODUCTO foreign key (ID_PRODUCTO)
      references todo1.PRODUCTO (ID_PRODUCTO)
      on delete restrict on update restrict;

alter table todo1.MOVIMIENTO
   add constraint FK_MOVIMIEN_DETTRA_MO_DETALLE_ foreign key (ID_DETALLE_TRANSACCION)
      references todo1.DETALLE_TRANSACCION (ID_DETALLE_TRANSACCION)
      on delete restrict on update restrict;

alter table todo1.MOVIMIENTO
   add constraint FK_MOVIMIEN_PRO_MOV_PRODUCTO foreign key (ID_PRODUCTO)
      references todo1.PRODUCTO (ID_PRODUCTO)
      on delete restrict on update restrict;

alter table todo1.OPERACION
   add constraint FK_OPERACIO_TRAN_OPER_TRANSACC foreign key (ID_TRANSACCION)
      references todo1.TRANSACCION (ID_TRANSACCION)
      on delete restrict on update restrict;

alter table todo1.PRODUCTO
   add constraint FK_PRODUCTO_CAT_PRO_CATEGORI foreign key (ID_CATEGORIA)
      references todo1.CATEGORIA (ID_CATEGORIA)
      on delete restrict on update restrict;

alter table todo1.TRANSACCION
   add constraint FK_TRANSACC_CLI_VEN_USUARIO foreign key (ID_USUARIO)
      references todo1.USUARIO (ID_USUARIO)
      on delete restrict on update restrict;

alter table todo1.TRANSACCION
   add constraint FK_TRANSACC_TRANS_VEN_VENDEDOR foreign key (ID_VENDEDOR)
      references todo1.VENDEDOR (ID_VENDEDOR)
      on delete restrict on update restrict;

alter table todo1.USUARIO_TIPO_USUARIO
   add constraint FK_USUARIO__TIP_USU_U_TIPO_USU foreign key (ID_TIPO_USUARIO)
      references todo1.TIPO_USUARIO (ID_TIPO_USUARIO)
      on delete restrict on update restrict;

alter table todo1.USUARIO_TIPO_USUARIO
   add constraint FK_USUARIO__USU_TIP_U_USUARIO foreign key (ID_USUARIO)
      references todo1.USUARIO (ID_USUARIO)
      on delete restrict on update restrict;
