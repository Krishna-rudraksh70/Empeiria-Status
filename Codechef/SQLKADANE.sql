WITH RECURSIVE MaxSubarray AS (
    SELECT key1, val1, val1 AS max_sum, 1 AS length
    FROM ArrayTable
    WHERE key1 = 1
    UNION ALL
    SELECT a.key1, a.val1,
           CASE WHEN (b.max_sum + a.val1) > a.val1 THEN (b.max_sum + a.val1) ELSE a.val1 END AS max_sum,
           CASE WHEN (b.max_sum + a.val1) > a.val1 THEN (b.length + 1) ELSE 1 END AS length
    FROM ArrayTable a
    INNER JOIN MaxSubarray b ON a.key1 = b.key1 + 1
)
SELECT MAX(max_sum) AS "Max Subarray Sum"
FROM MaxSubarray;
