DROP TABLE users IF EXISTS;
DROP TABLE entries IF EXISTS;

CREATE TABLE users (
  id            INTEGER IDENTITY PRIMARY KEY,
  username      VARCHAR(30),
  img_url       VARCHAR(256)
);
CREATE INDEX users_username ON users (username);



CREATE TABLE entries (
  id              INTEGER IDENTITY PRIMARY KEY,
  type            VARCHAR(30),
  description     VARCHAR(256),
  value           DECIMAL,
  user_id         INTEGER NOT NULL
);
ALTER TABLE entries ADD CONSTRAINT fk_entries_users FOREIGN KEY (user_id) REFERENCES users (id);