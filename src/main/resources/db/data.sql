insert into employee (id, first_name, last_name, svnr) values (1, 'Rebecca', 'Bell', '7524277298');
insert into employee (id, first_name, last_name, svnr) values (2, 'Albert', 'Jordan', '1499593323');
insert into employee (id, first_name, last_name, svnr) values (3, 'Edward', 'Cook', '5986159118');

insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (4, 'KOMBI', 'VW', '730i','BN-779-UP', 7, 0, 80, 2000, 40, 200);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (5, 'KOMBI', 'Mercedes','S200','BN-606-YG', 9, 0, 60, 2000, 40, 200);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (6, 'KOMBI', 'Mercedes','S100','BN-101-VM', 9, 0, 60, 2000, 40, 200);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (7, 'KOMBI', 'BMW', 'S100','BN-015-ST', 7, 0, 60, 2000, 30, 200);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (8, 'PKW', 'Mercedes','S100','BN-716-UK', 7, 0, 90, 2000, 20, 200);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (9, 'PKW', 'VW', '730i','BN-374-PO', 5, 0, 50, 1500, 20, 100);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (10, 'KOMBI', 'Mercedes','730i','BN-568-LI', 7, 0, 50, 1500, 40, 100);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (11, 'PKW', 'BMW', 'S200','BN-913-XY', 7, 0, 50, 1500, 40, 100);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (12, 'KOMBI', 'VW', 'S200','BN-162-PU', 5, 0, 50, 1500, 20, 100);
insert into vehicle (id, vehicle_type, brand, model, number_plate, seat_nr, km, basic_price, included_km, price_per100km, penalty_per_day) values (13, 'KOMBI', 'VW', 'S200','BN-569-SV', 7, 0, 60, 1500, 40, 100);

insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (13, 3, '2014-08-23', '2014-08-28T10:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (13, 3, '2015-02-20', '2015-02-25T19:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (13, 3, '2015-07-31', '2015-08-10T02:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (13, 3, '2015-08-01', '2015-08-08T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 1, '2014-02-04', '2014-02-13T05:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 1, '2014-05-17', '2014-05-25T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 2, '2014-09-15', '2014-09-23T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 3, '2014-09-27', '2014-10-02T21:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 2, '2014-11-15', '2014-11-25T20:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (11, 2, '2015-06-09', '2015-06-18T02:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (12, 3, '2014-02-28', '2014-03-08T15:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (12, 3, '2014-06-09', '2014-06-17T13:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (12, 2, '2014-12-01', '2014-12-09T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (12, 1, '2015-05-04', '2015-05-13T08:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 2, '2014-02-23', '2014-03-04T01:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 1, '2014-09-16', '2014-09-24T21:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 3, '2014-10-13', '2014-10-20T11:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 1, '2014-10-20', '2014-10-27T11:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 2, '2015-04-19', '2015-04-26T08:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 3, '2015-11-06', '2015-11-15T04:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (10, 2, '2015-11-08', '2015-11-17T09:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (5, 1, '2014-03-04', '2014-03-14T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (5, 3, '2014-07-30', '2014-08-06T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (5, 1, '2015-05-02', '2015-05-06T21:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (5, 1, '2015-07-05', '2015-07-11T11:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (5, 3, '2015-10-12', '2015-10-20T08:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (4, 3, '2014-04-16', '2014-04-22T20:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (4, 3, '2015-03-03', '2015-03-11T10:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (4, 2, '2015-04-30', '2015-05-06T10:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (4, 3, '2015-10-11', '2015-10-22T04:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 2, '2014-02-14', '2014-02-20T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 3, '2014-03-21', '2014-03-25T18:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 2, '2014-04-16', '2014-04-20T16:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 3, '2014-07-01', '2014-07-12T20:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 1, '2014-07-05', '2014-07-11T15:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 3, '2014-08-13', '2014-08-24T02:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 1, '2014-12-14', '2014-12-21T08:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 1, '2015-06-25', '2015-07-01T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (8, 3, '2015-07-24', '2015-08-03T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (6, 2, '2014-05-19', '2014-05-28T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (6, 2, '2014-10-17', '2014-10-21T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (6, 3, '2014-11-18', '2014-11-24T01:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (6, 2, '2014-12-14', '2014-12-20T00:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (6, 1, '2015-03-10', '2015-03-14T23:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (7, 2, '2014-07-27', '2014-08-02T20:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (7, 1, '2015-09-25', '2015-10-01T06:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (7, 2, '2015-11-12', '2015-11-19T19:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (9, 2, '2014-08-28', '2014-09-06T04:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (9, 1, '2014-12-16', '2014-12-26T09:00:00');
insert into reservation ( vehicle_id, employee_id, date_from, date_to) VALUES (9, 2, '2015-06-21', '2015-06-30T08:00:00');

insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (13, 3, '2014-08-23', '2014-08-30', 0,2900);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (13, 3, '2015-02-20', '2015-02-27', 2900,5310);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (13, 3, '2015-07-31', '2015-08-09', 5310,8580);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (13, 3, '2015-08-01', '2015-08-08', 8580,10560);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 1, '2014-02-04', '2014-02-13', 0,3690);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 1, '2014-05-17', '2014-05-25', 3690,8380);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 2, '2014-09-15', '2014-09-25', 8380,10210);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 3, '2014-09-27', '2014-10-04', 10210,14470);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 2, '2014-11-15', '2014-11-24', 14470,16170);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (11, 2, '2015-06-09', '2015-06-18', 16170,20990);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (12, 3, '2014-02-28', '2014-03-08', 0,1980);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (12, 3, '2014-06-09', '2014-06-19', 1980,4020);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (12, 2, '2014-12-01', '2014-12-11', 4020,6950);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (12, 1, '2015-05-04', '2015-05-13', 6950,9110);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 2, '2014-02-23', '2014-03-04', 0,2010);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 1, '2014-09-16', '2014-09-26', 2010,2430);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 3, '2014-10-13', '2014-10-20', 2430,4910);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 1, '2014-10-20', '2014-10-29', 4910,9060);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 2, '2015-04-19', '2015-04-28', 9060,13170);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 3, '2015-11-06', '2015-11-15', 13170,18140);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (10, 2, '2015-11-08', '2015-11-17', 18140,20870);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (5, 1, '2014-03-04', '2014-03-13', 0,2780);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (5, 3, '2014-07-30', '2014-08-08', 2780,3590);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (5, 1, '2015-05-02', '2015-05-08', 3590,3900);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (5, 1, '2015-07-05', '2015-07-13', 3900,5670);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (5, 3, '2015-10-12', '2015-10-20', 5670,6770);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (4, 3, '2014-04-16', '2014-04-22', 0,3940);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (4, 3, '2015-03-03', '2015-03-11', 3940,4050);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (4, 2, '2015-04-30', '2015-05-08', 4050,4210);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (4, 3, '2015-10-11', '2015-10-21', 4210,6380);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 2, '2014-02-14', '2014-02-22', 0,2090);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 3, '2014-03-21', '2014-03-27', 2090,2960);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 2, '2014-04-16', '2014-04-22', 2960,7400);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 3, '2014-07-01', '2014-07-10', 7400,8610);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 1, '2014-07-05', '2014-07-13', 8610,12220);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 3, '2014-08-13', '2014-08-23', 12220,14600);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 1, '2014-12-14', '2014-12-20', 14600,16870);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 1, '2015-06-25', '2015-07-01', 16870,20890);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (8, 3, '2015-07-24', '2015-08-02', 20890,24960);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (6, 2, '2014-05-19', '2014-05-29', 0,3620);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (6, 2, '2014-10-17', '2014-10-23', 3620,6910);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (6, 3, '2014-11-18', '2014-11-24', 6910,7480);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (6, 2, '2014-12-14', '2014-12-22', 7480,11460);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (6, 1, '2015-03-10', '2015-03-16', 11460,14050);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (7, 2, '2014-07-27', '2014-08-02', 0,120);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (7, 1, '2015-09-25', '2015-10-01', 120,620);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (7, 2, '2015-11-12', '2015-11-19', 620,1440);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (9, 2, '2014-08-28', '2014-09-06', 0,810);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (9, 1, '2014-12-16', '2014-12-24', 810,5300);
insert into trip ( vehicle_id, employee_id, start_date, end_date, km_begin, km_end ) VALUES (9, 2, '2015-06-21', '2015-06-30', 5300,8880);

-- Den KM Stand berichtigen.
UPDATE vehicle
SET vehicle.km = (
	SELECT MAX(t.km_end)
	FROM trip t
	WHERE t.vehicle_id = vehicle.id
);
