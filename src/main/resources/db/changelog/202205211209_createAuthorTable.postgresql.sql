--liquibase formatted sql

--changeset Piotr_Wójcik:1653134956321-1
CREATE TABLE author (id BIGINT NOT NULL, first_name VARCHAR(255), last_name VARCHAR(255), CONSTRAINT "authorPK" PRIMARY KEY (id));

