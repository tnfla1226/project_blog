
CREATE TABLE category (
    category_no NUMBER(10) PRIMARY KEY,
    category_name VARCHAR2(200) NOT NULL
);

INSERT INTO category VALUES (1, '영화');
INSERT INTO category VALUES (2, '맛집');
INSERT INTO category VALUES (3, '여행');

CREATE SEQUENCE seq_board;
DROP SEQUENCE seq_board;

DROP TABLE board;
CREATE TABLE board (
    serial_no NUMBER(10) PRIMARY KEY,
    board_no NUMBER(10) NOT NULL,
    board_title VARCHAR(1000) NOT NULL,
    board_content VARCHAR(1000) NOT NULL,
    board_view_cnt NUMBER(10) NOT NULL,
    board_date DATE default SYSDATE,
    category_no NUMBER(10) NOT NULL,
    FOREIGN KEY(category_no) REFERENCES category(category_no)
);


SELECT * FROM board;
