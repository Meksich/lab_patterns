INSERT INTO `lab_patterns`.`buyer` (`name`, `email`, `password`) VALUES ('Meks', 'maks10031003@gmail.com', '01012015');
INSERT INTO `lab_patterns`.`buyer` (`name`, `email`, `password`) VALUES ('Floppain da hat', 'floppa@gmail.com', 'f1l2o3p4p5a6');
INSERT INTO `lab_patterns`.`buyer` (`name`, `email`, `password`) VALUES ('Trakiv', 'dmyhnuv@gmail.com', 'whatever');

INSERT INTO `lab_patterns`.`seller` (`account_balance`, `name`, `email`, `password`, `work_since`) VALUES ('10000', 'Kaban', 'mykola_ivanovych@gmail.com', '123456', '10.03.2003');
INSERT INTO `lab_patterns`.`seller` (`account_balance`, `name`, `email`, `password`, `work_since`) VALUES ('1489', 'Henschel', 'henschel_rich@gmail.com', '18101945', '1810-04-18');

INSERT INTO `lab_patterns`.`product` (`name`, `description`, `price`, `is_available`, `category`, `seller_id`) VALUES ('Panzerfussilier', 'Panzerfüsilier are the light infantry units of the Oberkommando West\'s Breakthough Doctrine and Grand Offensive Doctrine. They are a 5 man squad, ideal for long range.', '270.0', '2', '1', '1');
INSERT INTO `lab_patterns`.`product` (`name`, `description`, `price`, `is_available`, `category`, `seller_id`) VALUES ('Königstiger', 'Panzerkampfwagen Tiger Ausf. B', '720.27', '1', '2', '2');
INSERT INTO `lab_patterns`.`product` (`name`, `description`, `price`, `is_available`, `category`, `seller_id`) VALUES ('Sturmgeschütz', 'Gepanzerte Selbstfahrlafette für Sturmgeschütz 7.5 cm Kanone Ausführung A bis D (Sd.Kfz.142).', '350.90', '0', '0', '2');

INSERT INTO `lab_patterns`.`shopping_cart` (`total_price`, `product_id`) VALUES ('2160.81', '2');
INSERT INTO `lab_patterns`.`shopping_cart` (`total_price`, `product_id`) VALUES ('810.0', '1');

INSERT INTO `lab_patterns`.`order` (`address`, `quantity`, `shopping_cart_id`, `buyer_id`) VALUES ('Lviv, Stryiska 99/137', '3', '1', '1');
INSERT INTO `lab_patterns`.`order` (`address`, `quantity`, `shopping_cart_id`, `buyer_id`) VALUES ('Lviv, Zamarstynivska 31/11', '3', '2', '2');

INSERT INTO `lab_patterns`.`shipment` (`shipped`, `status`, `order_id`) VALUES ('2003-03-10', '3', '1');
INSERT INTO `lab_patterns`.`shipment` (`status`, `order_id`) VALUES ('0', '2');
