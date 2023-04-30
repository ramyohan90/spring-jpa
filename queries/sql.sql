create SEQUENCE IF NOT EXISTS customer_sequence_id INCREMENT 1 MAXVALUE 2147483647;
create table customer (
    customerid bigint NOT NULL DEFAULT nextval('customer_sequence_id'),
    firstname varchar(50),
    lastname varchar(50),
    name varchar(50),
    createdate DATE NOT NULL,
    updatedate DATE,
    PRIMARY KEY (customerid)
);

create SEQUENCE IF NOT EXISTS address_sequence_id INCREMENT 1 MAXVALUE 2147483647;
create table address (
    addressid bigint NOT NULL DEFAULT nextval('address_sequence_id'),
    billing_address_st1 varchar(50),
    billing_address_st2 varchar(50),
    billing_address_zip varchar(50),
    delivery_address_st1 varchar(50),
    delivery_address_st2 varchar(50),
    delivery_address_zip varchar(50),
    customerid bigint,
    createdate DATE NOT NULL,
    updatedate DATE,
    PRIMARY KEY (addressid),
    CONSTRAINT fk_customerid
      FOREIGN KEY(customerid) 
	  REFERENCES customer(customerid)
);

create SEQUENCE IF NOT EXISTS orderstatus_sequence_id INCREMENT 1 MAXVALUE 2147483647;
create table orderstatus (
    orderstatusid bigint NOT NULL DEFAULT nextval('orderstatus_sequence_id'),
    status varchar(20),
    description varchar(50),
    createdate DATE NOT NULL,
    updatedate DATE,
    PRIMARY KEY (orderstatusid)
);

insert into orderstatus (status, description,createdate, updatedate) values
('placed', 'Placed', now(), null),
('pending', 'Pending', now(), null),
('failed', 'Failed', now(), null),
('complete', 'Complete', now(), null),
('shipped', 'Shippied', now(), null),
('transit', 'In Transit', now(), null),
('return', 'Returned', now(), null);

create SEQUENCE IF NOT EXISTS cust_order_sequence_id INCREMENT 1 MAXVALUE 2147483647;

create table cust_order (
    cust_orderid bigint NOT NULL DEFAULT nextval('cust_order_sequence_id'),
    ordernumber varchar(100) NOT NULL UNIQUE,
    orderstatusid bigint NOT NULL,
    quantity numeric(2),
    totalAmount numeric(8,2),
    discount varchar(2),
    promocode varchar(40),
    customerid bigint NOT NULL,
    createdate DATE NOT NULL,
    updatedate DATE,
    PRIMARY KEY (cust_orderid),
    CONSTRAINT fk_orderstatusid
      FOREIGN KEY(orderstatusid) 
	  REFERENCES orderstatus(orderstatusid),
    CONSTRAINT fk_ordercustomerid
      FOREIGN KEY(customerid) 
	  REFERENCES customer(customerid)
);

create SEQUENCE IF NOT EXISTS item_sequence_id INCREMENT 1 MAXVALUE 2147483647;

create table item (
    itemid bigint NOT NULL DEFAULT nextval('item_sequence_id'),
    cust_orderid bigint,
    item varchar(50),
    quantity numeric(2),
    amount numeric(8,2),
    customerid bigint,
    createdate DATE NOT NULL,
    updatedate DATE,
    CONSTRAINT fk_itemorderid
      FOREIGN KEY(cust_orderid) 
	  REFERENCES cust_order(cust_orderid),
    CONSTRAINT fk_itemcustomerid
      FOREIGN KEY(customerid) 
	  REFERENCES customer(customerid)
);