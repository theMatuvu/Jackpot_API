DROP TABLE IF EXISTS customers;
 
CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  jackpot_amount DOUBLE NOT NULL,
  nb_checkout INT NOT NULL
);
 
INSERT INTO customers (first_name, last_name, jackpot_amount, nb_checkout) VALUES
  ('Axel', 'AIRE', '0', '0'),
  ('Paul', 'HOCHON', '4', '5'),
  ('Emma', 'CARENA', '15', '7'),
  ('Agathe', 'FEELING', '12', '3');