/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 13.5 		*/
/*  Created On : 25-feb.-2020 19:28:14 				*/
/*  DBMS       : PostgreSQL 						*/
/* ---------------------------------------------------- */

/* Drop Sequences for Autonumber Columns */

DROP SEQUENCE IF EXISTS invoice_items_id_seq
;

DROP SEQUENCE IF EXISTS invoices_id_seq
;

DROP SEQUENCE IF EXISTS product_prices_id_seq
;

DROP SEQUENCE IF EXISTS products_id_seq
;

/* Drop Tables */

DROP TABLE IF EXISTS invoice_items CASCADE
;

DROP TABLE IF EXISTS invoices CASCADE
;

DROP TABLE IF EXISTS payments CASCADE
;

DROP TABLE IF EXISTS product_prices CASCADE
;

DROP TABLE IF EXISTS products CASCADE
;

/* Create Tables */

CREATE TABLE invoice_items
(
	id bigint NOT NULL   DEFAULT NEXTVAL(('"invoice_items_id_seq"'::text)::regclass),
	unit_price double precision NOT NULL,
	quantity double precision NOT NULL,
	item_amount double precision NOT NULL,
	invoice_id bigint NOT NULL,
	product_id bigint NOT NULL
)
;

CREATE TABLE invoices
(
	id bigint NOT NULL   DEFAULT NEXTVAL(('"invoices_id_seq"'::text)::regclass),
	invoice_number bigint NOT NULL,
	client_name varchar(255) NOT NULL,
	nit bigint NOT NULL,
	total_amount double precision NOT NULL,
	timestamp timestamp(3) without time zone NOT NULL,
	status varchar(50) NOT NULL
)
;

CREATE TABLE payments
(
	id bigint NOT NULL,
	payment_amount double precision NOT NULL,
	payment_code varchar(255) NOT NULL,
	timestamp timestamp(3) without time zone NOT NULL,
	invoice_id bigint NOT NULL,
	payment_mode varchar(50) NOT NULL
)
;

CREATE TABLE product_prices
(
	id bigint NOT NULL   DEFAULT NEXTVAL(('"product_prices_id_seq"'::text)::regclass),
	amount double precision NOT NULL,
	start_timestamp timestamp(3) without time zone NOT NULL,
	end_timestamp timestamp(3) without time zone NULL,
	is_active boolean NOT NULL,
	product_id bigint NOT NULL
)
;

CREATE TABLE products
(
	id bigint NOT NULL   DEFAULT NEXTVAL(('"products_id_seq"'::text)::regclass),
	code varchar(255) NOT NULL,
	name varchar(255) NOT NULL,
	description text NULL
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE invoice_items ADD CONSTRAINT PK_invoice_items
	PRIMARY KEY (id)
;

CREATE INDEX IXFK_invoice_items_invoices ON invoice_items (invoice_id ASC)
;

CREATE INDEX IXFK_invoice_items_products ON invoice_items (product_id ASC)
;

ALTER TABLE invoices ADD CONSTRAINT PK_invoices
	PRIMARY KEY (id)
;

ALTER TABLE payments ADD CONSTRAINT PK_payments
	PRIMARY KEY (id)
;

CREATE INDEX IXFK_payments_invoices ON payments (invoice_id ASC)
;

ALTER TABLE product_prices ADD CONSTRAINT PK_product_prices
	PRIMARY KEY (id)
;

CREATE INDEX IXFK_product_prices_products ON product_prices (product_id ASC)
;

ALTER TABLE products ADD CONSTRAINT PK_products
	PRIMARY KEY (id)
;

/* Create Foreign Key Constraints */

ALTER TABLE invoice_items ADD CONSTRAINT FK_invoice_items_invoices
	FOREIGN KEY (invoice_id) REFERENCES invoices (id) ON DELETE Cascade ON UPDATE Cascade
;

ALTER TABLE invoice_items ADD CONSTRAINT FK_invoice_items_products
	FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE Cascade ON UPDATE Cascade
;

ALTER TABLE payments ADD CONSTRAINT FK_payments_invoices
	FOREIGN KEY (invoice_id) REFERENCES invoices (id) ON DELETE Cascade ON UPDATE Cascade
;

ALTER TABLE product_prices ADD CONSTRAINT FK_product_prices_products
	FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE Cascade ON UPDATE Cascade
;

/* Create Table Comments, Sequences for Autonumber Columns */

CREATE SEQUENCE invoice_items_id_seq INCREMENT 1 START 1
;

CREATE SEQUENCE invoices_id_seq INCREMENT 1 START 1
;

CREATE SEQUENCE product_prices_id_seq INCREMENT 1 START 1
;

CREATE SEQUENCE products_id_seq INCREMENT 1 START 1
;
