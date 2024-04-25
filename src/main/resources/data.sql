DROP TABLE IF EXISTS customers;
 
CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  jackpotamount DOUBLE NOT NULL,
  nbcheckout INT NOT NULL
);
 
INSERT INTO customers (firstname, lastname, jackpotamount, nbcheckout) VALUES
  ('Axel', 'AIRE', '0.', '0'),
  ('Paul', 'HOCHON', '4.', '5'),
  ('Emma', 'CARENA', '15.', '7'),
  ('Agathe', 'FEELING', '12.', '2');