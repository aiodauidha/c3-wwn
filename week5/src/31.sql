USE test;

SELECT Name
FROM Student
WHERE EXISTS
(SELECT College FROM Student WHERE Name = "张三"); -- 这道题找了半天，实在是不会了，视频上似乎没讲这样的