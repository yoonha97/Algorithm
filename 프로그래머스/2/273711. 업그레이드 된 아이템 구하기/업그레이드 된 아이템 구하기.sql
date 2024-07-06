-- 코드를 작성해주세요
SELECT
    it.ITEM_ID,
    ii.ITEM_NAME,
    ii.RARITY
FROM
    ITEM_TREE it
INNER JOIN 
    ITEM_INFO ii ON it.ITEM_ID = ii.ITEM_ID
WHERE 
    it.PARENT_ITEM_ID IN (
        SELECT ITEM_ID 
        FROM ITEM_INFO 
        WHERE RARITY = 'RARE'
    )
ORDER BY 
    it.ITEM_ID DESC;
