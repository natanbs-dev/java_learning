# Teste de códigos

## Implementar:
> dados o contexto, foi adicionado alguns trechos para
> possam, de fato, serem implementados a em um futuro próximo

**Implementar este código ao original:**

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();
    
            System.out.print("Quantos nomes você deseja adicionar ao ArrayList? ");
            int numNames = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente
    
            for (int i = 0; i < numNames; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                String name = scanner.nextLine();
                arrayList.add(name);
            }
    
            System.out.println("Nomes inseridos no ArrayList:");
            for (String name : arrayList) {
                System.out.println(name);
            }
    
            // Não se esqueça de fechar o Scanner quando não for mais necessário.
            scanner.close();

## Teste: