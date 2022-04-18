# projeto-jedi-inc
Projeto aplicação hipotética Jedi Inc usando Angular para o Front-End e Spring para o Back-End e MySQL para o BD.

As portas 8080 e 4200 são utilizadas nessa aplicação, tenha certeza que elas não estejam sendo usadas.

Como a aplicação utiliza Angular é necessario ter o NodeJS e o NPM instaldos,  https://nodejs.org.
Instale os pacotes npm necessarios executando o comando 'npm install' na pasta raiz do crud angular.

No BackEnd é utilizado o programa XAMPP para iniciar o banco MySql, https://www.apachefriends.org/pt_br/index.html.
A versão do Java mais recente é recomendada para rodar a aplicação.
É necessario ter o Maven instalado e configurado na variavel de ambiente local.
Pelo terminal é possivel utilizar o comando 'mvn spring-boot:run' para executar a aplicação do BackEnd.

Pelo terminal, na pasta raiz do crud angular o comando 'npm run start' compila e inicia a aplicação que é então acessivel pela url 'localhost:4200'

a url 'localhost:4200/projetos' mostra todos as entidades adicionas no banco.
só é possivel adicionar e deletar entidades por meio de requisições post e delete diretamente na aplicação de backend.
postman é uma possivel solução ao se usar a url 'localhost:8080' para verificar o funcionamento da aplicação backend utilizando requisições http.
não é possivel acessar a pagina de criação pelo frontend.
não é possive simular investimentos.
as informações de data são em formato yyyy-MM-dd.
não é possivel adicionar participantes na entidade do banco.
