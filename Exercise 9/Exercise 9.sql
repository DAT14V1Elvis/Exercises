-- Simple Queries

-- 7 List full details of all hotels?
SELECT * FROM Hotel;

-- 8 List full details of all hotels in London.accessible?
SELECT * FROM Hotel WHERE city = 'London';

-- 9 List the names and addresses of all guests living in London, alphabetically ordered by name?
SELECT guestName, guestAddress FROM guest WHERE guestAddress like '%London%' AND guestAddress  ORDER BY guestName;

-- 10 List all double or family rooms with a price below £40.00 per night, in ascending order of price?
SELECT * FROM Room WHERE type = 'double' OR type = family and price <= '40.00' ORDER BY price;

-- 11 List the bookings for which no dateTo has been specified?
SELECT * FROM Booking; 

-- Aggregate functions

-- 12 How many hotels are there?
SELECT COUNT(*) AS number FROM hotel;

-- 13 What is the average price of a room?
SELECT AVG(price) FROM room;

-- 14 What is the total revenue per night from all double rooms?
SELECT COUNT(*) AS Dobbeltseng, SUM(price) AS salarySum from room Where type = 'Dobbeltseng'; 

-- 15 How many different guests have made bookings for August? 


-- 22 List the number of rooms in each hotel.
SELECT fk_hotel_id, COUNT(*) AS antalRoom
FROM room 
GROUP BY fk_hotel_id;

-- 23 List the number of rooms in each hotel in London.


-- 27 Insert a row into a table.
INSERT INTO guest (guestNo, guestName, guestAddress)
VALUES('6','Elvis', 'Rosenhøj 161 tv');

-- 28 Update the price of all rooms by 5%.
UPDATE room
SET price; 

-- 29 Delete a row in a table
DELETE FROM guest WHERE guestName = 'Elvis';


