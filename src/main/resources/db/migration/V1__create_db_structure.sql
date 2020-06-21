create table offices (
    id uuid not null,
    address varchar(255),
    city varchar(255),
    primary key (id)
);

create table projects (
    id uuid not null,
    description varchar(255),
    name varchar(255),
    primary key (id)
);

create table roles (
    id uuid not null,
    code varchar(255),
    name varchar(255),
    primary key (id)
);

create table teams (
    id uuid not null,
    area varchar(255),
    name varchar(255),
    room varchar(255),
    project_id uuid,
    technology_id uuid,
    primary key (id)
);

create table technologies (
    id uuid not null,
    description varchar(255),
    link varchar(255),
    name varchar(255), primary key (id)
);

create table user2role (
    user_id uuid not null,
    role_id uuid not null,
    primary key (user_id, role_id)
);

create table users (
    id uuid not null,
    experience int4,
    first_name varchar(255),
    last_name varchar(255),
    office_id uuid,
    team_id uuid,
    primary key (id)
);

alter table if exists teams
add constraint fk_teams2projects foreign key (project_id) references projects;

alter table if exists teams
add constraint fk_teams2technologies foreign key (technology_id) references technologies;

alter table if exists user2role
add constraint fk_user2role2roles foreign key (role_id) references roles;

alter table if exists user2role
add constraint fk_user2role2users foreign key (user_id) references users;

alter table if exists users
add constraint fk_users2offices foreign key (office_id) references offices;

alter table if exists users
add constraint fk_users2teams foreign key (team_id) references teams;
