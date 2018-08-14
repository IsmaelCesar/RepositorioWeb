
use iobras;

insert into user  (conf_senha,email, endereco,engenheiro,name,numCrea,senha,telefone) values
(1,'123','viviane.araujo@email.com','endereço 1',true,'Viviane Araujo','111111111-1','123','3333-3333'),
(2,'321','ismael.cesar@email.com','endereço 2',false,'Ismael Cesar','321','222222222-2','321','4444-4444'),
(3,'313','fulano.detal@email.com','endereço 3',false,'Fulando de tal','313','333333333-3','313','5555-5555'),
(4,'444','cicrano.decoisa@email.com','endereço 4',true,'Cicrano de coisa','444444444-4','444','7777-7777');




insert into obra ( descricao,imagem,nome,numero_crea,piscina,status,user_id) values
(1,'descricao 1','https://picsum.photos/200/300?image=1058','obra 1','444444444-4',true,'em progresso',4),
(2,'descricao 2','https://picsum.photos/200/300?image=1058','obra 2','111111111-1',true,'em progresso',1);



select * from revestimento;
#select * from edificio;
#select * from obra;
#select * from user;
insert into alvenaria values
#Edf 1
(1,31,1123,500,200,121,10),
	#Andar1 e 2
    (2,31,1123,500,200,121,10),
    (3,31,1123,500,200,121,10),
#Edf 2
(4,31,1123,500,200,121,10),
	#Andar1 e 2
    (5,31,1123,500,200,121,10),
    (6,31,1123,500,200,121,10),
#Edf 3
(7,31,1123,500,200,121,10),
	#Andar1 e 2
    (8,31,1123,500,200,121,10),
    (9,31,1123,500,200,121,10),
#Edf 4
(10,31,1123,500,200,121,10),
	#Andar1 e 2
    (11,31,1123,500,200,121,10),
    (12,31,1123,500,200,121,10);
    
insert into eletrica values
#Edf 1
(1,31,1123,500,200),
	#Andar1 e 2
    (2,31,1123,500,200),
    (3,31,1123,500,200),	
#Edf 2
(4,31,1123,500,200),
	#Andar1 e 2
    (5,31,1123,500,200),
    (6,31,1123,500,200),
#Edf 3
(7,31,1123,500,200),
	#Andar1 e 2
    (8,31,1123,500,200),
    (9,31,1123,500,200),
#Edf 4
(10,31,1123,500,200),
	#Andar1 e 2
    (11,31,1123,500,200),
    (12,31,1123,500,200);
    
insert into hidraulica values
#Edf 1
(1,31,1123,500,200),
	#Andar1 e 2
    (2,31,1123,500,200),
    (3,31,1123,500,200),
#Edf 2
(4,31,1123,500,200),
	#Andar1 e 2
    (5,31,1123,500,200),
    (6,31,1123,500,200),
#Edf 3
(7,31,1123,500,200),
	#Andar1 e 2
    (8,31,1123,500,200),
    (9,31,1123,500,200),
#Edf 4
(10,31,1123,500,200),
	#Andar1 e 2
    (11,31,1123,500,200),
    (12,31,1123,500,200);
    
insert into revestimento values
#Edf 1
(1,31,1123,500,200,121,10),
	#Andar1 e 2
    (2,31,1123,500,200,121,10),
    (3,31,1123,500,200,121,10),
#Edf 2
(4,31,1123,500,200,121,10),
	#Andar1 e 2
    (5,31,1123,500,200,121,10),
    (6,31,1123,500,200,121,10),
#Edf 3
(7,31,1123,500,200,121,10),
	#Andar1 e 2
    (8,31,1123,500,200,121,10),
    (9,31,1123,500,200,121,10),
#Edf 4
(10,31,1123,500,200,121,10),
	#Andar1 e 2
    (11,31,1123,500,200,121,10),
    (12,31,1123,500,200,121,10);

select * from edificio;

insert into edificio values
#Edificios obra 1
(1,'empresa 1','edificio 1 obra 1','em progresso','tipo 1',1,1,1,1,1),
(2,'empresa 2','edificio 2 obra 1','em progresso','tipo 2',4,4,4,4,4),
#edificios obra 2
(3,'empresa 3','edificio 1 obra 2','em progresso','tipo 1',7,7,7,7,7),
(4,'empresa 3','edificio 2 obra 2','em progresso','tipo 1',10,10,10,10,10);

select * from andar;
insert into andar values
#EDF 1
(1,1,15,0,2,1,2,2,2),
(2,2,15,0,3,1,3,3,3),
#EDF 2
(3,1,15,0,5,2,5,5,5),
(4,2,15,0,6,2,6,6,6),
#EDF 3
(5,1,15,0,8,3,8,8,8),
(6,2,15,0,9,3,9,9,9),
#EDF 4
(7,1,15,0,11,4,11,11,11),
(8,2,15,0,12,4,12,12,12);
