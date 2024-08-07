-- 코드를 입력하세요
SELECT p.PRODUCT_CODE, SUM(p.PRICE * s.SALES_AMOUNT) AS SALES
FROM PRODUCT AS p
INNER JOIN OFFLINE_SALE AS s
ON p.PRODUCT_ID = s.PRODUCT_ID
GROUP BY p.PRODUCT_CODE
ORDER BY SALES desc, p.PRODUCT_CODE;
