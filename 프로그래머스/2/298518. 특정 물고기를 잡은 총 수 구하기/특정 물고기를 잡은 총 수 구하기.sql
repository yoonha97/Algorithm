-- 코드를 작성해주세요
SELECT count(*) AS FISH_COUNT
FROM fish_info as I
INNER JOIN fish_name_info as N
ON I.fish_type = N.fish_type 
WHERE N.fish_name in ('BASS', 'SNAPPER');