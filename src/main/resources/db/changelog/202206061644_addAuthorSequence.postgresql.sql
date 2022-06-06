--liquibase formatted sql

--changeset Piotr_Wójcik:1654533891855-1
CREATE SEQUENCE IF NOT EXISTS author_seq INCREMENT BY 50;
SELECT setval('author_seq', (SELECT MAX(id) FROM author));
