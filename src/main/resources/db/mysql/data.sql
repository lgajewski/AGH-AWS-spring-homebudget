INSERT IGNORE INTO users VALUES(1, 'Jan K.', 'https://randomuser.me/api/portraits/men/2.jpg')
INSERT IGNORE INTO users VALUES(2, 'Adam N.', 'https://randomuser.me/api/portraits/men/6.jpg')
INSERT IGNORE INTO users VALUES(3, 'Anna K.', 'https://randomuser.me/api/portraits/women/8.jpg')
INSERT IGNORE INTO users VALUES(4, 'Olga O.', 'https://randomuser.me/api/portraits/women/12.jpg')


INSERT IGNORE INTO entries VALUES(1, 1, 'expense', 'Rachunek za prad',     320.52,    '2017-06-02')
INSERT IGNORE INTO entries VALUES(2, 2, 'expense', 'Rachunek za wode',     220.2,     '2017-06-07')
INSERT IGNORE INTO entries VALUES(3, 2, 'expense', 'Rachunek za smieci',   68,        '2017-06-12')
INSERT IGNORE INTO entries VALUES(4, 3, 'expense', 'Rachunek za gaz',      654.21,    '2017-06-18')

INSERT IGNORE INTO entries VALUES(5, 1, 'expense', 'Rachunek za prad',     120.52,    '2017-07-04')
INSERT IGNORE INTO entries VALUES(6, 2, 'expense', 'Rachunek za wode',     420.2,     '2017-07-02')
INSERT IGNORE INTO entries VALUES(7, 2, 'expense', 'Rachunek za smieci',   68,        '2017-07-12')
INSERT IGNORE INTO entries VALUES(8, 3, 'expense', 'Rachunek za gaz',      254.21,    '2017-07-16')

INSERT IGNORE INTO entries VALUES(9, 1,  'payment', 'Zwrot, pierwsza rata', 40,       '2017-06-18')
INSERT IGNORE INTO entries VALUES(10, 2, 'payment', 'Zwrot, pierwsza rata', 60,       '2017-06-20')
INSERT IGNORE INTO entries VALUES(11, 1, 'payment', 'Zwrot, druga rata',    73,       '2017-06-24')

INSERT IGNORE INTO entries VALUES(12, 1, 'payment', 'Zwrot, pierwsza rata', 100,      '2017-07-20')
INSERT IGNORE INTO entries VALUES(13, 2, 'payment', 'Zwrot, druga rata',    73,       '2017-07-24')
INSERT IGNORE INTO entries VALUES(14, 3, 'payment', 'Zwrot, pierwsza rata', 40,       '2017-07-22')
