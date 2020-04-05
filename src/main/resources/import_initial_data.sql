INSERT INTO USER_PROFILE(type) VALUES ('ADMIN');
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email) VALUES ('admin','admin', 'admin','admin','admin@admin.com');
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email) VALUES ('jazzs','jazzs', 'jazzs','jazzs','jazzs@jazzs.com');
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id) SELECT user.id, profile.id FROM app_user user, user_profile profile where user.sso_id='admin' and profile.type='ADMIN';
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id) SELECT user.id, profile.id FROM app_user user, user_profile profile where user.sso_id='jazzs' and profile.type='ADMIN';