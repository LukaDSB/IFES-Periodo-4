-- 1. Selecione o nome dos autores e a quantidade de cada livro que cada um escreveu
select a.codautor, a.nomeautor, COUNT(l.codlivro) as qtLivro
from autor a
join livro l on l.fkautor = a.codautor
group by a.codautor, a.nomeautor
order by qtLivro desc

-- 2. Fa�a um Ranking de os usu�rios que j� realizaram algum empr�stimo, retornando do maior para o menor a quantidade de empr�stimos eu nome dos usu�rios
select u.codusu, u.nome, COUNT(e.codpres)
from usuario u
join emprestimo e on u.codusu = e.fkusuario
group by u.codusu, u.nome
order by 3 desc, 2 asc

-- 3. Altere a tabela usu�rio incluindo uma coluna �idade� tipo inteiro e popule esse campo.
alter table usuario add idade int

-- 4. Selecione o nome dos livros e a m�dia de idade dos usu�rios que leem esses livrosselect l.livro, avg(u.idade)from usuario ujoin emprestimo e on u.codusu = e.fkusuariojoin livro l on l.codlivro = e.fklivrogroup by l.livro-- 5. Selecione o nome dos livros escritos pelo autor Arthur Conan Doyle e a quantidade de vezes que cada um desses livros foi emprestada.select l.livro, count(e.codpres)from emprestimo ejoin livro l on l.codlivro = e.fklivrojoin autor a  on a.codautor = l.fkautorwhere nomeAutor = 'Arthur Conan Doyle'group by l.livro-- 6. Altere a tabela empr�stimo atribuindo um valor (tipo decimal) ao empr�stimo realizado e popule esse campo.