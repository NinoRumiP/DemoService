CREATE TABLE fcenter (
  id          INTEGER PRIMARY KEY AUTO_INCREMENT,
  name        VARCHAR(64),
  street      VARCHAR(64),
  location    VARCHAR(64),
  phone       VARCHAR(64),
  website     VARCHAR(64));
CREATE TABLE costumer (
  id          INTEGER PRIMARY KEY AUTO_INCREMENT,
  name        VARCHAR(64),
  surname     VARCHAR(64),
  street      VARCHAR(64),
  location    VARCHAR(64),
  phone       VARCHAR(64),
  grundversicherung BOOLEAN,
  zusatzversicherungsstufe VARCHAR(64),
  kostenanteil NUMBER);