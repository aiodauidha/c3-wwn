USE test;

DELETE FROM test
WHERE Score < 550 AND Address LIKE "重邮宿舍%";