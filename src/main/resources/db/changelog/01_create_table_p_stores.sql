-- liquibase formatted sql

-- changeset Jaehyun-Kim:01-create-p-store-table
CREATE TABLE p_store
(
    store_id       BIGINT        NOT NULL AUTO_INCREMENT COMMENT '가게 ID',
    user_id        BIGINT        NOT NULL COMMENT '사장님 ID',
    address_id     BIGINT        NOT NULL COMMENT '가게 주소 ID',
    name           VARCHAR(100)  NOT NULL COMMENT '상호명',
    rating_avg     DECIMAL(2,1)  NOT NULL DEFAULT 0.0 COMMENT '가게 평점',
    review_count   INT           NOT NULL DEFAULT 0 COMMENT '리뷰 수',
    detail_address VARCHAR(255)  NOT NULL COMMENT '상세 주소',

    created_at     TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '레코드 생성 시간',
    created_by     VARCHAR(100)  NOT NULL COMMENT '레코드 생성자',
    updated_at     TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '레코드 수정 시간',
    updated_by     VARCHAR(100)  NOT NULL COMMENT '레코드 수정자',
    deleted_at     TIMESTAMP     NULL COMMENT '레코드 삭제 시간',
    deleted_by     VARCHAR(100) NULL COMMENT '레코드 삭제자',

    -- Constraints
    CONSTRAINT pk_store PRIMARY KEY (store_id),
    CONSTRAINT ck_store_rating_range CHECK (rating_avg BETWEEN 0.0 AND 5.0)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- rollback DROP TABLE p_store;

-- Indexes
CREATE INDEX idx_store_user_id ON p_store (user_id);
CREATE INDEX idx_store_address_id ON p_store (address_id);

-- rollback DROP INDEX idx_store_user_id;
-- rollback DROP INDEX idx_store_address_id;