DevOps Aula 6

Caminho do Feedback

Criamos um repositório no github com um commit inicial que possuia o código base para o nosso projeto.
No início, cada um criou uma branch e começou a desenvolver a sua tarefa. Nos merges dessas branchs com a master,
abriamos um pull request que era avaliado por outra pessoa. Após aprovada a request, era iniciado um pipeline que 
executava um script com comandos Clean Package do maven e buildava o projeto. O merge era aprovado mesmo se 
a pipeline era executada com sucesso, então seria mais recomendado executar a pipeline antes e depois do merge para 
garantir um bom feedback. 
A cooperação do time também funcionou como um feedback, nós nos ajudavamos durante o desenvolvimento e isso acelerou o processo.
