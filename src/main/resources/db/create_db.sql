CREATE SCHEMA IF NOT EXISTS lab_patterns DEFAULT CHARACTER SET utf8 ;
USE lab_patterns ;

DROP TABLE IF EXISTS shipment;
DROP TABLE IF EXISTS lab_patterns.order;
DROP TABLE IF EXISTS buyer;
DROP TABLE IF EXISTS shopping_cart;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS seller;

CREATE TABLE IF NOT EXISTS seller (
  id INT NOT NULL AUTO_INCREMENT,
  account_balance DOUBLE NOT NULL,
  `name` VARCHAR(45) NULL,
  email VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  work_since DATE NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS product (
  id INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(200) NULL,
  price DOUBLE UNSIGNED NOT NULL,
  is_available INT NOT NULL,
  category INT NOT NULL,
  seller_id INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_product_seller1_idx (seller_id ASC) VISIBLE,
  CONSTRAINT fk_product_seller1
    FOREIGN KEY (seller_id)
    REFERENCES seller (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS shopping_cart(
  id INT NOT NULL AUTO_INCREMENT,
  total_price DOUBLE UNSIGNED NOT NULL,
  product_id INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_shopping_cart_product1_idx (product_id ASC) VISIBLE,
  CONSTRAINT fk_shopping_cart_product1
    FOREIGN KEY (product_id)
    REFERENCES product (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS buyer(
  id INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  email VARCHAR(100) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS lab_patterns.order(
  id INT NOT NULL AUTO_INCREMENT,
  address VARCHAR(100) NOT NULL,
  quantity INT UNSIGNED NOT NULL,
  shopping_cart_id INT NOT NULL,
  buyer_id INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_order_shopping_cart_idx (shopping_cart_id ASC) VISIBLE,
  INDEX fk_order_buyer1_idx (buyer_id ASC) VISIBLE,
  CONSTRAINT fk_order_shopping_cart
    FOREIGN KEY (shopping_cart_id)
    REFERENCES shopping_cart (id),
  CONSTRAINT fk_order_buyer1
    FOREIGN KEY (buyer_id)
    REFERENCES buyer (id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS shipment(
  id INT NOT NULL AUTO_INCREMENT,
  shipped DATE NULL,
  `status` INT NULL,
  order_id INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_shipment_order1_idx (order_id ASC) VISIBLE,
  CONSTRAINT fk_shipment_order1
    FOREIGN KEY (order_id)
    REFERENCES lab_patterns.order (id)
) ENGINE = InnoDB;
