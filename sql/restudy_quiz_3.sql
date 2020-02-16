#Quiz 3 restudy

USE world

#1번 문제
SELECT NAME, Population
FROM country

WHERE Population > ( SELECT Population #조건을 테이블로
							FROM country 
							Where NAME = "Mexico")
ORDER BY Population DESC

#2번 문제
SELECT country.Name, COUNT(city.Name) AS count
FROM country
JOIN city
ON country.Code = city.CountryCode
GROUP BY country.Code
ORDER BY COUNT DESC
LIMIT 10

# 3번 문제
SELECT countrylanguage.language,  
round(SUM(country.population*countrylanguage.percentage*0.01)) AS count 
FROM country
JOIN countrylanguage
ON country.code = countrylanguage.CountryCode
GROUP BY countrylanguage.Language
ORDER BY COUNT DESC 
LIMIT 10

#4번 문제
SELECT city.Name, city.CountryCode, city.name, round(city.population / country.population * 100, 2) AS percentage
FROM 
(SELECT *
		FROM city
		WHERE city.population > 5000000) as city
JOIN country
ON city.countrycode = country.code
HAVING percentage > 10
ORDER BY percentage DESC
# why should we use "HAVING"? Not "WHERE"

#5번 문제
SELECT country.name AS name, count(countrylanguage.Language) AS language_count
FROM 
(SELECT CODE, NAME, ROUND((population/surfacearea)) AS density
FROM country
WHERE surfacearea > 10000
GROUP BY CODE
HAVING density > 200
ORDER BY density DESC) AS country

JOIN countrylanguage
ON country.code = countrylanguage.countrycode
GROUP BY name
HAVING language_count > 5
ORDER BY language_count DESC

# 6번 문제
SELECT cl.code, city.name AS city_name, 
city.population AS population,
cl.name, cl.language_count, cl.languages
FROM 
(SELECT country.code AS code, country.name AS name, countrylanguage.language_count AS language_count, countrylanguage.languages AS languages
FROM (
		SELECT countrycode, COUNT(LANGUAGE) AS language_count, GROUP_CONCAT(LANGUAGE) AS languages
		FROM countrylanguage
		GROUP BY countrycode
		HAVING language_count <= 3) as countrylanguage
JOIN country
ON country.code = countrylanguage.CountryCode) AS cl

JOIN city
ON city.countrycode = cl.code
HAVING city.population > 3000000
ORDER BY population DESC