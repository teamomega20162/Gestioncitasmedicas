create table usuarios(
	
	documento int not null primary key,
        tipoDocumento varchar(5) not null,
	nombres varchar(40) not null,
	apellidos varchar(40) not null,
	genero varchar(5) not null,
	fechaNacimiento date not null,
	direccion varchar(40) not null,
	correo varchar(40) not null,
	telefono varchar(40) not null,
	celular varchar(40) not null,
	clave varchar(20) not null,
        eps varchar(20) not null,
	tipoUsuario varchar(15) not null);

create table agenda(
        
        IdAgenda int not null auto_increment primary key,
        NombreAgenda varchar(30) not null,
        FechaInicio date not null,
        FechaFin date not null);

create table cita(
        
        IdCita int not null auto_increment primary key,
        documento int not null,
        IdAgenda int not null,
        Especialidad varchar(20) not null,
        FechaCia date not null,
        HoraInicio time not null,
        HoraFin time not null,
        NombreDoctor varchar(20) not null,
        foreign key (IdAgenda) references agenda(idAgenda)on delete cascade on update cascade);
        
