-- 코드를 작성해주세요
SELECT count(*) as FISH_COUNT FROM FISH_INFO JOIN FISH_NAME_INFO on FISH_INFO.FISH_TYPE = FISH_NAME_INFO.FISH_TYPE where FISH_NAME_INFO.FISH_NAME in ('BASS', 'SNAPPER');