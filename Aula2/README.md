1) Vector

    O Vector é uma classe que armazena dados em forma de lista que cresce de acordo com o necessário. Sua estrutura é familiar a de um vetor, onde cada novo registro é adicionado ao fim da lista, e é possível identificar cada um pelo seu índice no array. Seus métodos são similares a de um ArrayList, com adição (add), remoção (remove), substituição (set), e tamanho do Vector (size). A utilização do Vector é similar a de um ArrayList, podendo ser utilizado em situações de listas de notas, histórico, dentre outras.

2) ArrayList

    O ArrayList é uma forma de listagem de objetos ilimitados não primitivos. Ele deve ser importado para ser implementado. Com isso, cada posição é armazenada no fim da lista com uma informação do mesmo tipo. Ele possui métodos próprios que auxiliam na adição (add()), remoção (remove()), substituição (set()), verificar se contém um objeto (contains()) e verificação do tamanho/número de elementos na lista (size()). Ele é bastante utilizado na criação de listas com nomes, catálogo, entre outros.


3) LinkedList

    A LinkedList é uma lista que, diferentemente das outras, é normalmente associado com o método Queue que utiliza como base o princípio do FIFO (First-In-First-Out) em que o primeiro item a ser adicionado será o primeiro a ser retirado, caso exista um comando. Ela apresenta funcionalidades específicas para situações que requerem uma lista ou filas. Por exemplo, possuem métodos como add(), para adicionar elementos, remove(), para eliminar o dado na primeira posição, e peek(), que permite visualizar o primeiro elemento sem removê-lo. A LinkedList é frequentemente empregada em contextos que envolvem ordem de chegada, como sistemas de agendamento, filas para acesso a locais ou execução de determinadas ações, etc.

4) HashMap

    O HashMap é uma lista que recebe além de um valor uma chave para identificá-lo e retorná-lo (HashMap ,key, value). As chaves estão ligadas aos valores, onde um valor pode ter diversas chaves, porém uma chave pode conter apenas um valor. Diferentemente do ArrayList, o HashMap não ordena seus valores, já que são representados por chaves. O termo CRUDL está relacionado ao HashMap pois ele relata o que pode ser realizado como: criar (put(key, value)), ler (get(key)), atualizar (put(key, newValue)), excluir (remove(key)) e listar (keySet() ou values()). O HashMap pode ser utilizado em situações de agenda, dicionário, usuários, entre outros.