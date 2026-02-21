public class Teste {
    public static void main(String[] args) {

        var item1 = new ItemCardapio(1L,
                "Refresco do Chaves", "Suco de limão que parece de tamarindo e tem gosto de groselha.", 2.99, 4);
        item1.emPromocao = false;

        var item2 = new ItemCardapio(2L, "Sanduíche de Presunto do Chaves", "Sanduíche de presunto simples, mas feito com muito amor.",3.50, 2);
        item2.definePromocao(2.99);

        System.out.println("---Exercicios aula 06---");
        var item3 = new ItemCardapio(3L,
                "Torta de Frango da Dona Florinda", "Torta de frango com recheio cremoso e massa crocante.", 12.99, 2);
        item3.definePromocao(10.99);

        var item4 = new ItemCardapio(4L,
                "Pipoca do Quico", "Balde de pipoca preparado com carinho pelo Quico.", 4.99,2);
        item4.definePromocao(3.99);

        var item5 = new ItemCardapio(5L,
                "Água de Jamaica", "Água aromatizada com hibisco e toque de açúcar.", 2.50, 4);
        item5.definePromocao(1.99);

        var item6 = new ItemCardapio(6L,
                "Churros do Chaves", "Churros recheados com doce de leite, clássicos e irresistíveis.", 4.99, 3);
        item6.definePromocao(3.99);

        var item7 = new ItemCardapio(7L,
                "Tacos de Carnitas", "Tacos recheados com carne tenra", 25.90, 2);


        System.out.println("Nome: " + item2.nome);
        System.out.println("Em promoção: " + item2.emPromocao );
        System.out.println("Preço com Desconto: " + item2.precoComDesconto);

        if (item2.emPromocao) {
            var porcentagemDesconto = item2.calculaPorcentagemDesconto();
            System.out.println("Porcentagem de desconto: " + String.format("%.2f", porcentagemDesconto) + "%");
            System.out.println("Preco: de " + item2.preco + " por " + item2.precoComDesconto);
        } else {
            System.out.println("Preco: " + item2.preco);
            System.out.println("Item não está em promoção");
        }

//        if (item2.categoria == 1) {
//            System.out.println("Categoria: Entradas");
//        } else if (item2.categoria == 2) {
//            System.out.println("Categoria: Pratos Principais");
//        } else if (item2.categoria == 3) {
//            System.out.println("Categoria: Sobremesas");
//        } else if (item2.categoria == 4) {
//            System.out.println("Categoria: Bebidas");
//        } else {
//            System.out.println("Categoria não encontrada...");
//        }

        System.out.println("-------");
        System.out.println("-------");

        System.out.println("Categoria " + item2.obtemCategoria());

        System.out.println("-------");
        System.out.println("Arrays");

        double[] precos = new double[7];

        precos[0] = 2.99;
        precos[1] = 3.50;
        precos[2] = 12.99;
        precos[3] = 4.99;
        precos[4] = 2.50;
        precos[5] = 4.99;
        precos[6] = 25.90;

        boolean[] emPromocao = {false, true, true, true, true, true, false};

        System.out.println("Preço do Item 3: " + precos[2]);
        System.out.println("Tamanho do array de precos: " + precos.length);
        System.out.println("Tamanho do array emPromocao: " + emPromocao.length);

        System.out.println("O segundo item tem promoção? " + emPromocao[1]);

        double totalDePrecos = 0.0;
        int i = 0;  // inicializacao de uma variavel
        while (i < precos.length) { // comparacap
            // System.out.println("rodou " + i);
            double preco = precos[i];
            totalDePrecos = totalDePrecos + preco;
            i++; // incremento
        }
        System.out.println("Soma dos preços: " + totalDePrecos);

        int totalDeItensEmPromocao = 0;
        int j = emPromocao.length - 1;
        do {
            System.out.println(j);
            if (emPromocao[j]) {
                totalDeItensEmPromocao++;
            }
            j--;
        } while (j >= 0);
        System.out.println("Total de itens em promoção: " + totalDeItensEmPromocao);

        double totalDePrecosComFor = 0.0;
        for (int k = 0; k < precos.length; k++) {
            double preco = precos[k];
            totalDePrecosComFor += preco;
        }
        System.out.println("Soma dos preços (com for): " + totalDePrecosComFor);

        // System.out.println(preco); // nao eh visivel
        System.out.println(i);
        // System.out.println(k); // nao eh visivel

        // forEach
        double totalDePrecosComForEach = 0.0;
        for (double preco : precos) {
            totalDePrecosComForEach += preco;
        }
        System.out.println("Soma dos preços (com for each): " + totalDePrecosComForEach);

        // achar o primeiro preco que eh maior que 10.0
        double precoLimite = 10.0;
        double precoMaiorQueLimite = -1.0;
        for (double preco : precos) {
            if (preco > precoLimite) {
                precoMaiorQueLimite = preco;
                break;
            }
        }
        System.out.println("O primeiro preço que é maior que " + precoLimite + ": " + precoMaiorQueLimite);

        System.out.println("-------");

        // Imprimir todos os precos menores ou iguais ao limite
        for (double preco : precos) {
            if (preco <= precoLimite) {
                System.out.println("Preço menor que " + precoLimite + ": " + preco);
                continue;
            }
            System.out.println("Processamento pesado para: " + preco); // so queria processar para valores maiores que 10.0
        }

        System.out.println("------------------------");
        System.out.println("------------------------");

        ItemCardapio[] itens = {item1, item2, item3, item4, item5, item6, item7};
        System.out.println("--- Lista de itens do cardápio ---");
        for (int idx = 0; idx < itens.length; idx++) {
            ItemCardapio item = itens[idx];
            System.out.println("Nome: " + item.nome);
            System.out.println("Em promoção: " + item.emPromocao);
            if (item.emPromocao && item.precoComDesconto > 0) {
                System.out.println("Preço com Desconto: " + item.precoComDesconto);
            } else {
                System.out.println("Preço: " + item.preco);
            }
            System.out.println("------------------------");
            System.out.println("------------------------");
        }
    }

    static class ItemCardapio {

        // atributos
        long id;
        String nome;
        String descricao;
        boolean emPromocao;
        double preco;
        double precoComDesconto;
        int categoria;

        //construtor
        ItemCardapio(long id, String nome, String descricao,  double preco, int categoria) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
//            this.emPromocao = emPromocao;
            this.preco = preco;
//            this.precoComDesconto = precoComDesconto;
            this.categoria = categoria;
        }

        double calculaPorcentagemDesconto() {
            return (preco - precoComDesconto) / preco * 100.0;
        }

        String obtemCategoria() {
        /*
        categorias

        1 - Entradas
        2 - Pratos Principais
        3 - Sobremesas
        4 - Bebidas
        */
            String nomeCategoria;
            switch (categoria) {
                case 1:
                    nomeCategoria = "Entradas";
                    break;
                case 2:
                    nomeCategoria = "Pratos Principais";
                    break;
                case 3:
                    nomeCategoria = "Sobremesas";
                    break;
                case 4:
                    nomeCategoria = "Bebidas";
                    break;
                default:
                    nomeCategoria = "Categoria não encontrada...";
            }
            return nomeCategoria;
        }

        void definePromocao(double precoComDesconto) {
            emPromocao = true;
            this.precoComDesconto = precoComDesconto;
        }
    }
}
