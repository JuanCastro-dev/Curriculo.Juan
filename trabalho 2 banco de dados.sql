Juan Castro Mendonça de Oliveira

#1
CREATE TABLE Departamento(
    codigo_dpt INT PRIMARY KEY,
	nome_dpt VARCHAR(30)
);

CREATE TABLE Professor(
    matricula_prof INT PRIMARY KEY,
	nome_prof VARCHAR(15),
	sobrenome_prof VARCHAR(15),
	formacao_prof VARCHAR(15),
	departamento_prof INT,
	CONSTRAINT fk_dept_prof 
	  FOREIGN KEY (departamento_prof) 
	    REFERENCES Departamento(codigo_dpt)
);

CREATE TABLE Disciplina(
    codigo_disc INT PRIMARY KEY,
	nome_disc VARCHAR(15),
	carga_horaria_disc INTERVAL,
	num_alunos INT,
	descricao VARCHAR(50),
	departamento_disc INT,
	CONSTRAINT fk_disc_dept
	   FOREIGN KEY (departamento_disc)
	     REFERENCES Departamento (codigo_dpt)
);




CREATE TABLE ProfDisp (
    cod_professor INT,
	cod_disciplina INT,
	CONSTRAINT fk_professor 
	  FOREIGN KEY (cod_professor)
	    REFERENCES Professor (matricula_prof),
	CONSTRAINT fk_disciplina
	  FOREIGN KEY (cod_disciplina)
	    REFERENCES Disciplina (codigo_disc)
);


CREATE TABLE Curso (
    codigo_curso INT PRIMARY KEY,
	nome_curso VARCHAR(20),
	dept_curso INT,
	CONSTRAINT fk_departamento_curso
	  FOREIGN KEY (dept_curso)
	    REFERENCES Departamento (codigo_dpt)
);

CREATE TABLE CursoDisp(
    cod_curso INT,
	cod_disp INT,
	CONSTRAINT fk_CursoDisp_Curso
	  FOREIGN KEY (cod_curso)
	    REFERENCES Curso(codigo_curso),
	CONSTRAINT fk_CursoDisp_Disciplina
	  FOREIGN KEY (cod_disp)
	    REFERENCES Disciplina (codigo_disc)
);



CREATE TABLE Turma(
    codigo_turma INT PRIMARY KEY,
	numeros_alunos INT,
	data_inicio DATE,
	data_fim DATE,
	periodo VARCHAR(15),
	curso_turma INT,
	CONSTRAINT fk_curso_turma
	  FOREIGN KEY (Curso_turma)
	    REFERENCES Curso(codigo_curso)
);



CREATE TABLE Aluno(
    matricula_aluno INT PRIMARY KEY,
	nome VARCHAR(20),
	sobrenome VARCHAR(20),
	rua VARCHAR(15),
	bairro VARCHAR(15),
	CEP VARCHAR(30),
	telefone VARCHAR(30),
	CPF VARCHAR(30),
	sexo VARCHAR(10),
	filiação VARCHAR(70)
);



CREATE TABLE AlunoTurma(
    cod_aluno INT,
	cod_turma INT,
	CONSTRAINT fk_alunoturma_aluno
	  FOREIGN KEY (cod_aluno)
	    REFERENCES Aluno(matricula_aluno),
	CONSTRAINT fk_alunoturma_turma
	  FOREIGN KEY (cod_turma)
	    REFERENCES Turma(codigo_turma)
);

CREATE TABLE Historico(
    aluno INT NOT NULL,
	disciplina INT NOT NULL,
	periodo_realizacao VARCHAR(7),
	frequencia FLOAT,
	nota FLOAT,
	CONSTRAINT fk_hist_aluno
	  FOREIGN KEY (aluno)
	    REFERENCES Aluno(matricula_aluno),
	CONSTRAINT fk_hist_disp
	  FOREIGN KEY (disciplina)
	    REFERENCES Disciplina(codigo_disc)
);                                                                                                                                                                                                                                                                               




INSERT INTO Departamento VALUES (1,'Saude');
INSERT INTO Departamento VALUES (2,'T.I.');
INSERT INTO Departamento VALUES (3,'Direito');
INSERT INTO Departamento VALUES (4,'Geral');

#2
INSERT INTO Curso VALUES (1,'Enfermagem',1);
INSERT INTO Curso VALUES (2,'ADS',2);
INSERT INTO Curso VALUES (3,'Direito',3);

#3
INSERT INTO Disciplina VALUES (1,'Anatomia humana','60:00:00',30,'estuda a estrutura e a forma do corpo humano',1);
INSERT INTO Disciplina VALUES (2,'Etica','30:00:00',28,'valores basicos para convivencia',3);
INSERT INTO Disciplina VALUES (3,'Banco de dados','60:00:00',38,'projetar, gerenciar e implementar bancos de dados',2);
INSERT INTO Disciplina VALUES (4,'Calculo I','70:00:00',33,'estuda as funções de uma variável real',4);
INSERT INTO Disciplina VALUES (5,'Dir. Constit.','60:00:00',30,'estuda as normas constitucionais de um país',3);

#4
INSERT INTO Aluno VALUES (1,'Paulo','Pereira','520','Bela Vista','75866320','67866554826','05687785230','Masculino','Renato Pereira e Gerusa da Silva');
INSERT INTO Aluno VALUES (2,'Caio','Silva','5 de janeiro','Bom jesus','78966320','62989556666','47895962500','Masculino','maicon silva e maria brito');
INSERT INTO Aluno VALUES (3,'Maria','Venica','palmeiras','PED','75862456','61959996666','78236962500','Feminino','andre carlos e aparecida venica');
INSERT INTO Aluno VALUES (4,'Pedro','Carlo','7N 51','Pontes tortas','73654820','6195555555','456821365970','Masculino','Mario Aparecido e Fatima Bonfim');
INSERT INTO Aluno VALUES (5,'Carla','Pereira','Getulio','Castelo','754865752','61955778866','123698596412','Feminino','Carlos Augusto e Natalia Pereira');

#5
INSERT INTO Turma VALUES (1,30,'2024-06-01','2029-06-01','Matutino',1);
INSERT INTO Turma VALUES (2,35,'2023-01-01','2025-01-01','Noturno',2);
INSERT INTO Turma VALUES (3,28,'2024-01-01','2028-01-01','Matutino',3);

INSERT INTO CursoDisp VALUES (1,1);
INSERT INTO CursoDisp VALUES (1,2);
INSERT INTO CursoDisp VALUES (1,4);
INSERT INTO CursoDisp VALUES (2,2);
INSERT INTO CursoDisp VALUES (2,3);
INSERT INTO CursoDisp VALUES (2,4);
INSERT INTO CursoDisp VALUES (3,2);
INSERT INTO CursoDisp VALUES (3,5);

INSERT INTO AlunoTurma VALUES (1,3);
INSERT INTO AlunoTurma VALUES (2,2);
INSERT INTO AlunoTurma VALUES (3,1);
INSERT INTO AlunoTurma VALUES (4,2);
INSERT INTO AlunoTurma VALUES (5,1);

INSERT INTO Professor VALUES (1,'Marcio','Sobral','ADS',2);
INSERT INTO Professor VALUES (2,'Mara','Castilho','Direito',3);
INSERT INTO Professor VALUES (3,'Enandir','Amaral','Matematica',4);

INSERT INTO ProfDisp VALUES (1,3);
INSERT INTO ProfDisp VALUES (2,5);
INSERT INTO ProfDisp VALUES (3,4);

INSERT INTO Historico VALUES (2,4,'2024 2',89.8,90.5);
INSERT INTO Historico VALUES (2,3,'2023 2',77.5,89.5); 
INSERT INTO Historico VALUES (4,3,'2024 1',80.0,80.5); 
INSERT INTO Historico VALUES (3,1,'2024 2',81.2,71.0); 
INSERT INTO Historico VALUES (3,2,'2024 1',78.6,65.5); 
INSERT INTO Historico VALUES (1,5,'2023 1',100.0,80.0); 
INSERT INTO Historico VALUES (5,2,'2024 2',95.8,90.0); 

#6
SELECT p.nome_disc 
FROM Disciplina d, CursoDisp c
WHERE c.Cod_disp = d.codigo_disc AND c.cod_curso = 1

#7
SELECT codigo_turma
FROM Turma t, Aluno a, AlunoTurma i
WHERE a.sobrenome = 'Silva' AND t.codigo_turma = i.cod_turma AND a.matricula_aluno = cod_aluno

#8
SELECT codigo_turma
FROM Turma
WHERE curso_turma = 2

#9
SELECT nome_prof, sobrenome_prof
FROM Professor p, Disciplina d, ProfDisp f
WHERE f.cod_professor = p.matricula_prof AND f.cod_disciplina = 3 AND f.cod_disciplina = d.codigo_disc

#10
SELECT num_alunos
FROM Disciplina
WHERE codigo_disc = 3

#11
SELECT MAX (nota) AS maior_nota
FROM Historico
WHERE disciplina = 3