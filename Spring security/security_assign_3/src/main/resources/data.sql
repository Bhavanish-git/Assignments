INSERT INTO users (username , password , enabled)
values ('student' , 'student' , true );

INSERT INTO users (username , password , enabled)
values ('mentor' , 'mentor' , true );

INSERT INTO authorities (username , authority)
values ('student' , 'ROLE_STUDENT');

INSERT INTO authorities (username , authority)
values ('mentor' , 'ROLE_MENTOR');