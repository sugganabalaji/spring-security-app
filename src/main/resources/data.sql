insert into users(user_id, user_name, password, granted_authority) values
    (1, 'balaji', 'b@123', 'USER'),
    (2, 'rudvik', 'r@123', 'ADMIN'),
    (3, 'vasundhara', 'v@123', 'USER');

update users set password = '$2y$12$UBohNoTzWFr1L.l02IrI6uxy0Eud0V.0Vs2ztEQXN5X.PAJkPZHl.' where user_id = 3;

-- https://bcrypt.online/
--    input=v@123
--    rounds=12
--    BCryptVersion.$2Y
-- Output= $2y$12$UBohNoTzWFr1L.l02IrI6uxy0Eud0V.0Vs2ztEQXN5X.PAJkPZHl.
