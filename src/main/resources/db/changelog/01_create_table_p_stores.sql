-- liquibase formatted sql

-- changeset Jaehyun-Kim:01-create-p-store-table
CREATE TABLE p_store
(
    store_id   BIGINT       NOT NULL AUTO_INCREMENT,
    name       VARCHAR(100) NOT NULL,

    CONSTRAINT pk_p_store PRIMARY KEY (store_id)
);
-- rollback DROP TABLE p_store;
