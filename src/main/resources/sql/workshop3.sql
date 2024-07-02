create
database workshop3
    character set utf8mb4
    collate utf8mb4_unicode_ci;

CREATE TABLE `users`
(
    id     int                                    NOT NULL AUTO_INCREMENT,
    email  varchar(255) COLLATE utf8_polish_ci NOT NULL,
    userName varchar(255) COLLATE utf8_polish_ci NOT NULL,
    password varchar(255) COLLATE utf8_polish_ci NOT NULL,
    PRIMARY KEY (id)

);
USE workshop3;

INSERT INTO users (email, userName, password) VALUES
                                                      ('user1@example.com', 'user1', 'password1'),
                                                      ('user2@example.com', 'user2', 'password2'),
                                                      ('user3@example.com', 'user3', 'password3'),
                                                      ('user4@example.com', 'user4', 'password4'),
                                                      ('user5@example.com', 'user5', 'password5'),
                                                      ('user6@example.com', 'user6', 'password6'),
                                                      ('user7@example.com', 'user7', 'password7'),
                                                      ('user8@example.com', 'user8', 'password8'),
                                                      ('user9@example.com', 'user9', 'password9'),
                                                      ('user10@example.com', 'user10', 'password10'),
                                                      ('user11@example.com', 'user11', 'password11'),
                                                      ('user12@example.com', 'user12', 'password12'),
                                                      ('user13@example.com', 'user13', 'password13'),
                                                      ('user14@example.com', 'user14', 'password14'),
                                                      ('user15@example.com', 'user15', 'password15'),
                                                      ('user16@example.com', 'user16', 'password16'),
                                                      ('user17@example.com', 'user17', 'password17'),
                                                      ('user18@example.com', 'user18', 'password18'),
                                                      ('user19@example.com', 'user19', 'password19'),
                                                      ('user20@example.com', 'user20', 'password20'),
                                                      ('user21@example.com', 'user21', 'password21'),
                                                      ('user22@example.com', 'user22', 'password22'),
                                                      ('user23@example.com', 'user23', 'password23'),
                                                      ('user24@example.com', 'user24', 'password24'),
                                                      ('user25@example.com', 'user25', 'password25'),
                                                      ('user26@example.com', 'user26', 'password26'),
                                                      ('user27@example.com', 'user27', 'password27'),
                                                      ('user28@example.com', 'user28', 'password28'),
                                                      ('user29@example.com', 'user29', 'password29'),
                                                      ('user30@example.com', 'user30', 'password30'),
                                                      ('user31@example.com', 'user31', 'password31'),
                                                      ('user32@example.com', 'user32', 'password32'),
                                                      ('user33@example.com', 'user33', 'password33'),
                                                      ('user34@example.com', 'user34', 'password34'),
                                                      ('user35@example.com', 'user35', 'password35'),
                                                      ('user36@example.com', 'user36', 'password36'),
                                                      ('user37@example.com', 'user37', 'password37'),
                                                      ('user38@example.com', 'user38', 'password38'),
                                                      ('user39@example.com', 'user39', 'password39'),
                                                      ('user40@example.com', 'user40', 'password40'),
                                                      ('user41@example.com', 'user41', 'password41'),
                                                      ('user42@example.com', 'user42', 'password42'),
                                                      ('user43@example.com', 'user43', 'password43'),
                                                      ('user44@example.com', 'user44', 'password44'),
                                                      ('user45@example.com', 'user45', 'password45'),
                                                      ('user46@example.com', 'user46', 'password46'),
                                                      ('user47@example.com', 'user47', 'password47'),
                                                      ('user48@example.com', 'user48', 'password48'),
                                                      ('user49@example.com', 'user49', 'password49'),
                                                      ('user50@example.com', 'user50', 'password50'),
                                                      ('user51@example.com', 'user51', 'password51'),
                                                      ('user52@example.com', 'user52', 'password52'),
                                                      ('user53@example.com', 'user53', 'password53'),
                                                      ('user54@example.com', 'user54', 'password54'),
                                                      ('user55@example.com', 'user55', 'password55'),
                                                      ('user56@example.com', 'user56', 'password56'),
                                                      ('user57@example.com', 'user57', 'password57'),
                                                      ('user58@example.com', 'user58', 'password58'),
                                                      ('user59@example.com', 'user59', 'password59'),
                                                      ('user60@example.com', 'user60', 'password60'),
                                                      ('user61@example.com', 'user61', 'password61'),
                                                      ('user62@example.com', 'user62', 'password62'),
                                                      ('user63@example.com', 'user63', 'password63'),
                                                      ('user64@example.com', 'user64', 'password64'),
                                                      ('user65@example.com', 'user65', 'password65'),
                                                      ('user66@example.com', 'user66', 'password66'),
                                                      ('user67@example.com', 'user67', 'password67'),
                                                      ('user68@example.com', 'user68', 'password68'),
                                                      ('user69@example.com', 'user69', 'password69'),
                                                      ('user70@example.com', 'user70', 'password70'),
                                                      ('user71@example.com', 'user71', 'password71'),
                                                      ('user72@example.com', 'user72', 'password72'),
                                                      ('user73@example.com', 'user73', 'password73'),
                                                      ('user74@example.com', 'user74', 'password74'),
                                                      ('user75@example.com', 'user75', 'password75'),
                                                      ('user76@example.com', 'user76', 'password76'),
                                                      ('user77@example.com', 'user77', 'password77'),
                                                      ('user78@example.com', 'user78', 'password78'),
                                                      ('user79@example.com', 'user79', 'password79'),
                                                      ('user80@example.com', 'user80', 'password80'),
                                                      ('user81@example.com', 'user81', 'password81'),
                                                      ('user82@example.com', 'user82', 'password82'),
                                                      ('user83@example.com', 'user83', 'password83'),
                                                      ('user84@example.com', 'user84', 'password84'),
                                                      ('user85@example.com', 'user85', 'password85'),
                                                      ('user86@example.com', 'user86', 'password86'),
                                                      ('user87@example.com', 'user87', 'password87'),
                                                      ('user88@example.com', 'user88', 'password88'),
                                                      ('user89@example.com', 'user89', 'password89'),
                                                      ('user90@example.com', 'user90', 'password90'),
                                                      ('user91@example.com', 'user91', 'password91'),
                                                      ('user92@example.com', 'user92', 'password92'),
                                                      ('user93@example.com', 'user93', 'password93'),
                                                      ('user94@example.com', 'user94', 'password94'),
                                                      ('user95@example.com', 'user95', 'password95'),
                                                      ('user96@example.com', 'user96', 'password96'),
                                                      ('user97@example.com', 'user97', 'password97'),
                                                      ('user98@example.com', 'user98', 'password98'),
                                                      ('user99@example.com', 'user99', 'password99'),
                                                      ('user100@example.com', 'user100', 'password100');


