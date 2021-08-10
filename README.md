# Bootcamp Orange Talents by Zup

Conteúdo: https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/orange-talent-4  


##  Proposta de solução para o curso: Java e JPA - Persista seus objetos com a JPA2 e Hibernate

Somos muitos alunos e alunas aqui no Bootcamp. Em função de todas as avaliações respondidas, muitos dados são gerados. 
E agora temos alguns desafios para você:

- Dado que todo(a) aluno(a) tem um email (máximo de 30 caracteres),nome (máximo de 30 caracteres) e idade (entre 1 e 100). 
  Como você vai modelar essa classe e configurá-la para que possa ser utilizada pelo Hibernate?

- Dentro do bootcamp temos também um conjunto de avaliações que são respondidas pelas pessoas. 
  Toda avaliação tem um título e uma descrição do que precisa ser feito. 
  Como você vai modelar essa classe e configurá-la para que possa ser utilizada pelo Hibernate?
  
- Cada aluno(a) responde uma ou mais avaliações que chamamos de cognitive walkthrough, ela tem que descrever os passos 
  da solução dela para determinada situação problema. 
  Toda resposta tem um campo aberto para que a pessoa consiga descrever a solução dela. 
  É necessário que toda resposta seja linkada com a pessoa que a respondeu e também com a avaliação relativa àquela resposta. 
  Como você vai modelar essa classe e configurá-la para que possa ser utilizada pelo Hibernate?

- Além de responder sua avaliação, a pessoa também responde um outro formulário onde ela corrige sua resposta em 
  função da resposta de um mentor(a). 
  Essa correção sempre tem uma nota de 1 a 10 e está linkada com a avaliação respondida pela própria pessoa. 
  Como você vai modelar essa classe e configurá-la para que possa ser utilizada pelo Hibernate?

Agora que você modelou e mapeou as classes para que possam ser utilizadas pelo hibernate, temos desafios extras.
- Quais são os passos para salvar para salvar um(a) aluno(a)?  
- Quais são os passos para salvar para salvar uma avaliação?  
- Quais são os passos para salvar a auto correção de um(a) aluno(a)?  
- Caso você precise carregar uma auto correção e tenha que descobrir o nome do(a) aluno(a) que fez, como você faria? 
  Algum ponto de atenção que deveria ter?
- Caso você precise carregar as respostas de um(a) aluno(a) a partir do objeto da classe Aluno, como você faria? 
  Algum ponto de atenção?
