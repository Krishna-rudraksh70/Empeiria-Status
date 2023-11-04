SELECT SUM(min_time) AS "Total Time"
FROM (
    SELECT problem_name, MIN(seconds) AS min_time
    FROM Submissions
    WHERE verdict = 'Accepted'
    GROUP BY problem_name
) AS min_times;
