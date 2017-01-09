INSERT INTO
    `driver`
        (`id`, `name`, `age`)
    VALUES
        (1, 'Bob Smith', 35),
        (2, 'Steve Dood', 42)
    ON DUPLICATE KEY UPDATE
        id=id;