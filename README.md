# projeto-so
Dupla: Diego Cerqueira e Jacob Santana <br>
A solução encontrada foi utilizar uma variável (em_uso) para  informar às outras Threads que a região crítica já está sendo acessada.
Quando uma thread estiver acessando a região crítica, ela muda o “em_uso” para 1, quando terminar de acessar a região crítica ela define o “em_uso” para zero novamente, assim liberando o acesso para outra thread
