Aluno: Yan de Paiva Andrade Pinto
Matricula: 201476038
Senario: Site feito para gerenciar as mesas do restaurante Comida deVó, possibilitando o usuario adicionar novas mesas, excluir
mesas existentes, e adicionar pedidos vinculados a uma determinada mesa. Alem de registrar o momento de abertura de mesa e
o momento em que o usuario paga a conta.
Uma mesa uma vez aberta, ela não pode ser excluida enquanto houver uma conta para ser paga.
Uma conta não poderá ser paga, enquanto não houver uma mesa vinculada a ela.

Uma mesa é composta por pelos seguintes campos: ID, hora de abertura, hora de fechamento, status(onde se verifica se a mesa
esta ou não aberta), e um ArrayList de Itens, que compoem o pedido referente a mesa.

Um restaurante é composto apénas por um ArrayList de Mesas.

E um item é composto por Preço, descrição do produto, nome, codigoDoProduto, e quantidade.

Alem disso, existem 2 classes auxiliares para facilitar as transações.

As classes estoque e pedido.
